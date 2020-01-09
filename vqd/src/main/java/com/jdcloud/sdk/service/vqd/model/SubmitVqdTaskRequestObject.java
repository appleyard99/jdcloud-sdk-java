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

package com.jdcloud.sdk.service.vqd.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * 提交检测任务请求信息
 */
public class SubmitVqdTaskRequestObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * media
     */
    private VqdMediaObject media;

    /**
     * 检测模板ID
     * Required:true
     */
    @Required
    private String templateId;


    /**
     * get media
     *
     * @return
     */
    public VqdMediaObject getMedia() {
        return media;
    }

    /**
     * set media
     *
     * @param media
     */
    public void setMedia(VqdMediaObject media) {
        this.media = media;
    }

    /**
     * get 检测模板ID
     *
     * @return
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * set 检测模板ID
     *
     * @param templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }


    /**
     * set media
     *
     * @param media
     */
    public SubmitVqdTaskRequestObject media(VqdMediaObject media) {
        this.media = media;
        return this;
    }

    /**
     * set 检测模板ID
     *
     * @param templateId
     */
    public SubmitVqdTaskRequestObject templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }


}