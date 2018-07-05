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
 * table相关接口
 * API related to XDATA-DW query
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.xdata.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取查询日志
 */
public class GetRasQueryLogResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * status
     */
    private Boolean status;

    /**
     * message
     */
    private String message;


    /**
     * get status
     *
     * @return
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * set status
     *
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * get message
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set message
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * set status
     *
     * @param status
     */
    public GetRasQueryLogResult status(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * set message
     *
     * @param message
     */
    public GetRasQueryLogResult message(String message) {
        this.message = message;
        return this;
    }


}