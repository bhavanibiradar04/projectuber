package com.appuber.projectuber.service.imple;

import com.appuber.projectuber.dto.RideRequestDto;
import com.appuber.projectuber.entities.Driver;
import com.appuber.projectuber.entities.Ride;
import com.appuber.projectuber.entities.enums.RideStatus;
import com.appuber.projectuber.service.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class rideserviceimple implements RideService {
    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDriver(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRidestatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getallridesofrider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getallridesofdriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
