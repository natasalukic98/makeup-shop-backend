package com.makeup.repository;

import com.makeup.model.DeliveryType;
import com.makeup.model.enums.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeliveryTypeRepository extends JpaRepository<DeliveryType, Long> {

    Optional<DeliveryType> findByDelivery(Delivery delivery);
}
