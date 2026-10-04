package com.appuber.projectuber.repositories;

import com.appuber.projectuber.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends JpaRepository<Driver,Long > {

}
