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
 * Domain Management
 * 域名管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;


/**
 * 设置域名URL访问控制规则配置请求消息体
 */
public class SetURLRuleRequestObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则配置对象
     */
    private Object config;

    /**
     * 是否启用该规则
     */
    private Boolean enabled;


    /**
     * get 规则配置对象
     *
     * @return
     */
    public Object getConfig() {
        return config;
    }

    /**
     * set 规则配置对象
     *
     * @param config
     */
    public void setConfig(Object config) {
        this.config = config;
    }

    /**
     * get 是否启用该规则
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set 是否启用该规则
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * set 规则配置对象
     *
     * @param config
     */
    public SetURLRuleRequestObject config(Object config) {
        this.config = config;
        return this;
    }

    /**
     * set 是否启用该规则
     *
     * @param enabled
     */
    public SetURLRuleRequestObject enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }


}