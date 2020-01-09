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

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * updateDynamicSpec
 */
public class UpdateDynamicSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品动态中文描述
     * Required:true
     */
    @Required
    private String dynamicDetailCN;

    /**
     * 产品动态英文描述
     * Required:true
     */
    @Required
    private String dynamicDetailEN;

    /**
     * 产品动态类型 1-新产品 2-新功能 3-功能调整 4-其它
     * Required:true
     */
    @Required
    private Long dynamicType;

    /**
     * 产品动态链接地址
     */
    private String dynamicUrl;


    /**
     * get 产品动态中文描述
     *
     * @return
     */
    public String getDynamicDetailCN() {
        return dynamicDetailCN;
    }

    /**
     * set 产品动态中文描述
     *
     * @param dynamicDetailCN
     */
    public void setDynamicDetailCN(String dynamicDetailCN) {
        this.dynamicDetailCN = dynamicDetailCN;
    }

    /**
     * get 产品动态英文描述
     *
     * @return
     */
    public String getDynamicDetailEN() {
        return dynamicDetailEN;
    }

    /**
     * set 产品动态英文描述
     *
     * @param dynamicDetailEN
     */
    public void setDynamicDetailEN(String dynamicDetailEN) {
        this.dynamicDetailEN = dynamicDetailEN;
    }

    /**
     * get 产品动态类型 1-新产品 2-新功能 3-功能调整 4-其它
     *
     * @return
     */
    public Long getDynamicType() {
        return dynamicType;
    }

    /**
     * set 产品动态类型 1-新产品 2-新功能 3-功能调整 4-其它
     *
     * @param dynamicType
     */
    public void setDynamicType(Long dynamicType) {
        this.dynamicType = dynamicType;
    }

    /**
     * get 产品动态链接地址
     *
     * @return
     */
    public String getDynamicUrl() {
        return dynamicUrl;
    }

    /**
     * set 产品动态链接地址
     *
     * @param dynamicUrl
     */
    public void setDynamicUrl(String dynamicUrl) {
        this.dynamicUrl = dynamicUrl;
    }


    /**
     * set 产品动态中文描述
     *
     * @param dynamicDetailCN
     */
    public UpdateDynamicSpec dynamicDetailCN(String dynamicDetailCN) {
        this.dynamicDetailCN = dynamicDetailCN;
        return this;
    }

    /**
     * set 产品动态英文描述
     *
     * @param dynamicDetailEN
     */
    public UpdateDynamicSpec dynamicDetailEN(String dynamicDetailEN) {
        this.dynamicDetailEN = dynamicDetailEN;
        return this;
    }

    /**
     * set 产品动态类型 1-新产品 2-新功能 3-功能调整 4-其它
     *
     * @param dynamicType
     */
    public UpdateDynamicSpec dynamicType(Long dynamicType) {
        this.dynamicType = dynamicType;
        return this;
    }

    /**
     * set 产品动态链接地址
     *
     * @param dynamicUrl
     */
    public UpdateDynamicSpec dynamicUrl(String dynamicUrl) {
        this.dynamicUrl = dynamicUrl;
        return this;
    }


}