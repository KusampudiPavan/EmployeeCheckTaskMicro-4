package com.stl.EmployeeCheckTasksUpdateProgess.service;

import java.util.List;

import com.stl.EmployeeCheckTasksUpdateProgess.model.TaskModels;

public interface TaskService {

	List<TaskModels> getAllTasks();
	TaskModels updateTask(TaskModels leave, Long taskid);
	List<TaskModels> findtasksemail(String employeeemailid);
	List<TaskModels> findtaskpercent(String employeeemailid,String status);
}
