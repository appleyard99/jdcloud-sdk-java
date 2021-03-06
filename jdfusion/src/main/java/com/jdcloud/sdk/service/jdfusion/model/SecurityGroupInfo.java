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
 * 安全组详情
 */
public class SecurityGroupInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 注册云信息ID
     */
    private String cloudID;

    /**
     * 安全组 id
     */
    private String id;

    /**
     * 目标安全组名称
     */
    private String name;

    /**
     * 安全组描述信息
     */
    private String description;

    /**
     * VPC id
     */
    private String vpcId;

    /**
     * 创建时间
     */
    private String createdTime;


    /**
     * get 注册云信息ID
     *
     * @return
     */
    public String getCloudID() {
        return cloudID;
    }

    /**
     * set 注册云信息ID
     *
     * @param cloudID
     */
    public void setCloudID(String cloudID) {
        this.cloudID = cloudID;
    }

    /**
     * get 安全组 id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 安全组 id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 目标安全组名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 目标安全组名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 安全组描述信息
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 安全组描述信息
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get VPC id
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set VPC id
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * set 注册云信息ID
     *
     * @param cloudID
     */
    public SecurityGroupInfo cloudID(String cloudID) {
        this.cloudID = cloudID;
        return this;
    }

    /**
     * set 安全组 id
     *
     * @param id
     */
    public SecurityGroupInfo id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 目标安全组名称
     *
     * @param name
     */
    public SecurityGroupInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 安全组描述信息
     *
     * @param description
     */
    public SecurityGroupInfo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set VPC id
     *
     * @param vpcId
     */
    public SecurityGroupInfo vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public SecurityGroupInfo createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }


}