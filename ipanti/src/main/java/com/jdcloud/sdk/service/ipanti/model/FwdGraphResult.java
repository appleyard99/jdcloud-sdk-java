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
 * Ip高防报表相关接口
 * Ip高防报表相关接口，包括cc防护、ddos防护、转发流量
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 转发流量报表
 */
public class FwdGraphResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * forwardRecord
     */
    private List<Float> forwardRecord;

    /**
     * time
     */
    private List<Long> time;

    /**
     * 单位
     */
    private String unit;


    /**
     * get forwardRecord
     *
     * @return
     */
    public List<Float> getForwardRecord() {
        return forwardRecord;
    }

    /**
     * set forwardRecord
     *
     * @param forwardRecord
     */
    public void setForwardRecord(List<Float> forwardRecord) {
        this.forwardRecord = forwardRecord;
    }

    /**
     * get time
     *
     * @return
     */
    public List<Long> getTime() {
        return time;
    }

    /**
     * set time
     *
     * @param time
     */
    public void setTime(List<Long> time) {
        this.time = time;
    }

    /**
     * get 单位
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set 单位
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }


    /**
     * set forwardRecord
     *
     * @param forwardRecord
     */
    public FwdGraphResult forwardRecord(List<Float> forwardRecord) {
        this.forwardRecord = forwardRecord;
        return this;
    }

    /**
     * set time
     *
     * @param time
     */
    public FwdGraphResult time(List<Long> time) {
        this.time = time;
        return this;
    }

    /**
     * set 单位
     *
     * @param unit
     */
    public FwdGraphResult unit(String unit) {
        this.unit = unit;
        return this;
    }


    /**
     * add item to forwardRecord
     *
     * @param forwardRecord
     */
    public void addForwardRecord(Float forwardRecord) {
        if (this.forwardRecord == null) {
            this.forwardRecord = new ArrayList<>();
        }
        this.forwardRecord.add(forwardRecord);
    }

    /**
     * add item to time
     *
     * @param time
     */
    public void addTime(Long time) {
        if (this.time == null) {
            this.time = new ArrayList<>();
        }
        this.time.add(time);
    }

}