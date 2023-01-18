package com.makeup.service.impl;

import com.makeup.model.MakeupItem;
import com.makeup.repository.MakeupItemRepository;
import com.makeup.service.MakeupItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class MakeUpItemServiceImpl implements MakeupItemService {
    private final MakeupItemRepository makeupItemRepository;
    @Override
    public List<MakeupItem> getAll() {
        return makeupItemRepository.findAll();
    }

    @Override
    public MakeupItem findById(Long makeupItemId) {
        return makeupItemRepository.findById(makeupItemId).orElse(null);
    }
}
