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

package com.jdcloud.sdk.service.live.model;


/**
 * restartPublishDomain
 */
public class RestartPublishDomain  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 推流域名
     */
    private String publishDomain;


    /**
     * get 推流域名
     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 推流域名
     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }


    /**
     * set 推流域名
     *
     * @param publishDomain
     */
    public RestartPublishDomain publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }


}