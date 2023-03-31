package com.stl.EmployeeCheckTasksUpdateProgess.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stl.EmployeeCheckTasksUpdateProgess.exception.ResourceNotFoundException;
import com.stl.EmployeeCheckTasksUpdateProgess.model.TaskModels;
import com.stl.EmployeeCheckTasksUpdateProgess.repository.TaskRepository;

@Service
public class TaskServiceimpl implements TaskService{
	
	@Autowired
	TaskRepository taskrepo;

	@Override
	public List<TaskModels> getAllTasks() {
		return taskrepo.findAll();
	}

	@Override
	public TaskModels updateTask(TaskModels task, Long taskid) {
		TaskModels existingtask = taskrepo.findById(taskid).orElseThrow(() -> new ResourceNotFoundException("Leave","Id",taskid));
		existingtask.setStatus(task.getStatus());
		taskrepo.save(existingtask);
		return existingtask;
	}

	@Override
	public List<TaskModels> findtasksemail(String employeeemailid) {
		return taskrepo.findtasksemail(employeeemailid);
	}

	@Override
	public List<TaskModels> findtaskpercent(String employeeemailid,String status) {
		return taskrepo.findtaskpercent(employeeemailid,status);
	}

}
