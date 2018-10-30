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
 * 网站监控
 * 云解析OpenAPI网站监控接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clouddnsservice.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询子域名的可用监控对象
 */
public class GetTargetsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 子域名
     * Required:true
     */
    @Required
    private String subDomainName;

    /**
     * 实例所属的地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 域名ID，请使用getDomains接口获取。
     * Required:true
     */
    @Required
    private String domainId;


    /**
     * get 子域名
     *
     * @return
     */
    public String getSubDomainName() {
        return subDomainName;
    }

    /**
     * set 子域名
     *
     * @param subDomainName
     */
    public void setSubDomainName(String subDomainName) {
        this.subDomainName = subDomainName;
    }

    /**
     * get 实例所属的地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 域名ID，请使用getDomains接口获取。
     *
     * @return
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * set 域名ID，请使用getDomains接口获取。
     *
     * @param domainId
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }


    /**
     * set 子域名
     *
     * @param subDomainName
     */
    public GetTargetsRequest subDomainName(String subDomainName) {
        this.subDomainName = subDomainName;
        return this;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public GetTargetsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 域名ID，请使用getDomains接口获取。
     *
     * @param domainId
     */
    public GetTargetsRequest domainId(String domainId) {
        this.domainId = domainId;
        return this;
    }


}