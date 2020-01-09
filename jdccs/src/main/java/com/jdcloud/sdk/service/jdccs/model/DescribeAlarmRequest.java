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
 * Alarm API
 * 云托管服务的报警API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdccs.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询报警规则详情
 */
public class DescribeAlarmRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 报警规则ID
     * Required:true
     */
    @Required
    private String alarmId;


    /**
     * get 报警规则ID
     *
     * @return
     */
    public String getAlarmId() {
        return alarmId;
    }

    /**
     * set 报警规则ID
     *
     * @param alarmId
     */
    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }


    /**
     * set 报警规则ID
     *
     * @param alarmId
     */
    public DescribeAlarmRequest alarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }


}