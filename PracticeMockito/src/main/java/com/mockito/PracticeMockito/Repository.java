package com.mockito.PracticeMockito;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Entity,Integer> {

    @Query(value = "select * from mockito where name like ? ", nativeQuery = true)
     Entity findByName(String name) ;



}
