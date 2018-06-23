package com.msa.scheduler;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author sxp
 */
public class ScheduleJobModule {
    @NotBlank(message = "jobName is required")
    private String jobName;
    @NotBlank(message = "jobGroupName is required")
    private String jobGroupName;
    @NotBlank(message = "triggerName is required")
    private String triggerName;
    @NotBlank(message = "triggerGroupName is required")
    private String triggerGroupName;
    @NotBlank(message = "cron is required")
    private String cron;
    private int priority = 6;
    private int misfire = 5;
    private String applicationId;
    private String uri;
    private String url;
    private String jobDescription;
    private String triggerDescription;
    private boolean startNow;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroupName() {
        return jobGroupName;
    }

    public void setJobGroupName(String jobGroupName) {
        this.jobGroupName = jobGroupName;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroupName() {
        return triggerGroupName;
    }

    public void setTriggerGroupName(String triggerGroupName) {
        this.triggerGroupName = triggerGroupName;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getMisfire() {
        return misfire;
    }

    public void setMisfire(int misfire) {
        this.misfire = misfire;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getTriggerDescription() {
        return triggerDescription;
    }

    public void setTriggerDescription(String triggerDescription) {
        this.triggerDescription = triggerDescription;
    }

    public boolean isStartNow() {
        return startNow;
    }

    public void setStartNow(boolean startNow) {
        this.startNow = startNow;
    }
}
