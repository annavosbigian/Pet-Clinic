package com.springframework.petclinic.services;

import com.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudServices<Owner, Long>{

    Owner findByLastName(String lastName);
}
