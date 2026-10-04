package com.appuber.projectuber.repositories;

import com.appuber.projectuber.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  RideRepo extends JpaRepository<Ride,Long > {
}
