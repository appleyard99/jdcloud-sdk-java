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

package com.jdcloud.sdk.service.monitor.model;


/**
 * org
 */
public class Org  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ark名称
     */
    private String arkName;

    /**
     * org id
     */
    private Integer orgId;

    /**
     * org名称
     */
    private String orgName;


    /**
     * get ark名称
     *
     * @return
     */
    public String getArkName() {
        return arkName;
    }

    /**
     * set ark名称
     *
     * @param arkName
     */
    public void setArkName(String arkName) {
        this.arkName = arkName;
    }

    /**
     * get org id
     *
     * @return
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * set org id
     *
     * @param orgId
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * get org名称
     *
     * @return
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * set org名称
     *
     * @param orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }


    /**
     * set ark名称
     *
     * @param arkName
     */
    public Org arkName(String arkName) {
        this.arkName = arkName;
        return this;
    }

    /**
     * set org id
     *
     * @param orgId
     */
    public Org orgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
     * set org名称
     *
     * @param orgName
     */
    public Org orgName(String orgName) {
        this.orgName = orgName;
        return this;
    }


}