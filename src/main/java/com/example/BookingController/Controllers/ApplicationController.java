package com.example.BookingController.Controllers;

import com.example.BookingController.Entities.BookingResponseEntity;
import com.example.BookingController.Status.BookingResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("book")
    public ResponseEntity<BookingResponseEntity> book() {
        BookingResponseEntity bookingResponseEntity = new BookingResponseEntity(156, "Ivan", "Ivanovich", "Ivanov", BookingResponseStatus.SUCCESS);
        return new ResponseEntity<BookingResponseEntity>(bookingResponseEntity, HttpStatus.OK);
    }

}
