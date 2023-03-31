package com.stl.EmployeeCheckTasksUpdateProgess.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stl.EmployeeCheckTasksUpdateProgess.model.TaskModels;
import com.stl.EmployeeCheckTasksUpdateProgess.service.TaskService;

@RequestMapping("tasks")
@RestController
@CrossOrigin("http://localhost:3000")
public class TasksController {
	
	@Autowired
	TaskService service;
	
	@GetMapping("/get")
	public List<TaskModels> getall() {
		return service.getAllTasks();
	}

	@PutMapping("/update/{taskid}")
	public ResponseEntity<TaskModels> updateTask(@PathVariable("taskid") Long taskid,@RequestBody TaskModels task){
		return new ResponseEntity<TaskModels> (service.updateTask(task, taskid),HttpStatus.OK);
	}
	
	@GetMapping("/get/{employeeemailid}")
	public List<TaskModels> findtasksemail(@PathVariable("employeeemailid") String employeeemailid){
		return service.findtasksemail(employeeemailid);
	}
	
	@GetMapping("/getpercent/{employeeemailid}/{status}")
	public List<TaskModels> findtaskpercent(@PathVariable("employeeemailid") String employeeemailid,@PathVariable("status") String status){
		return service.findtaskpercent(employeeemailid,status);
	}
	
	
}
