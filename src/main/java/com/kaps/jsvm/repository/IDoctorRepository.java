package com.kaps.jsvm.repository;

import com.kaps.jsvm.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer> {

}
