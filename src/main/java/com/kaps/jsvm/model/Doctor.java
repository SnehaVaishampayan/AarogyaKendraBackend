package com.kaps.jsvm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
            @Id
            Integer id;
            String name;
            String department;
            String contact;

}
