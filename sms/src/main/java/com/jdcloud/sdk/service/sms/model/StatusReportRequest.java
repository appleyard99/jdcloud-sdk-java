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
 * Send-Message-Related-APIs
 * 短信发送相关API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.sms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 短信发送回执接口
 */
public class StatusReportRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 发送短信的序列号
     * Required:true
     */
    @Required
    private String sequenceNumber;

    /**
     * 需要获取回执的手机号码列表，选填
     */
    private List<String> phoneList;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 发送短信的序列号
     *
     * @return
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * set 发送短信的序列号
     *
     * @param sequenceNumber
     */
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * get 需要获取回执的手机号码列表，选填
     *
     * @return
     */
    public List<String> getPhoneList() {
        return phoneList;
    }

    /**
     * set 需要获取回执的手机号码列表，选填
     *
     * @param phoneList
     */
    public void setPhoneList(List<String> phoneList) {
        this.phoneList = phoneList;
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
     * set 发送短信的序列号
     *
     * @param sequenceNumber
     */
    public StatusReportRequest sequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * set 需要获取回执的手机号码列表，选填
     *
     * @param phoneList
     */
    public StatusReportRequest phoneList(List<String> phoneList) {
        this.phoneList = phoneList;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public StatusReportRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 需要获取回执的手机号码列表，选填
     *
     * @param phoneList
     */
    public void addPhoneList(String phoneList) {
        if (this.phoneList == null) {
            this.phoneList = new ArrayList<>();
        }
        this.phoneList.add(phoneList);
    }

}