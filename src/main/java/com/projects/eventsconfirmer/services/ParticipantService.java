package com.projects.eventsconfirmer.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.eventsconfirmer.entities.Participant;
import com.projects.eventsconfirmer.repositories.ParticipantRepository;

@Service
public class ParticipantService {
	
	@Autowired
	private ParticipantRepository repository;
	
	public Participant findById(Long id) {
		Optional<Participant> obj = repository.findById(id);
		return obj.get();
		
	}
}