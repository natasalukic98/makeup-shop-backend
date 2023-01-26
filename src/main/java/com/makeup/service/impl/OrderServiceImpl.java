package com.makeup.service.impl;

import com.makeup.model.Order;
import com.makeup.model.User;
import com.makeup.repository.DeliveryTypeRepository;
import com.makeup.repository.OrderRepository;
import com.makeup.repository.UserRepository;
import com.makeup.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final DeliveryTypeRepository deliveryTypeRepository;

    private final UserRepository userRepository;

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    @Override
    public Order createOrder(Order order) {

        order.setUser(getUser(order));
        order.setDeliveryType(deliveryTypeRepository.findByDelivery(order.getDeliveryType().getDelivery()).get());
        order.setSum(calculateSum(order));
        order.setDate(new Date());
        return orderRepository.save(order);

    }

    private double calculateSum(Order order) {
        return order.getOrderItems().stream().mapToDouble(orderItem ->orderItem.getAmount()*orderItem.getMakeupItem().getPrice()).sum();
    }

    private User getUser(Order order){
        return userRepository.findByEmail(order.getUser().getEmail()).orElse( userRepository.save(order.getUser()));
    }

}
