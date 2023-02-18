package com.mypfe.serviceInterface;

import java.util.List;

import com.mypfe.model.Processing;

public interface ProcessingCheckServiceInterface {
	
	
	public Processing doProcess(Processing process);
	public List<Processing> getProcessList();
	public Processing findProcessingHistoryByCheckId(int checkId);

}
