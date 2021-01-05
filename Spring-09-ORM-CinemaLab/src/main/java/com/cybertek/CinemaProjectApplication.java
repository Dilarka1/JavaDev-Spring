package com.cybertek;

import com.cybertek.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CinemaProjectApplication {

	@Autowired
	AccountRepository accountRepository;


	public static void main(String[] args) {

		SpringApplication.run(CinemaProjectApplication.class, args);
	}

	@PostConstruct
	public void testAccounts() {

		System.out.println("---------HomeWork start------------");

		System.out.println(accountRepository.findAccountsByCountryOrState("Canada", "Ohio"));
		System.out.println(accountRepository.orderWithAgeJPQL());
		System.out.println(accountRepository.fetchAdminUsers());

		System.out.println("---------HomeWork End------------");


	}
}
