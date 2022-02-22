package com.hotels.hotelsapplicationtest.remote.rest.dto.request;

import com.hotels.hotelsapplicationtest.remote.rest.dto.common.PersonDto;
import com.hotels.hotelsapplicationtest.remote.rest.dto.common.RoomsReservationCollectionDto;

public class ReservationDto {
    private RoomsReservationCollectionDto roomsReservation;
    private PersonDto person;

    public ReservationDto() {
    }

    public ReservationDto(RoomsReservationCollectionDto roomsReservation, PersonDto person) {
        this.roomsReservation = roomsReservation;
        this.person = person;
    }

    public RoomsReservationCollectionDto getRoomsReservation() {
        return roomsReservation;
    }

    public void setRoomsReservation(RoomsReservationCollectionDto roomsReservation) {
        this.roomsReservation = roomsReservation;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
