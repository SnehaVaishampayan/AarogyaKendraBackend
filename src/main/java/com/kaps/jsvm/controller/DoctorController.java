package com.kaps.jsvm.controller;

import com.kaps.jsvm.model.Doctor;
import com.kaps.jsvm.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

// Rest controller for managing Doctor record
@RestController
@RequestMapping("/api/doctors")
public class DoctorController {


    @Autowired
    private DoctorService service;

    @GetMapping()
    public List<Doctor> getAll() throws IOException {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable int id) {
        return service.getDoctorById(id);
    }

    @PostMapping
    public void addDoctor(@RequestBody Doctor newDoctor) {
        service.addDoctor(newDoctor);
    }

    @PutMapping
    public void updateDoctor(@RequestBody Doctor updateDoctor) {
        service.updateDoctor(updateDoctor);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable int id) {
        service.deleteDoctor(id);
    }

}



