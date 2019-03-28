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
 * Vpc-Slb
 * 与负载均衡相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 启动监听器
 */
public class StartSlbListenerRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 监听器端口
     * Required:true
     */
    @Required
    private Integer listenerPort;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 负载均衡id
     * Required:true
     */
    @Required
    private String id;


    /**
     * get 监听器端口
     *
     * @return
     */
    public Integer getListenerPort() {
        return listenerPort;
    }

    /**
     * set 监听器端口
     *
     * @param listenerPort
     */
    public void setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
    }

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
     * get 负载均衡id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 负载均衡id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * set 监听器端口
     *
     * @param listenerPort
     */
    public StartSlbListenerRequest listenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public StartSlbListenerRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 负载均衡id
     *
     * @param id
     */
    public StartSlbListenerRequest id(String id) {
        this.id = id;
        return this;
    }


}