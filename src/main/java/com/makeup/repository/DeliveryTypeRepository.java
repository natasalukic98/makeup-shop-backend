package com.makeup.repository;

import com.makeup.model.DeliveryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DeliveryTypeRepository extends JpaRepository<DeliveryType, Long> {
}
