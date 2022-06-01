package com.goldenhill.meetingroom.controller.reservation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetReservationsResponseReservation {

    private long reservationNo;
    private long roomNo;
    private OffsetDateTime startDateTime;
    private OffsetDateTime endDateTime;
    private String clientName;

}
