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
 * 修订版本
 * 提供修订版本的创建、查询、删除、修改、查重功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 修改单个修订版本
 */
public class ModifyRevisionResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 修改修订版本成功否
     */
    private Boolean updateRevision;


    /**
     * get 修改修订版本成功否
     *
     * @return
     */
    public Boolean getUpdateRevision() {
        return updateRevision;
    }

    /**
     * set 修改修订版本成功否
     *
     * @param updateRevision
     */
    public void setUpdateRevision(Boolean updateRevision) {
        this.updateRevision = updateRevision;
    }


    /**
     * set 修改修订版本成功否
     *
     * @param updateRevision
     */
    public ModifyRevisionResult updateRevision(Boolean updateRevision) {
        this.updateRevision = updateRevision;
        return this;
    }


}