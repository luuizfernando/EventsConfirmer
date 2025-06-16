package com.projects.eventsconfirmer.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projects.eventsconfirmer.entities.Participant;
import com.projects.eventsconfirmer.repositories.ParticipantRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private ParticipantRepository participantRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Participant p1 = new Participant(null, "Carlos", "12345678", false);
		Participant p2 = new Participant(null, "Maria", "87654321", true);
		
		participantRepository.saveAll(Arrays.asList(p1, p2));
	}
}