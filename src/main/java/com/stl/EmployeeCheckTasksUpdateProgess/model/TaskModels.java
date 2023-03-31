package com.stl.EmployeeCheckTasksUpdateProgess.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tasks")
public class TaskModels {

	@Column(name="taskid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long taskid;
	
	@Column(name="employeeemailid")
	private String employeeemailid;
	
	@Column(name="manageremailid")
	private String manageremailid;
	
	@Column(name="title")
	private String title;
	
	@Column(name="task")
	private String task;
	
	@Column(name="closedate")
	private String closedate;
	
	@Column(name="status")
	private String status;
	
	public TaskModels() {
		
	}

	public TaskModels(Long taskid, String employeeemailid, String manageremailid, String title, String task,
			String closedate, String status) {
		super();
		this.taskid = taskid;
		this.employeeemailid = employeeemailid;
		this.manageremailid = manageremailid;
		this.title = title;
		this.task = task;
		this.closedate = closedate;
		this.status = status;
	}

	public Long getTaskid() {
		return taskid;
	}

	public void setTaskid(Long taskid) {
		this.taskid = taskid;
	}

	public String getEmployeeemailid() {
		return employeeemailid;
	}

	public void setEmployeeemailid(String employeeemailid) {
		this.employeeemailid = employeeemailid;
	}

	public String getManageremailid() {
		return manageremailid;
	}

	public void setManageremailid(String manageremailid) {
		this.manageremailid = manageremailid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getClosedate() {
		return closedate;
	}

	public void setClosedate(String closedate) {
		this.closedate = closedate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TaskModel [taskid=" + taskid + ", employeeemailid=" + employeeemailid + ", manageremailid="
				+ manageremailid + ", title=" + title + ", task=" + task + ", closedate=" + closedate + ", status="
				+ status + "]";
	}

	
	
	
	
}
