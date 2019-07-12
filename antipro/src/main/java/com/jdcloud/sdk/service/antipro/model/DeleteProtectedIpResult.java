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
 * Instance APIs
 * Anti DDoS Protection Package Instance APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.antipro.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 删除防护包防护 IP
 */
public class DeleteProtectedIpResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 删除防护 IP 结果, 0: 删除失败, 1: 删除成功
     */
    private Integer code;

    /**
     * 删除失败时给出具体原因
     */
    private String message;


    /**
     * get 删除防护 IP 结果, 0: 删除失败, 1: 删除成功
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * set 删除防护 IP 结果, 0: 删除失败, 1: 删除成功
     *
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * get 删除失败时给出具体原因
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 删除失败时给出具体原因
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * set 删除防护 IP 结果, 0: 删除失败, 1: 删除成功
     *
     * @param code
     */
    public DeleteProtectedIpResult code(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * set 删除失败时给出具体原因
     *
     * @param message
     */
    public DeleteProtectedIpResult message(String message) {
        this.message = message;
        return this;
    }


}