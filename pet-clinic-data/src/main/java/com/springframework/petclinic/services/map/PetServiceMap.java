package com.springframework.petclinic.services.map;

import com.springframework.petclinic.model.Pet;
import com.springframework.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

@Override
public Set<Pet> findAll(){
        //use super since this is extending from AbstractMapService
        return super.findAll();
        }

@Override
public Pet findById(Long id){
        return super.findById(id);
        }

@Override
public Pet save(Pet object){
        return super.save(object.getId(),object);
        }

@Override
public void delete(Pet object){
        super.deleteByObject(object);
        }

@Override
public void deleteById(Long id){
        super.deleteById(id);
        }

}