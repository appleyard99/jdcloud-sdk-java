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

package com.jdcloud.sdk.service.vqd.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 检测任务结果信息
 */
public class VqdTaskResultObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务ID
     */
    private String taskId;

    /**
     * 结果状态。
- FINISHED_SUCCESS
- FINISHED_FAILURE

     */
    private String status;

    /**
     * defects
     */
    private List<VqdDefectObject> defects;

    /**
     * 错误码
     */
    private String errorCode;


    /**
     * get 任务ID
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 任务ID
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * get 结果状态。
- FINISHED_SUCCESS
- FINISHED_FAILURE

     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 结果状态。
- FINISHED_SUCCESS
- FINISHED_FAILURE

     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get defects
     *
     * @return
     */
    public List<VqdDefectObject> getDefects() {
        return defects;
    }

    /**
     * set defects
     *
     * @param defects
     */
    public void setDefects(List<VqdDefectObject> defects) {
        this.defects = defects;
    }

    /**
     * get 错误码
     *
     * @return
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * set 错误码
     *
     * @param errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * set 任务ID
     *
     * @param taskId
     */
    public VqdTaskResultObject taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * set 结果状态。
- FINISHED_SUCCESS
- FINISHED_FAILURE

     *
     * @param status
     */
    public VqdTaskResultObject status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set defects
     *
     * @param defects
     */
    public VqdTaskResultObject defects(List<VqdDefectObject> defects) {
        this.defects = defects;
        return this;
    }

    /**
     * set 错误码
     *
     * @param errorCode
     */
    public VqdTaskResultObject errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }


    /**
     * add item to defects
     *
     * @param defect
     */
    public void addDefect(VqdDefectObject defect) {
        if (this.defects == null) {
            this.defects = new ArrayList<>();
        }
        this.defects.add(defect);
    }

}