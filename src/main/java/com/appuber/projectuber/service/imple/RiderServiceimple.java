package com.appuber.projectuber.service.imple;

import com.appuber.projectuber.dto.DriverDto;
import com.appuber.projectuber.dto.RideDto;
import com.appuber.projectuber.dto.RideRequestDto;
import com.appuber.projectuber.dto.RiderDto;
import com.appuber.projectuber.service.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RiderServiceimple implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getallMyrides() {
        return List.of();
    }
}
