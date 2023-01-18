package com.makeup.service;

import com.makeup.model.OrderItem;
import java.util.List;

public interface OrderItemService {
    List<OrderItem> getAll();
    OrderItem findById (Long orderItemId);

}
