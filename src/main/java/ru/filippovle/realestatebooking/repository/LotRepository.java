package ru.filippovle.realestatebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.filippovle.realestatebooking.model.entity.Lot;

public interface LotRepository extends JpaRepository<Lot, Long>, JpaSpecificationExecutor<Lot> {
}