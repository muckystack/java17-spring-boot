package com.debuggeando_idea.bes_travel.domain.repositories;

import com.debuggeando_idea.bes_travel.domain.entities.ReservationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ReservationRepository extends CrudRepository<ReservationEntity, UUID> {
}
