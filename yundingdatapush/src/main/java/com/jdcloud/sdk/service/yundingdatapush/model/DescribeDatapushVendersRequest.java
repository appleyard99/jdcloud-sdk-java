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
 * yunding-datapush
 * 云鼎数据推送OPENAPI接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.yundingdatapush.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询已经开通的用户
 */
public class DescribeDatapushVendersRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * appkey
     * Required:true
     */
    @Required
    private String appkey;

    /**
     * 页码
     */
    private Integer pageNumber;

    /**
     * 页大小
     */
    private Integer pageSize;

    /**
     * 云鼎数据库实例ID
     */
    private String ydRdsInstanceId;

    /**
     * 数据库实例名称
     */
    private String rdsInstanceName;

    /**
     * 商家ID
     */
    private String venderId;

    /**
     * 商家店铺名称
     */
    private String venderName;


    /**
     * get appkey
     *
     * @return
     */
    public String getAppkey() {
        return appkey;
    }

    /**
     * set appkey
     *
     * @param appkey
     */
    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 页大小
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页大小
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 云鼎数据库实例ID
     *
     * @return
     */
    public String getYdRdsInstanceId() {
        return ydRdsInstanceId;
    }

    /**
     * set 云鼎数据库实例ID
     *
     * @param ydRdsInstanceId
     */
    public void setYdRdsInstanceId(String ydRdsInstanceId) {
        this.ydRdsInstanceId = ydRdsInstanceId;
    }

    /**
     * get 数据库实例名称
     *
     * @return
     */
    public String getRdsInstanceName() {
        return rdsInstanceName;
    }

    /**
     * set 数据库实例名称
     *
     * @param rdsInstanceName
     */
    public void setRdsInstanceName(String rdsInstanceName) {
        this.rdsInstanceName = rdsInstanceName;
    }

    /**
     * get 商家ID
     *
     * @return
     */
    public String getVenderId() {
        return venderId;
    }

    /**
     * set 商家ID
     *
     * @param venderId
     */
    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    /**
     * get 商家店铺名称
     *
     * @return
     */
    public String getVenderName() {
        return venderName;
    }

    /**
     * set 商家店铺名称
     *
     * @param venderName
     */
    public void setVenderName(String venderName) {
        this.venderName = venderName;
    }


    /**
     * set appkey
     *
     * @param appkey
     */
    public DescribeDatapushVendersRequest appkey(String appkey) {
        this.appkey = appkey;
        return this;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public DescribeDatapushVendersRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 页大小
     *
     * @param pageSize
     */
    public DescribeDatapushVendersRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 云鼎数据库实例ID
     *
     * @param ydRdsInstanceId
     */
    public DescribeDatapushVendersRequest ydRdsInstanceId(String ydRdsInstanceId) {
        this.ydRdsInstanceId = ydRdsInstanceId;
        return this;
    }

    /**
     * set 数据库实例名称
     *
     * @param rdsInstanceName
     */
    public DescribeDatapushVendersRequest rdsInstanceName(String rdsInstanceName) {
        this.rdsInstanceName = rdsInstanceName;
        return this;
    }

    /**
     * set 商家ID
     *
     * @param venderId
     */
    public DescribeDatapushVendersRequest venderId(String venderId) {
        this.venderId = venderId;
        return this;
    }

    /**
     * set 商家店铺名称
     *
     * @param venderName
     */
    public DescribeDatapushVendersRequest venderName(String venderName) {
        this.venderName = venderName;
        return this;
    }


}