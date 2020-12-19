package com.cybertek.bootstrap;

import com.cybertek.entity.Address;
import com.cybertek.entity.Person;
import com.cybertek.repository.AddressRepository;
import com.cybertek.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    AddressRepository addressRepository;


    @Override
    public void run(String... args) throws Exception {

        Person p1 = new Person("Donald", "Duck");
        Person p2 = new Person("Mickey", "Mouse");
        Person p3 = new Person("Darth", "Vader");

        Address a1 = new Address("Toontown St", "12345");
        Address a2 = new Address("Disneyland", "12345");
        Address a3 = new Address("Star Wars St", "12345");

//        p1.setAddresses(Arrays.asList(a1, a2)); //case 1

       personRepository.save(p1);

        a1.setPerson(p1);
        a2.setPerson(p1);
        a3.setPerson(p1);

        addressRepository.save(a1);
        addressRepository.save(a2);
        addressRepository.save(a3);
    }
}
