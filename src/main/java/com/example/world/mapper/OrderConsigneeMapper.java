package com.example.world.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.world.pojo.Order;
import com.example.world.pojo.OrderConsignee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderConsigneeMapper extends BaseMapper<OrderConsignee> {
}
