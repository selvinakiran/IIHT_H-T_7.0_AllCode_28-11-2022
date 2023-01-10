package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.entity.Compensation;


@Repository
public interface CompensationRepository extends JpaRepository<Compensation, Long>{
	
	

}
