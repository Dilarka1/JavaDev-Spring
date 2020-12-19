package com.cybertek.entity;

import com.cybertek.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "departments")
@Getter
@Setter
@NoArgsConstructor
public class Department extends BaseEntity {

    private String department;
    private String division;

    @OneToOne(mappedBy = "department")
    private Employee employee;


    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
