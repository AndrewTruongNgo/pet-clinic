package com.andrew.petclinic.services;

import com.andrew.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
