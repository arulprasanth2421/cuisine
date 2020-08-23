package com.hackathon.cuisine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.cuisine.entity.MenuEntity;
@Repository
public interface MenuRepository extends JpaRepository<MenuEntity, Integer>{

	List<MenuEntity> findAll();

}
