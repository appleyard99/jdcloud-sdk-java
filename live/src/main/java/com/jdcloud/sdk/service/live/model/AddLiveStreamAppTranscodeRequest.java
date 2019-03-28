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

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 添加应用转码配置
- 添加应用级别的转码模板配置

 */
public class AddLiveStreamAppTranscodeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 推流域名
     * Required:true
     */
    @Required
    private String publishDomain;

    /**
     * 应用名称
     * Required:true
     */
    @Required
    private String appName;

    /**
     * 转码模版
- 取值范围: 系统标准转码模板, 用户自定义转码模板
- 系统标准转码模板
  ld (h.264/640*360/15f)
  sd (h.264/854*480/24f)
  hd (h.264/1280*720/25f)
  shd (h.264/1920*1080/30f)

     * Required:true
     */
    @Required
    private String template;


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
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get 转码模版
- 取值范围: 系统标准转码模板, 用户自定义转码模板
- 系统标准转码模板
  ld (h.264/640*360/15f)
  sd (h.264/854*480/24f)
  hd (h.264/1280*720/25f)
  shd (h.264/1920*1080/30f)

     *
     * @return
     */
    public String getTemplate() {
        return template;
    }

    /**
     * set 转码模版
- 取值范围: 系统标准转码模板, 用户自定义转码模板
- 系统标准转码模板
  ld (h.264/640*360/15f)
  sd (h.264/854*480/24f)
  hd (h.264/1280*720/25f)
  shd (h.264/1920*1080/30f)

     *
     * @param template
     */
    public void setTemplate(String template) {
        this.template = template;
    }


    /**
     * set 推流域名
     *
     * @param publishDomain
     */
    public AddLiveStreamAppTranscodeRequest publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public AddLiveStreamAppTranscodeRequest appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 转码模版
- 取值范围: 系统标准转码模板, 用户自定义转码模板
- 系统标准转码模板
  ld (h.264/640*360/15f)
  sd (h.264/854*480/24f)
  hd (h.264/1280*720/25f)
  shd (h.264/1920*1080/30f)

     *
     * @param template
     */
    public AddLiveStreamAppTranscodeRequest template(String template) {
        this.template = template;
        return this;
    }


}