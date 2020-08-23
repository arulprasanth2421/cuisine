package com.hackathon.cuisine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.hackathon.cuisine.entity.RestoEntity;

@Repository
public interface RestoRepository extends JpaRepository<RestoEntity, Integer>{

	RestoEntity getOne(Integer restaurantid);

}
