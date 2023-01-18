package com.makeup.repository;

import com.makeup.model.MakeupItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MakeupItemRepository extends JpaRepository<MakeupItem, Long> {
}
