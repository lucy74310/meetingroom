package com.goldenhill.meetingroom.controller.room;

import com.goldenhill.meetingroom.controller.room.dto.GetRoomsResponse;
import com.goldenhill.meetingroom.controller.room.dto.GetRoomsResponseRoom;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class RoomController {

    @GetMapping("/rooms")
    public GetRoomsResponse getRooms() {
        GetRoomsResponseRoom.builder().build();
        return GetRoomsResponse.builder().rooms(Arrays.asList()).build();
    }

}
