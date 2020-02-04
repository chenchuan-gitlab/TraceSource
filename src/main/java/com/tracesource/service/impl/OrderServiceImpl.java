package com.tracesource.service.impl;

import com.tracesource.dao.OrderMapper;
import com.tracesource.pojo.Order;
import com.tracesource.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderMapper orderMapper;
    @Override
    public int insertOrder(Order order) {
        return orderMapper.insertOrder(order);
    }

    @Override
    public Order getOrderById(String order_id) {
        return orderMapper.getOrderByID(order_id);
    }

    @Override
    public List<Order> getOrders(Map<String,Object> paramsMap) {
        return orderMapper.getOrders(paramsMap);
    }
}
