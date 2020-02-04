package com.tracesource.service;

import com.tracesource.pojo.Order;

import java.util.List;
import java.util.Map;

/**
 * Created by chenchuan on 2019-04-17.
 */
public interface OrderService {
    int insertOrder(Order order);

    Order getOrderById(String order_id);

    List<Order> getOrders(Map<String,Object> paramsMap);
}
