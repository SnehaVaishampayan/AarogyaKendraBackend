package com.kaps.jsvm.service;

import com.kaps.jsvm.model.Doctor;
import com.kaps.jsvm.repository.IDoctorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    private static final Logger log = LoggerFactory.getLogger(DoctorService.class);

    @Autowired
    IDoctorRepository iDoctorRepository;
    @Autowired
    public DoctorService(IDoctorRepository iDoctorRepository) {
        this.iDoctorRepository = iDoctorRepository;
    }

    public List<Doctor> getAll() {
        List<Doctor> doctors = iDoctorRepository.findAll();
        return doctors;
    }

    public Doctor getDoctorById( int id) {
        return getAll().stream().filter(doctor -> doctor.getId() == id).findFirst().get();
    }

    public void addDoctor(Doctor newDoctor) {
        iDoctorRepository.save(newDoctor);
    }

    public void updateDoctor(Doctor updateDoctor) {
        iDoctorRepository.save(updateDoctor);
    }

    public void deleteDoctor(int deleteDoctorId) {
        iDoctorRepository.deleteById(deleteDoctorId);
    }


}
