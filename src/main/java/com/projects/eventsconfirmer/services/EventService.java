package com.projects.eventsconfirmer.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.eventsconfirmer.entities.Event;
import com.projects.eventsconfirmer.repositories.EventRepository;

@Service
public class EventService {
	
	@Autowired
	private EventRepository repository;
	
	public Event findById(Long id) {
		Optional<Event> obj = repository.findById(id);
		return obj.get();
	}
}