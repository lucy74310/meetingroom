package com.goldenhill.meetingroom.controller.reservation;

import com.goldenhill.meetingroom.controller.reservation.dto.GetReservationRequest;
import com.goldenhill.meetingroom.controller.reservation.dto.GetReservationResponse;
import com.goldenhill.meetingroom.controller.reservation.dto.GetReservationResponseReservation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;


@RestController
public class ReservationController {


    @GetMapping("/reservation")
    public GetReservationResponse reservationList() {
        GetReservationResponse reservationResponse = new GetReservationResponse();

        GetReservationResponseReservation reservation = new GetReservationResponseReservation();

        reservation.setClientName("조부광");
        reservation.setRoomNo(1);
        reservation.setStartDateTime(OffsetDateTime.now());
        reservation.setEndDateTime(OffsetDateTime.parse("2022-06-03T14:00:00+00:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME));

        reservationResponse.setReservation(reservation);
        return reservationResponse;
    }
}
