package com.example.world.converter;


import com.example.world.dto.OrderDTO;
import com.example.world.pojo.Order;
import com.example.world.vo.OrderVO;

public class OrderConverter {

    /**
     * DTO转换成POJO
     */
    public static Order toPO(OrderDTO orderDTO) {
        Order order = new Order();

        return order;
    }

    /**
     * POJO转换成VO
     */
    public static OrderVO toVO(Order order) {
        OrderVO orderVO = new OrderVO();

        return orderVO;
    }
}
