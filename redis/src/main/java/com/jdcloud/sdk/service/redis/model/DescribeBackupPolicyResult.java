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
 * Redis Instance API
 * 缓存Redis实例的创建、删除、修改基本信息、设置密码、变配、列表查询、备份、配置参数接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询缓存Redis实例的自动备份策略
 */
public class DescribeBackupPolicyResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 备份周期，包括：Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday，多个用逗号分隔
     */
    private String backupPeriod;

    /**
     * 备份时间，格式为：HH:mm-HH:mm 时区，例如&quot;01:00-02:00 +0800&quot;，表示东八区的1点到2点
     */
    private String backupTime;

    /**
     * 下次自动备份时间段，ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ~YYYY-MM-DDTHH:mm:ssZ
     */
    private String nextBackupTime;


    /**
     * get 备份周期，包括：Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday，多个用逗号分隔
     *
     * @return
     */
    public String getBackupPeriod() {
        return backupPeriod;
    }

    /**
     * set 备份周期，包括：Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday，多个用逗号分隔
     *
     * @param backupPeriod
     */
    public void setBackupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
    }

    /**
     * get 备份时间，格式为：HH:mm-HH:mm 时区，例如&quot;01:00-02:00 +0800&quot;，表示东八区的1点到2点
     *
     * @return
     */
    public String getBackupTime() {
        return backupTime;
    }

    /**
     * set 备份时间，格式为：HH:mm-HH:mm 时区，例如&quot;01:00-02:00 +0800&quot;，表示东八区的1点到2点
     *
     * @param backupTime
     */
    public void setBackupTime(String backupTime) {
        this.backupTime = backupTime;
    }

    /**
     * get 下次自动备份时间段，ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ~YYYY-MM-DDTHH:mm:ssZ
     *
     * @return
     */
    public String getNextBackupTime() {
        return nextBackupTime;
    }

    /**
     * set 下次自动备份时间段，ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ~YYYY-MM-DDTHH:mm:ssZ
     *
     * @param nextBackupTime
     */
    public void setNextBackupTime(String nextBackupTime) {
        this.nextBackupTime = nextBackupTime;
    }


    /**
     * set 备份周期，包括：Monday，Tuesday，Wednesday，Thursday，Friday，Saturday，Sunday，多个用逗号分隔
     *
     * @param backupPeriod
     */
    public DescribeBackupPolicyResult backupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
        return this;
    }

    /**
     * set 备份时间，格式为：HH:mm-HH:mm 时区，例如&quot;01:00-02:00 +0800&quot;，表示东八区的1点到2点
     *
     * @param backupTime
     */
    public DescribeBackupPolicyResult backupTime(String backupTime) {
        this.backupTime = backupTime;
        return this;
    }

    /**
     * set 下次自动备份时间段，ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ~YYYY-MM-DDTHH:mm:ssZ
     *
     * @param nextBackupTime
     */
    public DescribeBackupPolicyResult nextBackupTime(String nextBackupTime) {
        this.nextBackupTime = nextBackupTime;
        return this;
    }


}