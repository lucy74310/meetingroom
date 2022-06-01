package com.goldenhill.meetingroom.controller.room.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetRoomsResponse {
    private List<GetRoomsResponseRoom> rooms;
}
