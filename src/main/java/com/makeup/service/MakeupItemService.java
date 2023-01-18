package com.makeup.service;

import com.makeup.model.MakeupItem;
import com.makeup.model.Order;

import java.util.List;

public interface MakeupItemService {
    List<MakeupItem> getAll();
    MakeupItem findById (Long makeupItemId);

}
