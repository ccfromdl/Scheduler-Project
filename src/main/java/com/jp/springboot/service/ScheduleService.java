package com.jp.springboot.service;

import com.jp.springboot.model.Schedule;
import org.springframework.stereotype.Service;

//@Service
public interface ScheduleService {
    public Schedule createSchedule(Schedule schedule);
}
