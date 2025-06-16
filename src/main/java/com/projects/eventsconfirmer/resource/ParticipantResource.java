package com.projects.eventsconfirmer.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.eventsconfirmer.entities.Participant;

@RestController
@RequestMapping(value="/users")
public class ParticipantResource {
	@GetMapping
	public ResponseEntity<Participant> findAll() {
		Participant p = new Participant(1L, "Maria", "12345678", false);
		return ResponseEntity.ok().body(p);
	}
}