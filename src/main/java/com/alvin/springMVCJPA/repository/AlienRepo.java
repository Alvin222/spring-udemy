package com.alvin.springMVCJPA.repository;

import com.alvin.springMVCJPA.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien,Integer> {
    Alien findByAname(String aname);
}
