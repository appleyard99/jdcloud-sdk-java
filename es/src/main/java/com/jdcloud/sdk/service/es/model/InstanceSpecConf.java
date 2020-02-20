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

import java.util.List;
import java.util.ArrayList;

/**
 * instanceSpecConf
 */
public class InstanceSpecConf  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * es版本
     */
    private List<String> version;

    /**
     * 规格详情
     */
    private List<InstanceClassDetail> instanceClassDetail;

    /**
     * az的配置
     */
    private List<AzConf> azConf;


    /**
     * get es版本
     *
     * @return
     */
    public List<String> getVersion() {
        return version;
    }

    /**
     * set es版本
     *
     * @param version
     */
    public void setVersion(List<String> version) {
        this.version = version;
    }

    /**
     * get 规格详情
     *
     * @return
     */
    public List<InstanceClassDetail> getInstanceClassDetail() {
        return instanceClassDetail;
    }

    /**
     * set 规格详情
     *
     * @param instanceClassDetail
     */
    public void setInstanceClassDetail(List<InstanceClassDetail> instanceClassDetail) {
        this.instanceClassDetail = instanceClassDetail;
    }

    /**
     * get az的配置
     *
     * @return
     */
    public List<AzConf> getAzConf() {
        return azConf;
    }

    /**
     * set az的配置
     *
     * @param azConf
     */
    public void setAzConf(List<AzConf> azConf) {
        this.azConf = azConf;
    }


    /**
     * set es版本
     *
     * @param version
     */
    public InstanceSpecConf version(List<String> version) {
        this.version = version;
        return this;
    }

    /**
     * set 规格详情
     *
     * @param instanceClassDetail
     */
    public InstanceSpecConf instanceClassDetail(List<InstanceClassDetail> instanceClassDetail) {
        this.instanceClassDetail = instanceClassDetail;
        return this;
    }

    /**
     * set az的配置
     *
     * @param azConf
     */
    public InstanceSpecConf azConf(List<AzConf> azConf) {
        this.azConf = azConf;
        return this;
    }


    /**
     * add item to es版本
     *
     * @param version
     */
    public void addVersion(String version) {
        if (this.version == null) {
            this.version = new ArrayList<>();
        }
        this.version.add(version);
    }

    /**
     * add item to 规格详情
     *
     * @param instanceClassDetail
     */
    public void addInstanceClassDetail(InstanceClassDetail instanceClassDetail) {
        if (this.instanceClassDetail == null) {
            this.instanceClassDetail = new ArrayList<>();
        }
        this.instanceClassDetail.add(instanceClassDetail);
    }

    /**
     * add item to az的配置
     *
     * @param azConf
     */
    public void addAzConf(AzConf azConf) {
        if (this.azConf == null) {
            this.azConf = new ArrayList<>();
        }
        this.azConf.add(azConf);
    }

}