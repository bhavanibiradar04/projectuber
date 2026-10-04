package com.appuber.projectuber.service;

import com.appuber.projectuber.dto.RideRequestDto;
import com.appuber.projectuber.entities.Driver;
import com.appuber.projectuber.entities.Ride;
import com.appuber.projectuber.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface  RideService {
    Ride getRideById (Long rideId);
    void matchWithDriver(RideRequestDto rideRequestDto);
    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);
    Ride updateRidestatus(Long rideId, RideStatus rideStatus);
    Page<Ride> getallridesofrider(Long riderId, PageRequest pageRequest);
    Page<Ride> getallridesofdriver(Long driverId, PageRequest pageRequest);
}
