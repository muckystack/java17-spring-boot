package com.debuggeando_idea.bes_travel.domain.repositories;

import com.debuggeando_idea.bes_travel.domain.entities.TourEntity;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<TourEntity, Long> {
}
