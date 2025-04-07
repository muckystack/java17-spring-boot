package com.debuggeando_idea.bes_travel.domain.repositories;

import com.debuggeando_idea.bes_travel.domain.entities.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelEntity, Long> {
}
