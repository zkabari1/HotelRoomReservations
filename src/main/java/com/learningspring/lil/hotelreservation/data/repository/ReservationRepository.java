package com.learningspring.lil.hotelreservation.data.repository;

import com.learningspring.lil.hotelreservation.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Long> {
    Iterable <Reservation> findReservationByReservationDate(Date date);
}
