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
 * 敏感操作配置
 * 操作敏感操作配置接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.sop.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取操作保护设置信息
 */
public class GetSensitiveOpSettingRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作action serviceName:actionName
     * Required:true
     */
    @Required
    private String action;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 操作action serviceName:actionName
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 操作action serviceName:actionName
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
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
     * set 操作action serviceName:actionName
     *
     * @param action
     */
    public GetSensitiveOpSettingRequest action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public GetSensitiveOpSettingRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}