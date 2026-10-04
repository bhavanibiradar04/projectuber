package com.appuber.projectuber.repositories;

import com.appuber.projectuber.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepo extends JpaRepository<Rider,Long> {
}
