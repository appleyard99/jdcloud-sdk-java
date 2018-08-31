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

import com.jdcloud.sdk.service.clouddnsservice.model.RR;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 添加域名的解析记录
 */
public class AddRRResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 添加成功后的解析记录结果
     */
    private RR dataList;


    /**
     * get 添加成功后的解析记录结果
     *
     * @return
     */
    public RR getDataList() {
        return dataList;
    }

    /**
     * set 添加成功后的解析记录结果
     *
     * @param dataList
     */
    public void setDataList(RR dataList) {
        this.dataList = dataList;
    }


    /**
     * set 添加成功后的解析记录结果
     *
     * @param dataList
     */
    public AddRRResult dataList(RR dataList) {
        this.dataList = dataList;
        return this;
    }


}