package com.makeup.service;

import com.makeup.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAll();
    Order findById (Long orderId);

}
