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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询播放鉴权KEY
 */
public class DescribeLivePlayAuthKeyResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 播放域名
     */
    private String playDomain;

    /**
     * 播放鉴权状态
  on: 开启
  off: 关闭

     */
    private String authStatus;

    /**
     * 播放鉴权key
     */
    private String authKey;


    /**
     * get 播放域名
     *
     * @return
     */
    public String getPlayDomain() {
        return playDomain;
    }

    /**
     * set 播放域名
     *
     * @param playDomain
     */
    public void setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
    }

    /**
     * get 播放鉴权状态
  on: 开启
  off: 关闭

     *
     * @return
     */
    public String getAuthStatus() {
        return authStatus;
    }

    /**
     * set 播放鉴权状态
  on: 开启
  off: 关闭

     *
     * @param authStatus
     */
    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }

    /**
     * get 播放鉴权key
     *
     * @return
     */
    public String getAuthKey() {
        return authKey;
    }

    /**
     * set 播放鉴权key
     *
     * @param authKey
     */
    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }


    /**
     * set 播放域名
     *
     * @param playDomain
     */
    public DescribeLivePlayAuthKeyResult playDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }

    /**
     * set 播放鉴权状态
  on: 开启
  off: 关闭

     *
     * @param authStatus
     */
    public DescribeLivePlayAuthKeyResult authStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }

    /**
     * set 播放鉴权key
     *
     * @param authKey
     */
    public DescribeLivePlayAuthKeyResult authKey(String authKey) {
        this.authKey = authKey;
        return this;
    }


}