package com.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.rest.entity.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Integer>{

}
