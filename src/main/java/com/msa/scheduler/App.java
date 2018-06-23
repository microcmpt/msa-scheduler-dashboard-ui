package com.msa.scheduler;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type App.
 */
@RestController
@SpringBootApplication
public class App {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplicationBuilder appBuilder = new SpringApplicationBuilder();
        appBuilder.sources(App.class);
        appBuilder.run(args);
    }

    /**
     * Gets jobs.
     *
     * @return the jobs
     */
    @RequestMapping(value = "/api/v1/jobs")
    public Map<String, Object> getJobs() {
        Map<String, Object> map = new HashMap<>();
        map.put("status", "ok");
        List<ScheduleJobModule> data = new ArrayList<>();
        ScheduleJobModule scheduleJobModule0 = new ScheduleJobModule();
        scheduleJobModule0.setJobName("job1");
        scheduleJobModule0.setJobGroupName("任务组1");
        scheduleJobModule0.setUrl("http://localhost:8080");
        scheduleJobModule0.setPriority(5);
        data.add(scheduleJobModule0);

        ScheduleJobModule scheduleJobModule1 = new ScheduleJobModule();
        scheduleJobModule1.setJobName("job1");
        scheduleJobModule1.setJobGroupName("任务组2");
        scheduleJobModule1.setUrl("http://localhost:8081");
        scheduleJobModule1.setPriority(5);
        data.add(scheduleJobModule1);

        map.put("jobs", data);
        return map;
    }
}
