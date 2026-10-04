package com.appuber.projectuber.repositories;

import com.appuber.projectuber.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderequestRepo extends JpaRepository<RideRequest,Long> {
}
