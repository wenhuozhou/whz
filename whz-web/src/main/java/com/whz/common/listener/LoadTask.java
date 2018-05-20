package com.whz.common.listener;

import java.util.ArrayList;
import java.util.List;

import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.whz.model.quartz.ScheduleJob;
import com.whz.service.quartz.TaskService;
/**
 * 项目启动时加载定时任务 
 * @author wenhz
 *
 */
public class LoadTask {     
    
	private final Logger logger = LoggerFactory.getLogger(this.getClass());     
	      
	@Autowired     
	private TaskService taskService;     
	     
	public void initTask() throws SchedulerException {		     
		// 可执行的任务列表        
		List<ScheduleJob> taskList = new ArrayList();
		logger.info("初始化加载定时任务......");     
		for (ScheduleJob job : taskList) {     
			taskService.addJob(job);     
		}     
	}	     
}