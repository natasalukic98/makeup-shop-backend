package com.makeup.service;

import com.makeup.model.MakeupItem;
import com.makeup.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User findById (Long userId);

}
