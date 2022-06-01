package com.goldenhill.meetingroom.controller.reservation;

import com.goldenhill.meetingroom.controller.reservation.dto.GetReservationsResponse;
import com.goldenhill.meetingroom.controller.reservation.dto.GetReservationsResponseReservation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;


@RestController
public class ReservationController {


    @GetMapping("/reservations")
    public GetReservationsResponse reservationList() {

        GetReservationsResponseReservation reservation = GetReservationsResponseReservation.builder()
                        .clientName("조부광")
                        .roomNo(1)
                        .startDateTime(OffsetDateTime.now())
                        .endDateTime(OffsetDateTime.parse("2022-06-03T14:00:00+00:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME))
                        .build();

        return GetReservationsResponse.builder()
                .reservations(Arrays.asList(reservation))
                .build();
    }
}
