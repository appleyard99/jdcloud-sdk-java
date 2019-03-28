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

package com.jdcloud.sdk.service.jdfusion.model;


/**
 * 账号授权
 */
public class DeploymentAccountGrant  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String instId;

    /**
     * 账号名称
     */
    private String accountName;

    /**
     * 数据库名称
     */
    private String dbName;

    /**
     * 权限
     */
    private String privilege;


    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstId() {
        return instId;
    }

    /**
     * set 实例ID
     *
     * @param instId
     */
    public void setInstId(String instId) {
        this.instId = instId;
    }

    /**
     * get 账号名称
     *
     * @return
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * set 账号名称
     *
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * get 数据库名称
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名称
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get 权限
     *
     * @return
     */
    public String getPrivilege() {
        return privilege;
    }

    /**
     * set 权限
     *
     * @param privilege
     */
    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }


    /**
     * set 实例ID
     *
     * @param instId
     */
    public DeploymentAccountGrant instId(String instId) {
        this.instId = instId;
        return this;
    }

    /**
     * set 账号名称
     *
     * @param accountName
     */
    public DeploymentAccountGrant accountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * set 数据库名称
     *
     * @param dbName
     */
    public DeploymentAccountGrant dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set 权限
     *
     * @param privilege
     */
    public DeploymentAccountGrant privilege(String privilege) {
        this.privilege = privilege;
        return this;
    }


}