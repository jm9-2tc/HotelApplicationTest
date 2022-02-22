package com.hotels.hotelsapplicationtest.remote.rest.dto.common;

import com.hotels.hotelsapplicationtest.remote.rest.dto.common.RoomReservationDto;

import java.util.List;

public class RoomsReservationCollectionDto {
    private List<RoomReservationDto> roomReservations;

    public RoomsReservationCollectionDto() {

    }

    public RoomsReservationCollectionDto(List<RoomReservationDto> roomReservations) {
        this.roomReservations = roomReservations;
    }

    public List<RoomReservationDto> getRoomReservations() {
        return roomReservations;
    }

    public void setRoomReservations(List<RoomReservationDto> roomReservations) {
        this.roomReservations = roomReservations;
    }
}
