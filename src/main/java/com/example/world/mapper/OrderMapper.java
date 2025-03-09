package com.example.world.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.world.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper  extends BaseMapper<Order> {
}
