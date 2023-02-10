package com.mockito.PracticeMockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repository;


    public String welcome() {
        return "Welcome To HomePage";
    }

    public String addPerson(Entity entity) {

        Entity person = repository.findById(entity.getId()).orElse(null);

        if(person!=null){
        repository.save(entity);
            return "Successfully Stored ";
        }else{
            throw new PersonAlreadyExistsExcep("Person Already Exists");
        }


    }

    public Entity getPersonById(int id) throws PersonNotFoundException{

        Entity person = repository.findById(id).orElse(null);

        if(person==null) {
            throw new PersonNotFoundException("No Such Person With THis id");
        }else{
            return person;}
    }

    public List<Entity> getAllPerson() {
        return repository.findAll();
    }

    public String deletePerson(int id) throws PersonNotFoundException {

        Entity person = repository.findById(id).orElse(null);

        if(person!=null){
            repository.deleteById(id);
            return "Deleted Successfully";
        }else{
            throw new PersonNotFoundException("No Such Person With this Id"+id);
        }
    }


    public String updatePerson(int id, Entity entity) throws PersonNotFoundException{

        Entity person = repository.findById(id).orElse(null);
        Entity newPerson = entity;

        if (person!=null){
            person.setName(newPerson.getName());
            person.setAge(newPerson.getAge());
            person.setCity(newPerson.getCity());

            repository.save(person);
            return "Updated Succesfully";

        }else{
            throw new PersonNotFoundException("No Such Person With this Id"+id);
        }
    }



    public Entity getPersonByName(String name) throws PersonNotFoundException{


        Entity person = repository.findByName(name);

        if(person!=null){
            return person;
        }else {
            throw new PersonNotFoundException("No Such Person With this Name"+name);
        }

    }
}
