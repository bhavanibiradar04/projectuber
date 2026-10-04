package com.appuber.projectuber.service;

import com.appuber.projectuber.dto.DriverDto;
import com.appuber.projectuber.dto.RideDto;
import com.appuber.projectuber.dto.RideRequestDto;
import com.appuber.projectuber.dto.RiderDto;

import java.util.List;

public interface RiderService {
    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);
    DriverDto rateRider(Long rideId, Integer rating);
    RiderDto getMyProfile();
    List<RideDto> getallMyrides();
}
