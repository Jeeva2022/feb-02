package com.mockito.PracticeMockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    Service service;

    @GetMapping("/welcome")
    public String welcome(){
        return service.welcome();
    }

    @PostMapping("/addPerson")
    public String addPerson(@RequestBody Entity entity){
        return service.addPerson(entity);
    }

    @GetMapping("/getPersonById/{id}")
    public Entity getPersonById(@PathVariable int id) throws Exception {
        return service.getPersonById(id);
    }

    @GetMapping("/getAllPerson")
    public List<Entity> getAllPerson(){
        return service.getAllPerson();
    }


    @GetMapping("/deletePerson")
    public String deletePerson(@PathVariable int id) throws PersonNotFoundException {
        return service.deletePerson(id);
    }

    @GetMapping("/updatePerson/{id}")
    public String updatePerson(@PathVariable int id, @RequestBody Entity entity) throws PersonNotFoundException {
        return service.updatePerson(id,entity);
    }

    @GetMapping("/getPersonByName/{name}")
    public Entity getPersonByName(@PathVariable String name) throws PersonNotFoundException {
        return service.getPersonByName(name);
    }







}
