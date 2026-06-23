package com.appuber.projectuber.entities;

import com.appuber.projectuber.entities.enums.PaymentMethod;
import com.appuber.projectuber.entities.enums.RideRequestStatus;
import com.appuber.projectuber.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter

public class Ride{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point pickupLocation;
    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point dropOffLocation;
    @CreationTimestamp
    private LocalDateTime CreatedTime;

    @ManyToOne(fetch=FetchType.LAZY)
    private Rider rider;
    @ManyToOne(fetch=FetchType.LAZY)
    private Driver driver;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;

    private Double Fare;
    private LocalDateTime StartedAt;
    private LocalDateTime EndedAt;

}
