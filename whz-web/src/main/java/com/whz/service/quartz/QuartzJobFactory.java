package com.whz.service.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.whz.common.util.TaskUtils;
import com.whz.model.quartz.ScheduleJob;

/**     
 * Job实现类  无状态     
 * 若此方法上一次还未执行完，而下一次执行时间轮到时则该方法也可并发执行     
 * @author root     
 */     
public class QuartzJobFactory implements Job {     
	private final static Logger logger = LoggerFactory.getLogger(QuartzJobFactory.class);   
	     
	@Override     
    public void execute(JobExecutionContext context) throws JobExecutionException {     
		ScheduleJob scheduleJob = (ScheduleJob)context.getMergedJobDataMap().get("scheduleJob");     
        logger.info("运行任务名称 = [" + scheduleJob.getJobName() + "]");     
        TaskUtils.invokMethod(scheduleJob);     
    }     
	     
}