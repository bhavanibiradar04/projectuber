package com.appuber.projectuber.service.imple;

import com.appuber.projectuber.dto.DriverDto;
import com.appuber.projectuber.dto.RideDto;
import com.appuber.projectuber.dto.RiderDto;
import com.appuber.projectuber.service.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriverServiceimple implements DriverService {
    @Override
    public DriverDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto endRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto AcceptRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getallMyrides() {
        return List.of();
    }
}
