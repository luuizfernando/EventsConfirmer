package com.projects.eventsconfirmer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.eventsconfirmer.entities.Event;

public interface EventRepository extends JpaRepository<Event, Long> {}