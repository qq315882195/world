package com.example.world.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.world.pojo.Order;
import com.example.world.pojo.OrderWare;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderWareMapper extends BaseMapper<OrderWare> {
}
