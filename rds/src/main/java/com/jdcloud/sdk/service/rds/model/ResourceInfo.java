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

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;

/**
 * resourceInfo
 */
public class ResourceInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例id
     */
    private String resourceId;

    /**
     * 实例名称
     */
    private String resourceName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 绑定的资源
     */
    private List<ResourceInfo> bind;


    /**
     * get 实例id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 实例id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 实例名称
     *
     * @return
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * set 实例名称
     *
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * get 备注
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 备注
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * get 绑定的资源
     *
     * @return
     */
    public List<ResourceInfo> getBind() {
        return bind;
    }

    /**
     * set 绑定的资源
     *
     * @param bind
     */
    public void setBind(List<ResourceInfo> bind) {
        this.bind = bind;
    }


    /**
     * set 实例id
     *
     * @param resourceId
     */
    public ResourceInfo resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 实例名称
     *
     * @param resourceName
     */
    public ResourceInfo resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * set 备注
     *
     * @param remark
     */
    public ResourceInfo remark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * set 绑定的资源
     *
     * @param bind
     */
    public ResourceInfo bind(List<ResourceInfo> bind) {
        this.bind = bind;
        return this;
    }


    /**
     * add item to 绑定的资源
     *
     * @param bind
     */
    public void addBind(ResourceInfo bind) {
        if (this.bind == null) {
            this.bind = new ArrayList<>();
        }
        this.bind.add(bind);
    }

}