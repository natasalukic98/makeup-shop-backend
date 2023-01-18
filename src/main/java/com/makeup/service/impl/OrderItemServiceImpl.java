package com.makeup.service.impl;

import com.makeup.model.OrderItem;
import com.makeup.repository.OrderItemRepository;
import com.makeup.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {
    private final OrderItemRepository orderItemRepository;
    @Override
    public List<OrderItem> getAll() {
        return orderItemRepository.findAll();
    }

    @Override
    public OrderItem findById(Long orderItemId) {
        return orderItemRepository.findById(orderItemId).orElse(null);
    }
}
