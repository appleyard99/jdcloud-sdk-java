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

package com.jdcloud.sdk.service.jdfusion.model;


/**
 * 负载均衡后端服务
 */
public class BackendServer  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 所属云ID
     */
    private String cloudID;

    /**
     * 负载均衡实例ID。
     */
    private String serverId;

    /**
     * 负载均衡实例的名称。
     */
    private String serverHealthStatus;

    /**
     * 后端服务器端口。
     */
    private Integer port;

    /**
     * 后端服务器的权重。
     */
    private Integer weight;

    /**
     * 后端服务器类型。
     */
    private String type;


    /**
     * get 所属云ID
     *
     * @return
     */
    public String getCloudID() {
        return cloudID;
    }

    /**
     * set 所属云ID
     *
     * @param cloudID
     */
    public void setCloudID(String cloudID) {
        this.cloudID = cloudID;
    }

    /**
     * get 负载均衡实例ID。
     *
     * @return
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * set 负载均衡实例ID。
     *
     * @param serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * get 负载均衡实例的名称。
     *
     * @return
     */
    public String getServerHealthStatus() {
        return serverHealthStatus;
    }

    /**
     * set 负载均衡实例的名称。
     *
     * @param serverHealthStatus
     */
    public void setServerHealthStatus(String serverHealthStatus) {
        this.serverHealthStatus = serverHealthStatus;
    }

    /**
     * get 后端服务器端口。
     *
     * @return
     */
    public Integer getPort() {
        return port;
    }

    /**
     * set 后端服务器端口。
     *
     * @param port
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * get 后端服务器的权重。
     *
     * @return
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * set 后端服务器的权重。
     *
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * get 后端服务器类型。
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 后端服务器类型。
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * set 所属云ID
     *
     * @param cloudID
     */
    public BackendServer cloudID(String cloudID) {
        this.cloudID = cloudID;
        return this;
    }

    /**
     * set 负载均衡实例ID。
     *
     * @param serverId
     */
    public BackendServer serverId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * set 负载均衡实例的名称。
     *
     * @param serverHealthStatus
     */
    public BackendServer serverHealthStatus(String serverHealthStatus) {
        this.serverHealthStatus = serverHealthStatus;
        return this;
    }

    /**
     * set 后端服务器端口。
     *
     * @param port
     */
    public BackendServer port(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * set 后端服务器的权重。
     *
     * @param weight
     */
    public BackendServer weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * set 后端服务器类型。
     *
     * @param type
     */
    public BackendServer type(String type) {
        this.type = type;
        return this;
    }


}