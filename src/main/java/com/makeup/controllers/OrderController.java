package com.makeup.controllers;

import com.makeup.model.Order;
import com.makeup.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping ("/api/orders")
public class OrderController {
    private final OrderService orderService;

    @GetMapping
    public ResponseEntity <List<Order>> findAllOrders() {
        return new ResponseEntity<>(orderService.getAll(), HttpStatus.OK);

    }
    @GetMapping("/{id}")
    public ResponseEntity <Order> findOrder(@PathVariable Long id) {
        return new ResponseEntity<>(orderService.findById(id), HttpStatus.OK);
    }
}
