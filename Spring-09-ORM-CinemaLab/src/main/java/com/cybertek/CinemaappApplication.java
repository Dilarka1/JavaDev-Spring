package com.cybertek;

import com.cybertek.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@SpringBootApplication
public class CinemaappApplication {
	@Autowired
	AccountRepository accountRepository;
	@Autowired
	CinemaRepository cinemaRepository;
	@Autowired
	MovieCinemaRepository movieCinemaRepository;
	@Autowired
	TicketRepository ticketRepository;

	public static void main(String[] args) {
		SpringApplication.run(CinemaappApplication.class, args);
	}

	@PostConstruct
	public void testAccount(){
//		System.out.println(accountRepository.fetchAdminUsers());
//		System.out.println(cinemaRepository.distinctBySponsoredName());
//		System.out.println(movieCinemaRepository.countAllByCinemaId(4L));
//		System.out.println(movieCinemaRepository.retrieveAllByLocationName("AMC Empire 25"));
		//System.out.println(ticketRepository.fetchAllTicketsByUserJPQL(4l));
		//System.out.println(ticketRepository.fetchAllTicketsWithRangeDates(LocalDateTime.now().minusDays(30),LocalDateTime.now()));
		System.out.println(ticketRepository.retrieveAllBySearchCriteria("it"));
	//	System.out.println(ticketRepository.retrieveAllDistinctMovieNames());

	}


}
