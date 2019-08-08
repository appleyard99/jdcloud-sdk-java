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
 * 解析记录
 * 云解析OpenAPI自定义线路接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.domainservice.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.domainservice.model.AddViewIP;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 添加主域名的自定义解析线路的IP段
 */
public class CreateUserViewIPRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 添加域名的自定义解析线路的IP段的参数
     * Required:true
     */
    @Required
    private AddViewIP req;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 域名ID，请使用describeDomains接口获取。
     * Required:true
     */
    @Required
    private String domainId;


    /**
     * get 添加域名的自定义解析线路的IP段的参数
     *
     * @return
     */
    public AddViewIP getReq() {
        return req;
    }

    /**
     * set 添加域名的自定义解析线路的IP段的参数
     *
     * @param req
     */
    public void setReq(AddViewIP req) {
        this.req = req;
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
     * get 域名ID，请使用describeDomains接口获取。
     *
     * @return
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * set 域名ID，请使用describeDomains接口获取。
     *
     * @param domainId
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }


    /**
     * set 添加域名的自定义解析线路的IP段的参数
     *
     * @param req
     */
    public CreateUserViewIPRequest req(AddViewIP req) {
        this.req = req;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateUserViewIPRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 域名ID，请使用describeDomains接口获取。
     *
     * @param domainId
     */
    public CreateUserViewIPRequest domainId(String domainId) {
        this.domainId = domainId;
        return this;
    }


}