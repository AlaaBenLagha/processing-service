package com.mypfe.controller;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mypfe.model.Processing;
import com.mypfe.serviceInterface.ProcessingCheckServiceInterface;

@RestController
@RequestMapping("/process")
public class ProcessingCheckController {
	
	@Autowired
	private ProcessingCheckServiceInterface processingCheckServiceInterface;
	
	
	@PostMapping("/doProcess")
	public Processing doProcess(@RequestBody Processing process) {
		process.setTransactionId(UUID.randomUUID().toString());
		return processingCheckServiceInterface.doProcess(process);
	}
	
	

	@GetMapping("/getProcessList")
	public List<Processing> getCheckProcessingList() {
		return processingCheckServiceInterface.getProcessList();
	}
	
	
	@GetMapping("/findProcessingHistoryByCheckId/{checkId}")
	public Processing findProcessingHistoryByCheckId(@PathVariable int checkId) {
	
		return processingCheckServiceInterface.findProcessingHistoryByCheckId(checkId);
	}
	

}
