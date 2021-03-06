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

package com.jdcloud.sdk.service.iotedge.model;


/**
 * devices
 */
public class Devices  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备编号
     */
    private String deviceId;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 设备三元组-producyKey
     */
    private String productKey;

    /**
     * 设备对应的secret-identifier
     */
    private String identifier;

    /**
     * 设备描述
     */
    private String desc;

    /**
     * 设备服务对应的名称
     */
    private String dsDisplayName;

    /**
     * 设备在线状态
     */
    private String status;

    /**
     * 设备命令执行状态[ADDING-添加中，UPDATING-修改中，UPDATE_FAILED-修改失败，DELETING-删除中，空-当前无命令执行]
     */
    private String deviceServiceStatus;


    /**
     * get 设备编号
     *
     * @return
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * set 设备编号
     *
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * get 设备名称
     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 设备名称
     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * get 产品名称
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     * set 产品名称
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * get 设备三元组-producyKey
     *
     * @return
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * set 设备三元组-producyKey
     *
     * @param productKey
     */
    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    /**
     * get 设备对应的secret-identifier
     *
     * @return
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * set 设备对应的secret-identifier
     *
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * get 设备描述
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 设备描述
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * get 设备服务对应的名称
     *
     * @return
     */
    public String getDsDisplayName() {
        return dsDisplayName;
    }

    /**
     * set 设备服务对应的名称
     *
     * @param dsDisplayName
     */
    public void setDsDisplayName(String dsDisplayName) {
        this.dsDisplayName = dsDisplayName;
    }

    /**
     * get 设备在线状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 设备在线状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 设备命令执行状态[ADDING-添加中，UPDATING-修改中，UPDATE_FAILED-修改失败，DELETING-删除中，空-当前无命令执行]
     *
     * @return
     */
    public String getDeviceServiceStatus() {
        return deviceServiceStatus;
    }

    /**
     * set 设备命令执行状态[ADDING-添加中，UPDATING-修改中，UPDATE_FAILED-修改失败，DELETING-删除中，空-当前无命令执行]
     *
     * @param deviceServiceStatus
     */
    public void setDeviceServiceStatus(String deviceServiceStatus) {
        this.deviceServiceStatus = deviceServiceStatus;
    }


    /**
     * set 设备编号
     *
     * @param deviceId
     */
    public Devices deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * set 设备名称
     *
     * @param deviceName
     */
    public Devices deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * set 产品名称
     *
     * @param productName
     */
    public Devices productName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * set 设备三元组-producyKey
     *
     * @param productKey
     */
    public Devices productKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * set 设备对应的secret-identifier
     *
     * @param identifier
     */
    public Devices identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * set 设备描述
     *
     * @param desc
     */
    public Devices desc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * set 设备服务对应的名称
     *
     * @param dsDisplayName
     */
    public Devices dsDisplayName(String dsDisplayName) {
        this.dsDisplayName = dsDisplayName;
        return this;
    }

    /**
     * set 设备在线状态
     *
     * @param status
     */
    public Devices status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 设备命令执行状态[ADDING-添加中，UPDATING-修改中，UPDATE_FAILED-修改失败，DELETING-删除中，空-当前无命令执行]
     *
     * @param deviceServiceStatus
     */
    public Devices deviceServiceStatus(String deviceServiceStatus) {
        this.deviceServiceStatus = deviceServiceStatus;
        return this;
    }


}