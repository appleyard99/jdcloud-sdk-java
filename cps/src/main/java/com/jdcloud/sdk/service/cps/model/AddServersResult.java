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
 * 云物理服务器
 * 云物理服务器后端服务器操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 添加后端服务器
 */
public class AddServersResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * serverIds
     */
    private List<String> serverIds;


    /**
     * get serverIds
     *
     * @return
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    /**
     * set serverIds
     *
     * @param serverIds
     */
    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }


    /**
     * set serverIds
     *
     * @param serverIds
     */
    public AddServersResult serverIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }


    /**
     * add item to serverIds
     *
     * @param serverId
     */
    public void addServerId(String serverId) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverId);
    }

}