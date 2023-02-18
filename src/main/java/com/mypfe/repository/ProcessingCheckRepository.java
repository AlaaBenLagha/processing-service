package com.mypfe.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import com.mypfe.model.Processing;

public interface ProcessingCheckRepository extends JpaRepository<Processing, Integer> {

	Processing findByCheckId(int checkId);

	
} 
