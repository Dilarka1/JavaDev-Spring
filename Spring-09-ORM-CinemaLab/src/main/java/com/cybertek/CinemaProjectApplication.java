package com.cybertek;

import com.cybertek.repository.AccountRepository;
import com.cybertek.repository.CinemaRepository;
import com.cybertek.repository.MovieCinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CinemaProjectApplication {

	@Autowired
	AccountRepository accountRepository;
	@Autowired
	CinemaRepository cinemaRepository;
	@Autowired
	MovieCinemaRepository movieCinemaRepository;


	public static void main(String[] args) {

		SpringApplication.run(CinemaProjectApplication.class, args);
	}

	@PostConstruct
	public void testAccounts() {

		System.out.println("---------HomeWork start------------");

//		System.out.println(accountRepository.findAccountsByCountryOrState("United States of America", "Ohio"));
//		System.out.println(accountRepository.orderWithAgeJPQL());
//		System.out.println(accountRepository.fetchAdminUsers());

		System.out.println(cinemaRepository.distinctBySponsoredName());
		System.out.println(cinemaRepository.findFirst3BySponsoredNameContainingOrderBySponsoredNameAsc("Kodak"));
		System.out.println(movieCinemaRepository.countAllByCinemaId(7L));
		System.out.println(movieCinemaRepository.retrieveAllByLocationName("AMC Empire 25"));

		System.out.println("---------HomeWork End------------");




	}
}
