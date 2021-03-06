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

package com.jdcloud.sdk.service.es.model;


/**
 * instanceClassDetail
 */
public class InstanceClassDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规格代码，规格代码详情参见：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/specifications
     */
    private String instanceClassCode;

    /**
     * cpu核数
     */
    private Integer cpu;

    /**
     * 内存单位GB
     */
    private Integer memoryGB;

    /**
     * 存储大小单位GB
     */
    private Integer diskGB;


    /**
     * get 规格代码，规格代码详情参见：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/specifications
     *
     * @return
     */
    public String getInstanceClassCode() {
        return instanceClassCode;
    }

    /**
     * set 规格代码，规格代码详情参见：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/specifications
     *
     * @param instanceClassCode
     */
    public void setInstanceClassCode(String instanceClassCode) {
        this.instanceClassCode = instanceClassCode;
    }

    /**
     * get cpu核数
     *
     * @return
     */
    public Integer getCpu() {
        return cpu;
    }

    /**
     * set cpu核数
     *
     * @param cpu
     */
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * get 内存单位GB
     *
     * @return
     */
    public Integer getMemoryGB() {
        return memoryGB;
    }

    /**
     * set 内存单位GB
     *
     * @param memoryGB
     */
    public void setMemoryGB(Integer memoryGB) {
        this.memoryGB = memoryGB;
    }

    /**
     * get 存储大小单位GB
     *
     * @return
     */
    public Integer getDiskGB() {
        return diskGB;
    }

    /**
     * set 存储大小单位GB
     *
     * @param diskGB
     */
    public void setDiskGB(Integer diskGB) {
        this.diskGB = diskGB;
    }


    /**
     * set 规格代码，规格代码详情参见：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/specifications
     *
     * @param instanceClassCode
     */
    public InstanceClassDetail instanceClassCode(String instanceClassCode) {
        this.instanceClassCode = instanceClassCode;
        return this;
    }

    /**
     * set cpu核数
     *
     * @param cpu
     */
    public InstanceClassDetail cpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * set 内存单位GB
     *
     * @param memoryGB
     */
    public InstanceClassDetail memoryGB(Integer memoryGB) {
        this.memoryGB = memoryGB;
        return this;
    }

    /**
     * set 存储大小单位GB
     *
     * @param diskGB
     */
    public InstanceClassDetail diskGB(Integer diskGB) {
        this.diskGB = diskGB;
        return this;
    }


}