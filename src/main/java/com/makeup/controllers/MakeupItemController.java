package com.makeup.controllers;

import com.makeup.model.MakeupItem;
import com.makeup.model.Order;
import com.makeup.service.MakeupItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/api/makeupItems")

public class MakeupItemController {
    private final MakeupItemService makeupItemService;

    @GetMapping
    public ResponseEntity<List<MakeupItem>>findAllMakeupItems(){
        return new ResponseEntity<>(makeupItemService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity <MakeupItem> findMakeupItem(@PathVariable Long id) {
        return new ResponseEntity<>(makeupItemService.findById(id), HttpStatus.OK);
    }
}
