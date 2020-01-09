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

import com.jdcloud.sdk.annotation.Required;

/**
 * orgUser
 */
public class OrgUser  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 邮件地址
     */
    private String email;

    /**
     * login
     * Required:true
     */
    @Required
    private String login;

    /**
     * orgId
     */
    private Integer orgId;

    /**
     * 用户角色.   Admin、Editor、Viewer
     * Required:true
     */
    @Required
    private String role;


    /**
     * get 邮件地址
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮件地址
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get login
     *
     * @return
     */
    public String getLogin() {
        return login;
    }

    /**
     * set login
     *
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * get orgId
     *
     * @return
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * set orgId
     *
     * @param orgId
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * get 用户角色.   Admin、Editor、Viewer
     *
     * @return
     */
    public String getRole() {
        return role;
    }

    /**
     * set 用户角色.   Admin、Editor、Viewer
     *
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }


    /**
     * set 邮件地址
     *
     * @param email
     */
    public OrgUser email(String email) {
        this.email = email;
        return this;
    }

    /**
     * set login
     *
     * @param login
     */
    public OrgUser login(String login) {
        this.login = login;
        return this;
    }

    /**
     * set orgId
     *
     * @param orgId
     */
    public OrgUser orgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
     * set 用户角色.   Admin、Editor、Viewer
     *
     * @param role
     */
    public OrgUser role(String role) {
        this.role = role;
        return this;
    }


}