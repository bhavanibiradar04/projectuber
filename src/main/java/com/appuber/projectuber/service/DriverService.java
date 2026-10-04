package com.appuber.projectuber.service;

import com.appuber.projectuber.dto.DriverDto;
import com.appuber.projectuber.dto.RideDto;
import com.appuber.projectuber.dto.RiderDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DriverService {
    DriverDto cancelRide(Long rideId);

    DriverDto endRide(Long rideId);
    DriverDto AcceptRide(Long rideId);
    DriverDto startRide(Long rideId);
    RiderDto rateRider(Long rideId,Integer rating);
    DriverDto getMyProfile();
    List<RideDto> getallMyrides();


}
