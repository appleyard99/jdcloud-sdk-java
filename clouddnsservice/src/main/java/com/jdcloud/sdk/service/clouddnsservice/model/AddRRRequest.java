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
 * 云解析OpenAPI解析记录接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clouddnsservice.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.clouddnsservice.model.AddRR;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 添加域名的解析记录
 */
public class AddRRRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * RR参数
     * Required:true
     */
    @Required
    private AddRR req;

    /**
     * 实例所属的地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 域名ID
     * Required:true
     */
    @Required
    private String domainId;


    /**
     * get RR参数
     *
     * @return
     */
    public AddRR getReq() {
        return req;
    }

    /**
     * set RR参数
     *
     * @param req
     */
    public void setReq(AddRR req) {
        this.req = req;
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
     * get 域名ID
     *
     * @return
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * set 域名ID
     *
     * @param domainId
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }


    /**
     * set RR参数
     *
     * @param req
     */
    public AddRRRequest req(AddRR req) {
        this.req = req;
        return this;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public AddRRRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 域名ID
     *
     * @param domainId
     */
    public AddRRRequest domainId(String domainId) {
        this.domainId = domainId;
        return this;
    }


}