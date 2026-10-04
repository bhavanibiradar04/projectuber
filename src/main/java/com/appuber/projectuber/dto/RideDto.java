package com.appuber.projectuber.dto;

import com.appuber.projectuber.entities.Driver;
import com.appuber.projectuber.entities.Rider;
import com.appuber.projectuber.entities.enums.PaymentMethod;
import com.appuber.projectuber.entities.enums.RideStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDto {
    private Long id;
    private Point pickupLocation;

    private Point dropOffLocation;

    private LocalDateTime CreatedTime;


    private RiderDto rider;

    private DriverDto driver;


    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private Double Fare;
    private LocalDateTime StartedAt;
    private LocalDateTime EndedAt;
}
