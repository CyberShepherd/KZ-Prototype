package com.cybershepherd.KZPrototype.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentOrderRepository extends JpaRepository<RentOrder, Long> {
}
