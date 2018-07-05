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

package com.jdcloud.sdk.service.xdata.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * dwInstance
 */
public class DwInstance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例名
     * Required:true
     */
    @Required
    private String instanceName;

    /**
     * 实例描述
     */
    private String comments;

    /**
     * 实例属主
     */
    private String instanceOwnerName;

    /**
     * 实例所属区域
     */
    private String area;

    /**
     * 实例别名（在页面显示）
     */
    private String uname;

    /**
     * 实例创建时间
     */
    private String createTime;


    /**
     * get 实例名
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 实例描述
     *
     * @return
     */
    public String getComments() {
        return comments;
    }

    /**
     * set 实例描述
     *
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * get 实例属主
     *
     * @return
     */
    public String getInstanceOwnerName() {
        return instanceOwnerName;
    }

    /**
     * set 实例属主
     *
     * @param instanceOwnerName
     */
    public void setInstanceOwnerName(String instanceOwnerName) {
        this.instanceOwnerName = instanceOwnerName;
    }

    /**
     * get 实例所属区域
     *
     * @return
     */
    public String getArea() {
        return area;
    }

    /**
     * set 实例所属区域
     *
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * get 实例别名（在页面显示）
     *
     * @return
     */
    public String getUname() {
        return uname;
    }

    /**
     * set 实例别名（在页面显示）
     *
     * @param uname
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * get 实例创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 实例创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * set 实例名
     *
     * @param instanceName
     */
    public DwInstance instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 实例描述
     *
     * @param comments
     */
    public DwInstance comments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * set 实例属主
     *
     * @param instanceOwnerName
     */
    public DwInstance instanceOwnerName(String instanceOwnerName) {
        this.instanceOwnerName = instanceOwnerName;
        return this;
    }

    /**
     * set 实例所属区域
     *
     * @param area
     */
    public DwInstance area(String area) {
        this.area = area;
        return this;
    }

    /**
     * set 实例别名（在页面显示）
     *
     * @param uname
     */
    public DwInstance uname(String uname) {
        this.uname = uname;
        return this;
    }

    /**
     * set 实例创建时间
     *
     * @param createTime
     */
    public DwInstance createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}