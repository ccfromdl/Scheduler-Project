package com.jp.springboot.controller;

import com.jp.springboot.model.Schedule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class ScheduleController {
    Map<Long, Schedule> scheduleMap = new HashMap<>();

    @PostMapping("/schedules")
    public Schedule createSchedule(@RequestBody Schedule schedule) {
        log.info("create schedule: {}", schedule);
        return schedule;
    }

    @GetMapping("/schedules/{id}")
    public Schedule getSchedule(@PathVariable String id) throws ParseException {
        log.info("get schedule: {}", id);
        Date startTime = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss").parse("09-12-2023 13:00:00");
        Date endTime = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss").parse("09-12-2023 13:30:00");
        return Schedule.builder().name("New member onboard").startTime(startTime).endTime(endTime).build();
    }


    @GetMapping("/schedules")
    public List<Schedule> searchSchedules(@RequestParam(required = false) String type) {
        log.info("get all schedules");
        return scheduleMap.values().stream().filter(schedule -> schedule.getType().equals(type)).collect(Collectors.toList());
    }

    @PutMapping("/schedules/{id}")
    public Schedule updateSchedule(@PathVariable String id, @RequestBody Schedule schedule) {
        log.info("update schedule: {}", schedule);
        return schedule;
    }

    @DeleteMapping("/schedules/{id}")
    public void deleteSchedule(@PathVariable String id) {
        log.info("delete schedule: {}", id);
    }
}
