package com.debuggeando_idea.bes_travel.domain.repositories;

import com.debuggeando_idea.bes_travel.domain.entities.TicketEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TicketRepository extends CrudRepository<TicketEntity, UUID> {
}
