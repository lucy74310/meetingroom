package com.goldenhill.meetingroom.controller.reservation.dto;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class GetReservationResponseReservation {

    private long reservationNo;
    private long roomNo;
    private String roomName;
    private OffsetDateTime startDateTime;
    private OffsetDateTime endDateTime;
    private String clientName;

}
