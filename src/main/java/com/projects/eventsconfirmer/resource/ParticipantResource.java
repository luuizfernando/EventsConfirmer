package com.projects.eventsconfirmer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.eventsconfirmer.entities.Participant;
import com.projects.eventsconfirmer.services.ParticipantService;

@RestController
@RequestMapping(value="/users")
public class ParticipantResource {
	
	@Autowired
	private ParticipantService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Participant> findById(@PathVariable Long id) {
		Participant obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}