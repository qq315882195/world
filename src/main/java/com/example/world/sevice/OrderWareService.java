package com.example.world.sevice;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.world.mapper.OrderWareMapper;
import com.example.world.pojo.OrderWare;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderWareService extends ServiceImpl<OrderWareMapper, OrderWare> {

    @Resource
    private OrderWareMapper orderWareMapper;
}
