package ru.filippovle.realestatebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.filippovle.realestatebooking.model.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}