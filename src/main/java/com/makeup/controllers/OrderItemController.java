package com.makeup.controllers;

import com.makeup.model.OrderItem;
import com.makeup.model.User;
import com.makeup.service.OrderItemService;
import com.makeup.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/api/orderItems")

public class OrderItemController {
    private final OrderItemService orderItemService;

    @GetMapping
    public ResponseEntity<List<OrderItem>> findAllOrderItems(){
        return new ResponseEntity<>(orderItemService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity <OrderItem> findOrderItem(@PathVariable Long id) {
        return new ResponseEntity<>(orderItemService.findById(id), HttpStatus.OK);
    }

}
