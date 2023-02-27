package com.taskscheduling.schedulingexample.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskscheduling.schedulingexample.Data.TaskDefinition;

@Service
public class TaskDefinitionBean implements Runnable {
	
	private TaskDefinition taskDefinition;
	@Override
	public void run() {
		System.out.println("Running action: " + taskDefinition.getActionType());
		System.out.println("With Data: " + taskDefinition.getData());

	}

	public TaskDefinition getTaskDefinition() {
		return taskDefinition;
	}

	public void setTaskDefinition(TaskDefinition taskDefinition) {
		this.taskDefinition = taskDefinition;
	}

}
