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
 * 实例管理
 * API related to MONGODB instances
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mongodb.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改备份策略
 */
public class ModifyBackupPolicyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 备份时间，格式：HH:mmZ- HH:mmZ，只允许间隔时间为1小时的整点.
     * Required:true
     */
    @Required
    private String preferredBackupTime;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Instance ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 备份时间，格式：HH:mmZ- HH:mmZ，只允许间隔时间为1小时的整点.
     *
     * @return
     */
    public String getPreferredBackupTime() {
        return preferredBackupTime;
    }

    /**
     * set 备份时间，格式：HH:mmZ- HH:mmZ，只允许间隔时间为1小时的整点.
     *
     * @param preferredBackupTime
     */
    public void setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get Instance ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set Instance ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 备份时间，格式：HH:mmZ- HH:mmZ，只允许间隔时间为1小时的整点.
     *
     * @param preferredBackupTime
     */
    public ModifyBackupPolicyRequest preferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyBackupPolicyRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set Instance ID
     *
     * @param instanceId
     */
    public ModifyBackupPolicyRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}