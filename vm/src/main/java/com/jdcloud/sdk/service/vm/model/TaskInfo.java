/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;


/**
 * taskInfo
 */
public class TaskInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务id
     */
    private Integer taskId;

    /**
     * 任务操作类型
     */
    private String action;

    /**
     * 任务状态，pending,running,failed,finished
     */
    private String taskStatus;

    /**
     * 任务进度，0-100
     */
    private Integer progress;

    /**
     * 额外信息
     */
    private String message;

    /**
     * 任务创建时间
     */
    private String createdTime;

    /**
     * 任务完成时间
     */
    private String finishedTime;


    /**
     * get 任务id
     *
     * @return
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * set 任务id
     *
     * @param taskId
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    /**
     * get 任务操作类型
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 任务操作类型
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * get 任务状态，pending,running,failed,finished
     *
     * @return
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * set 任务状态，pending,running,failed,finished
     *
     * @param taskStatus
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * get 任务进度，0-100
     *
     * @return
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * set 任务进度，0-100
     *
     * @param progress
     */
    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    /**
     * get 额外信息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 额外信息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * get 任务创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 任务创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get 任务完成时间
     *
     * @return
     */
    public String getFinishedTime() {
        return finishedTime;
    }

    /**
     * set 任务完成时间
     *
     * @param finishedTime
     */
    public void setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
    }


    /**
     * set 任务id
     *
     * @param taskId
     */
    public TaskInfo taskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * set 任务操作类型
     *
     * @param action
     */
    public TaskInfo action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set 任务状态，pending,running,failed,finished
     *
     * @param taskStatus
     */
    public TaskInfo taskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * set 任务进度，0-100
     *
     * @param progress
     */
    public TaskInfo progress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * set 额外信息
     *
     * @param message
     */
    public TaskInfo message(String message) {
        this.message = message;
        return this;
    }

    /**
     * set 任务创建时间
     *
     * @param createdTime
     */
    public TaskInfo createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set 任务完成时间
     *
     * @param finishedTime
     */
    public TaskInfo finishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }


}