package com.debuggeando_idea.bes_travel.domain.repositories;

import com.debuggeando_idea.bes_travel.domain.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity, String> {
}
