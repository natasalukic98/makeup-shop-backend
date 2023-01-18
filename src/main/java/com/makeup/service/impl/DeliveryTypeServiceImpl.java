package com.makeup.service.impl;

import com.makeup.model.DeliveryType;
import com.makeup.model.MakeupItem;
import com.makeup.repository.DeliveryTypeRepository;
import com.makeup.service.DeliveryTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DeliveryTypeServiceImpl implements DeliveryTypeService {
    private final DeliveryTypeRepository deliveryTypeRepository;
    @Override
    public List<DeliveryType> getAll() {
        return deliveryTypeRepository.findAll();
    }
}
