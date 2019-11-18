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
 * yunding-vm-instance
 * 云鼎-云主机实例相关的接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.yunding.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除按配置计费、或包年包月已到期的单个云主机。不能删除没有计费信息的云主机。&lt;br&gt;
云主机状态必须为运行&lt;b&gt;running&lt;/b&gt;、停止&lt;b&gt;stopped&lt;/b&gt;、错误&lt;b&gt;error&lt;/b&gt;，同时云主机没有正在进行中的任务才可删除。&lt;br&gt;
如果主机中挂载的数据盘为按配置计费的云硬盘且AutoDelete属性为true，那么数据盘会随主机一起删除。
 [MFA enabled]
 */
public class DeleteVmInstanceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 云主机ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 云主机ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云主机ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DeleteVmInstanceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 云主机ID
     *
     * @param instanceId
     */
    public DeleteVmInstanceRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}