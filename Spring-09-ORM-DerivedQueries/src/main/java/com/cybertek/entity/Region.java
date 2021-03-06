package com.cybertek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "regions")
@NoArgsConstructor
public class Region extends BaseEntity{

    private String region;
    private String country;

    @Override
    public String toString() {
        return "Region{" +
                "region='" + region + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
