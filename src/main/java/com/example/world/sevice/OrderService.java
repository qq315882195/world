package com.example.world.sevice;

import com.alibaba.nacos.shaded.com.google.common.collect.Lists;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.world.converter.OrderConverter;
import com.example.world.dto.OrderDTO;
import com.example.world.mapper.OrderMapper;
import com.example.world.pojo.Order;
import com.example.world.vo.OrderVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class OrderService {

    @Resource
    private OrderMapper orderMapper;

    public List<OrderVO> getOrderList(OrderDTO orderDTO) {
        LambdaQueryWrapper<Order> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Order::getStoreId, orderDTO.getStoreId());
        queryWrapper.eq(!StringUtils.isEmpty(orderDTO.getOrderNo()),Order::getOrderNo, orderDTO.getOrderNo());
        queryWrapper.eq(orderDTO.getOrderStatus()!=null,Order::getOrderStatus, orderDTO.getOrderStatus());

        List<Order> orders = orderMapper.selectList(queryWrapper);
        if (CollectionUtils.isEmpty(orders)){
            return null;
        }
        List<OrderVO> orderList = Lists.newArrayList();
        orders.forEach(order -> {
            //转换为OrderVO
            orderList.add(OrderConverter.toVO(order));
        });
        return orderList;
    }

    public OrderVO getOrderById(OrderDTO orderDTO) {
        Order order = orderMapper.selectById(orderDTO.getId());
        return OrderConverter.toVO(order);
    }

    public boolean addOrder(OrderDTO orderDTO) {
        Order order = OrderConverter.toPO(orderDTO);
        int insert = orderMapper.insert(order);
        return insert > 0;
    }
}
