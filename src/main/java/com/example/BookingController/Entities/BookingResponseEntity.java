package com.example.BookingController.Entities;

import com.example.BookingController.Status.BookingResponseStatus;

public class BookingResponseEntity {

    private long ticketId;
    private String passengerName;
    private String passengerSurname;
    private String passengerMiddleName;
    private BookingResponseStatus status;


    public BookingResponseEntity() {};

    public BookingResponseEntity(long ticketId, String passengerName, String passengerMiddleName, String passengerSurname, BookingResponseStatus status) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.passengerMiddleName = passengerMiddleName;
        this.passengerSurname = passengerSurname;
        this.status = status;
    }

    public long getTicketId() {
        return ticketId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPassengerMiddleName() {
        return passengerMiddleName;
    }

    public String getPassengerSurname() {
        return passengerSurname;
    }

    public BookingResponseStatus getStatus() {
        return status;
    }
}
