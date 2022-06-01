package com.goldenhill.meetingroom.controller.room.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetRoomsResponseRoom {

    private long no;
    private String roomName;
    private boolean isUse;
}
