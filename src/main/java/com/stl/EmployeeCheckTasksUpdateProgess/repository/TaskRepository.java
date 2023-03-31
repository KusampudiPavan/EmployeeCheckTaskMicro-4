package com.stl.EmployeeCheckTasksUpdateProgess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stl.EmployeeCheckTasksUpdateProgess.model.TaskModels;

public interface TaskRepository extends JpaRepository<TaskModels, Long> {

	@Query(value = "Select * from tasks where employeeemailid = ? ;", nativeQuery = true)
	public List<TaskModels> findtasksemail(String employeeemailid);
	
	
	@Query(value = "Select * from tasks where employeeemailid = ? and status= ?;", nativeQuery = true)
	public List<TaskModels> findtaskpercent(String employeeemailid,String status);

}
