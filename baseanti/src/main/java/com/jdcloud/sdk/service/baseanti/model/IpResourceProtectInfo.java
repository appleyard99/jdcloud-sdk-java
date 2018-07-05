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

package com.jdcloud.sdk.service.baseanti.model;


/**
 * ipResourceProtectInfo
 */
public class IpResourceProtectInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 攻击开始时间
     */
    private String startTime;

    /**
     * 攻击结束时间
     */
    private String endTime;

    /**
     * 状态，0-&gt;完成，1-&gt;清洗，2-&gt;黑洞
     */
    private Integer status;

    /**
     * 触发原因，0-&gt;未知，1-&gt;四层，2-&gt;七层，3-&gt;四和7层
     */
    private Integer cause;


    /**
     * get 攻击开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 攻击开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 攻击结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 攻击结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 状态，0-&gt;完成，1-&gt;清洗，2-&gt;黑洞
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态，0-&gt;完成，1-&gt;清洗，2-&gt;黑洞
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 触发原因，0-&gt;未知，1-&gt;四层，2-&gt;七层，3-&gt;四和7层
     *
     * @return
     */
    public Integer getCause() {
        return cause;
    }

    /**
     * set 触发原因，0-&gt;未知，1-&gt;四层，2-&gt;七层，3-&gt;四和7层
     *
     * @param cause
     */
    public void setCause(Integer cause) {
        this.cause = cause;
    }


    /**
     * set 攻击开始时间
     *
     * @param startTime
     */
    public IpResourceProtectInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 攻击结束时间
     *
     * @param endTime
     */
    public IpResourceProtectInfo endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 状态，0-&gt;完成，1-&gt;清洗，2-&gt;黑洞
     *
     * @param status
     */
    public IpResourceProtectInfo status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 触发原因，0-&gt;未知，1-&gt;四层，2-&gt;七层，3-&gt;四和7层
     *
     * @param cause
     */
    public IpResourceProtectInfo cause(Integer cause) {
        this.cause = cause;
        return this;
    }


}