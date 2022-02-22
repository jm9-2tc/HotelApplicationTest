package com.hotels.hotelsapplicationtest.remote.rest.dto.response;

import com.hotels.hotelsapplicationtest.domain.model.ReservationStatusType;
import com.hotels.hotelsapplicationtest.remote.rest.dto.common.PersonDto;
import com.hotels.hotelsapplicationtest.remote.rest.dto.common.RoomsReservationCollectionDto;

public class ReservationDto {
    private Integer id;
    private ReservationStatusType status;
    private RoomsReservationCollectionDto roomsReservation;
    private PersonDto person;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, ReservationStatusType status, RoomsReservationCollectionDto roomsReservation, PersonDto person) {
        this.id = id;
        this.status = status;
        this.roomsReservation = roomsReservation;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
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
