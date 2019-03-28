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
 * 删除用户自定义水印模板
- 删除用户自定义水印模板之前必须先删除此模板在各域名、应用、流级别的水印设置

 */
public class DeleteCustomLiveStreamWatermarkTemplateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 水印模板

     * Required:true
     */
    @Required
    private String template;


    /**
     * get 水印模板

     *
     * @return
     */
    public String getTemplate() {
        return template;
    }

    /**
     * set 水印模板

     *
     * @param template
     */
    public void setTemplate(String template) {
        this.template = template;
    }


    /**
     * set 水印模板

     *
     * @param template
     */
    public DeleteCustomLiveStreamWatermarkTemplateRequest template(String template) {
        this.template = template;
        return this;
    }


}