package com.bins.schedule.dao;

import com.bins.schedule.model.ScheduleJob;

import java.util.List;

/**
 * Created by songrongbin on 2017/8/6.
 */
public interface ScheduleJobMapper {
    int deleteByPrimaryKey(Long jobId);

    int insert(ScheduleJob record);

    int insertSelective(ScheduleJob record);

    ScheduleJob selectByPrimaryKey(Long jobId);

    int updateByPrimaryKeySelective(ScheduleJob record);

    int updateByPrimaryKey(ScheduleJob record);

    List<ScheduleJob> getAll();

}
