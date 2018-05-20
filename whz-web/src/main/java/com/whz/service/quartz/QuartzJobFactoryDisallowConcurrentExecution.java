package com.whz.service.quartz;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.whz.common.util.TaskUtils;
import com.whz.controller.base.BaseController;
import com.whz.model.quartz.ScheduleJob;
/**     
 * Job有状态实现类，不允许并发执行     
 * 	若一个方法一次执行不完下次轮转时则等待该方法执行完后才执行下一次操作     
 * 	主要是通过注解：@DisallowConcurrentExecution     
 * @author wenhz     
 *     
 */     
@DisallowConcurrentExecution 
public class QuartzJobFactoryDisallowConcurrentExecution implements  Job {
	private final static Logger logger = LoggerFactory.getLogger(BaseController.class);
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap().get("scheduleJob");
		logger.info("运行任务名称 = [" + scheduleJob.getJobName() + "]"); 
		TaskUtils.invokMethod(scheduleJob);
	}

		
}
