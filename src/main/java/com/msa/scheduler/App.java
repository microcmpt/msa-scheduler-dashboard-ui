package com.msa.scheduler;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        scheduleJobModule0.setUrl("http://localhost:8080/hello");
        scheduleJobModule0.setPriority(5);
        scheduleJobModule0.setApplicationId("msa-scheduler");
        scheduleJobModule0.setUri("/hello");
        scheduleJobModule0.setMisfire(6);
        scheduleJobModule0.setJobDescription("任务2描述");
        data.add(scheduleJobModule0);

        ScheduleJobModule scheduleJobModule1 = new ScheduleJobModule();
        scheduleJobModule1.setJobName("job1");
        scheduleJobModule1.setJobGroupName("任务组2");
        scheduleJobModule1.setUrl("http://localhost:8081/hello");
        scheduleJobModule1.setPriority(5);
        scheduleJobModule1.setApplicationId("msa-scheduler");
        scheduleJobModule1.setUri("/hello");
        scheduleJobModule1.setMisfire(6);
        scheduleJobModule1.setJobDescription("任务2描述");
        data.add(scheduleJobModule1);

        map.put("jobs", data);
        return map;
    }

    @PostMapping(value = "/api/v1/add", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Map<String, Object> add(@RequestBody ScheduleJobModule jobModule) {
        Map<String, Object> result = new HashMap<>();
        result.put("status", "ok");
        result.put("message", "操作成功！");
        return result;
    }
}
