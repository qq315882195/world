package com.example.world.sevice;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.world.mapper.OrderConsigneeMapper;
import com.example.world.pojo.OrderConsignee;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class OrderConsigneeService extends ServiceImpl<OrderConsigneeMapper, OrderConsignee> {
    @Resource
    private OrderConsigneeMapper orderConsigneeMapper;
}
