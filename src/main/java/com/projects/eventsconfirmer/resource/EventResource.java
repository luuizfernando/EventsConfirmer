package com.projects.eventsconfirmer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.eventsconfirmer.entities.Event;
import com.projects.eventsconfirmer.services.EventService;

@RestController
@RequestMapping(value="/events")
public class EventResource {
	
	@Autowired
	private EventService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Event> findById(@PathVariable Long id) {
		Event obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}