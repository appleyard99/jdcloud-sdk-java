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

package com.jdcloud.sdk.service.nativecontainer.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * 域名和IP映射的信息
 */
public class HostAliasSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名列表
     * Required:true
     */
    @Required
    private List<String> hostnames;

    /**
     * IP地址
     * Required:true
     */
    @Required
    private String ip;


    /**
     * get 域名列表
     *
     * @return
     */
    public List<String> getHostnames() {
        return hostnames;
    }

    /**
     * set 域名列表
     *
     * @param hostnames
     */
    public void setHostnames(List<String> hostnames) {
        this.hostnames = hostnames;
    }

    /**
     * get IP地址
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set IP地址
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }


    /**
     * set 域名列表
     *
     * @param hostnames
     */
    public HostAliasSpec hostnames(List<String> hostnames) {
        this.hostnames = hostnames;
        return this;
    }

    /**
     * set IP地址
     *
     * @param ip
     */
    public HostAliasSpec ip(String ip) {
        this.ip = ip;
        return this;
    }


    /**
     * add item to 域名列表
     *
     * @param hostname
     */
    public void addHostname(String hostname) {
        if (this.hostnames == null) {
            this.hostnames = new ArrayList<>();
        }
        this.hostnames.add(hostname);
    }

}