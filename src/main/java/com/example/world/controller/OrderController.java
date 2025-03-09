package com.example.world.controller;


import com.example.world.dto.OrderDTO;
import com.example.world.sevice.OrderService;
import com.example.world.vo.OrderVO;
import com.example.world.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/getOrderList")
    public Result getOrderList(@RequestBody OrderDTO orderDTO){

        List<OrderVO> orderList=orderService.getOrderList(orderDTO);
        return Result.success(orderList);
    }

    @RequestMapping("/getOrderById")
    public Result getOrderById(@RequestBody OrderDTO orderDTO){
        OrderVO orderVO=orderService.getOrderById(orderDTO);
        return Result.success(orderVO);
    }

    @RequestMapping("/addOrder")
    public Result addOrder(@RequestBody OrderDTO orderDTO){
        boolean result=orderService.addOrder(orderDTO);
        return Result.success(result);
    }

}
