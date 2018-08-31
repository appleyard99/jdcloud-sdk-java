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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 启用、停用、删除主域名下的解析记录
 */
public class OperateRRRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 需要操作的解析记录ID
     * Required:true
     */
    @Required
    private List<Integer> ids;

    /**
     * 操作类型，on-&gt;启用 off-&gt;停用 del-&gt;删除
     * Required:true
     */
    @Required
    private String action;

    /**
     * 实例所属的地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 域名ID
     * Required:true
     */
    @Required
    private String domainId;


    /**
     * get 需要操作的解析记录ID
     *
     * @return
     */
    public List<Integer> getIds() {
        return ids;
    }

    /**
     * set 需要操作的解析记录ID
     *
     * @param ids
     */
    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    /**
     * get 操作类型，on-&gt;启用 off-&gt;停用 del-&gt;删除
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 操作类型，on-&gt;启用 off-&gt;停用 del-&gt;删除
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * get 实例所属的地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 域名ID
     *
     * @return
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * set 域名ID
     *
     * @param domainId
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }


    /**
     * set 需要操作的解析记录ID
     *
     * @param ids
     */
    public OperateRRRequest ids(List<Integer> ids) {
        this.ids = ids;
        return this;
    }

    /**
     * set 操作类型，on-&gt;启用 off-&gt;停用 del-&gt;删除
     *
     * @param action
     */
    public OperateRRRequest action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public OperateRRRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 域名ID
     *
     * @param domainId
     */
    public OperateRRRequest domainId(String domainId) {
        this.domainId = domainId;
        return this;
    }


    /**
     * add item to 需要操作的解析记录ID
     *
     * @param id
     */
    public void addId(Integer id) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(id);
    }

}