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
 * Container
 * Pod中容器的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 执行exec，此接口需要升级Http协议到WebSocket
 */
public class ExecStartRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * execId
     * Required:true
     */
    @Required
    private String execId;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Pod ID
     * Required:true
     */
    @Required
    private String podId;

    /**
     * container name
     * Required:true
     */
    @Required
    private String containerName;


    /**
     * get execId
     *
     * @return
     */
    public String getExecId() {
        return execId;
    }

    /**
     * set execId
     *
     * @param execId
     */
    public void setExecId(String execId) {
        this.execId = execId;
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
     * get Pod ID
     *
     * @return
     */
    public String getPodId() {
        return podId;
    }

    /**
     * set Pod ID
     *
     * @param podId
     */
    public void setPodId(String podId) {
        this.podId = podId;
    }

    /**
     * get container name
     *
     * @return
     */
    public String getContainerName() {
        return containerName;
    }

    /**
     * set container name
     *
     * @param containerName
     */
    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }


    /**
     * set execId
     *
     * @param execId
     */
    public ExecStartRequest execId(String execId) {
        this.execId = execId;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ExecStartRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set Pod ID
     *
     * @param podId
     */
    public ExecStartRequest podId(String podId) {
        this.podId = podId;
        return this;
    }

    /**
     * set container name
     *
     * @param containerName
     */
    public ExecStartRequest containerName(String containerName) {
        this.containerName = containerName;
        return this;
    }


}