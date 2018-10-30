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
 * 镜像仓库认证信息
 * 关于镜像仓库认证信息的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.nc.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建一个 secret，用于存放镜像仓库机密相关信息。

 */
public class CreateSecretResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * secretName
     */
    private String secretName;


    /**
     * get secretName
     *
     * @return
     */
    public String getSecretName() {
        return secretName;
    }

    /**
     * set secretName
     *
     * @param secretName
     */
    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }


    /**
     * set secretName
     *
     * @param secretName
     */
    public CreateSecretResult secretName(String secretName) {
        this.secretName = secretName;
        return this;
    }


}