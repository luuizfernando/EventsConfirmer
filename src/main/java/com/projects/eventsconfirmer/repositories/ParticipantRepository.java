package com.projects.eventsconfirmer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.eventsconfirmer.entities.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {}