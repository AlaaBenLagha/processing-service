package com.mypfe.service;

import java.util.List;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypfe.model.Processing;
import com.mypfe.repository.ProcessingCheckRepository;
import com.mypfe.serviceInterface.ProcessingCheckServiceInterface;

@Service
public class ProcessingCheckServiceImplementation implements ProcessingCheckServiceInterface {

	
	@Autowired
	private ProcessingCheckRepository processRepo;
	
	@Override
	public Processing doProcess(Processing process) {
		process.setProcessStatus("UP");
//		process.setProcessStatus(checkProcessingStatus());
		process.setTransactionId(UUID.randomUUID().toString());
		return processRepo.save(process);
	}
	
	
//	public String checkProcessingStatus() {
//		//it should be Default "DOWN" and When Processing it changes to "UP"
//		return new Random().nextBoolean()?"UP":"DOWN";
//	}

	@Override
	public List<Processing> getProcessList() {
		return processRepo.findAll();
	}


	@Override
	public Processing findProcessingHistoryByCheckId(int checkId) {
		
		return processRepo.findByCheckId(checkId);
	}



}
