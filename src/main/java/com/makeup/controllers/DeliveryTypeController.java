package com.makeup.controllers;

import com.makeup.model.DeliveryType;
import com.makeup.model.User;
import com.makeup.service.DeliveryTypeService;
import com.makeup.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/api/deliveryType")


public class DeliveryTypeController {
    private final DeliveryTypeService deliveryTypeService;

    @GetMapping
    public ResponseEntity<List<DeliveryType>> findAllDeliveryTypes(){
        return new ResponseEntity<>(deliveryTypeService.getAll(), HttpStatus.OK);
    }


}
