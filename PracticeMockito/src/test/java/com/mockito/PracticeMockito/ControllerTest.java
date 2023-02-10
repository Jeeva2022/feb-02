package com.mockito.PracticeMockito;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ControllerTest {

    @Mock
    Service service;

    @InjectMocks
    Controller controller;

    @BeforeEach
    void setUp(){
        when(service.welcome()).thenReturn("Welcome To HomePage");
    }



    @Test
    public void shouldReturnDefaultMessage(){
        String response = controller.welcome();

        assertEquals("Welcome To HomePage",response);

    }









}