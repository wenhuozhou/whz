package com.whz.model.quartz;

import java.io.Serializable;
import java.util.Date;

public class ScheduleJob implements Serializable{

	public static final String STATUS_RUNNING = "1";
	public static final String STATUS_NOT_RUNNING = "0";
	public static final String CONCURRENT_IS = "1";
	public static final String CONCURRENT_NOT = "0";
	
	/**
	 * 任务id
	 */
	private Long jobId;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 任务名称
	 */
	private String jobName;
	/** 
	 * 任务分组，任务名称+组名称应该是唯一的
	 */ 
	private String jobGroup;
	/** 
	 * 任务初始状态 0禁用 1启用 2删除
	 */ 
	private String jobStatus;
	/**
	 * cron表达式
	 */
	private String cronExpression;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 任务执行时调用哪个类的方法 包名+类名
	 */
	private String beanClass;
	/** 
	 * 任务是否有状态（并发）
	 */ 
	private String isConcurrent= "1";
	/**
	 * spring bean
	 */
	private String springId;
	/**
	 * 任务调用的方法名
	 */
	private String methodName;
	
	
	
	public ScheduleJob() {
		super();
	}
	public ScheduleJob(Long jobId, Date createTime, Date updateTime, String jobName, String jobGroup, String jobStatus,
			String cronExpression, String description, String beanClass, String isConcurrent, String springId,
			String methodName) {
		super();
		this.jobId = jobId;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.jobName = jobName;
		this.jobGroup = jobGroup;
		this.jobStatus = jobStatus;
		this.cronExpression = cronExpression;
		this.description = description;
		this.beanClass = beanClass;
		this.isConcurrent = isConcurrent;
		this.springId = springId;
		this.methodName = methodName;
	}
	public Long getJobId() {
		return jobId;
	}
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobGroup() {
		return jobGroup;
	}
	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}
	public String getJobStatus() {
		return jobStatus;
	}
	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}
	public String getCronExpression() {
		return cronExpression;
	}
	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBeanClass() {
		return beanClass;
	}
	public void setBeanClass(String beanClass) {
		this.beanClass = beanClass;
	}
	public String getIsConcurrent() {
		return isConcurrent;
	}
	public void setIsConcurrent(String isConcurrent) {
		this.isConcurrent = isConcurrent;
	}
	public String getSpringId() {
		return springId;
	}
	public void setSpringId(String springId) {
		this.springId = springId;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	@Override
	public String toString() {
		return "ScheduleJob [jobId=" + jobId + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", jobName=" + jobName + ", jobGroup=" + jobGroup + ", jobStatus=" + jobStatus + ", cronExpression="
				+ cronExpression + ", description=" + description + ", beanClass=" + beanClass + ", isConcurrent="
				+ isConcurrent + ", springId=" + springId + ", methodName=" + methodName + "]";
	}
	
	
}
