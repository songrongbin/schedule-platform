package com.bins.schedule.service;

import com.bins.schedule.model.ScheduleJob;
import org.quartz.SchedulerException;

import java.util.List;

/**
 * Created by songrongbin on 2017/8/6.
 */
public interface IJobTaskService {
    void addJob(ScheduleJob job) throws SchedulerException;
    List<ScheduleJob> getAllJob() throws SchedulerException;
    List<ScheduleJob> getAllTask();
    void updateCron(Long jobId, String cron) throws SchedulerException;
    void changeStatus(Long jobId, String cmd) throws SchedulerException;
    void addTask(ScheduleJob job);
}
