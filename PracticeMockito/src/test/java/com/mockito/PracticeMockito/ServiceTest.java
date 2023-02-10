package com.mockito.PracticeMockito;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ServiceTest {

    @Mock
    Repository repository;

    @InjectMocks
    Service service;


    @Test
    public void testGetById() throws Exception {

        when(repository.findById(anyInt())).thenReturn(Optional.of(new Entity()));

        Entity result = service.getPersonById(1);

        assertEquals(result,new Entity());

    }


//    @Test
//    public void testGetAllPerson(){
//
//        List<Entity> foundPersons = repository.findAll();
//
//        assertEquals(7,foundPersons.size());
//
//    }



}