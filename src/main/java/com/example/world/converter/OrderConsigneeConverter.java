package com.example.world.converter;


import com.example.world.dto.OrderConsigneeDTO;
import com.example.world.dto.OrderConsigneeMessageDTO;
import com.example.world.dto.OrderDTO;
import com.example.world.dto.OrderMessageDTO;
import com.example.world.pojo.Order;
import com.example.world.pojo.OrderConsignee;
import com.example.world.vo.OrderConsigneeVO;
import com.example.world.vo.OrderVO;

public class OrderConsigneeConverter {

    /**
     * DTO转换成POJO
     */
    public static OrderConsignee toPO(OrderConsigneeDTO orderConsigneeDTO) {
        OrderConsignee orderConsignee = new OrderConsignee();
        orderConsignee.setOrderNo(orderConsigneeDTO.getOrderNo());
        orderConsignee.setAddress(orderConsigneeDTO.getAddress());
        orderConsignee.setName(orderConsigneeDTO.getName());
        orderConsignee.setPhone(orderConsigneeDTO.getPhone());
        orderConsignee.setStoreId(orderConsigneeDTO.getStoreId());
        return orderConsignee;
    }

    public static OrderConsigneeVO toVO(OrderConsignee orderConsignee) {
        OrderConsigneeVO orderConsigneeVO = new OrderConsigneeVO();
        orderConsigneeVO.setOrderNo(orderConsignee.getOrderNo());
        orderConsigneeVO.setAddress(orderConsignee.getAddress());
        orderConsigneeVO.setName(orderConsignee.getName());
        orderConsigneeVO.setPhone(orderConsignee.getPhone());
        orderConsigneeVO.setId(orderConsignee.getId());
        orderConsigneeVO.setStoreId(orderConsignee.getStoreId());
        orderConsigneeVO.setCreated(orderConsignee.getCreated());
        orderConsigneeVO.setUpdated(orderConsignee.getUpdated());
        return orderConsigneeVO;
    }

    public static OrderConsigneeMessageDTO toMessageDTO(OrderConsignee orderConsignee) {
        OrderConsigneeMessageDTO orderConsigneeMessageDTO = new OrderConsigneeMessageDTO();
        orderConsigneeMessageDTO.setOrderNo(orderConsignee.getOrderNo());
        orderConsigneeMessageDTO.setAddress(orderConsignee.getAddress());
        orderConsigneeMessageDTO.setName(orderConsignee.getName());
        orderConsigneeMessageDTO.setPhone(orderConsignee.getPhone());
        orderConsigneeMessageDTO.setId(orderConsignee.getId());
        orderConsigneeMessageDTO.setStoreId(orderConsignee.getStoreId());
        orderConsigneeMessageDTO.setCreated(orderConsignee.getCreated());
        orderConsigneeMessageDTO.setUpdated(orderConsignee.getUpdated());
        return orderConsigneeMessageDTO;
    }
}
