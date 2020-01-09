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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * 批量提交检测任务请求信息
 */
public class BatchSubmitVqdTaskRequestObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 媒体列表
     */
    private List<VqdMediaObject> mediaList;

    /**
     * 检测模板ID
     * Required:true
     */
    @Required
    private String templateId;


    /**
     * get 媒体列表
     *
     * @return
     */
    public List<VqdMediaObject> getMediaList() {
        return mediaList;
    }

    /**
     * set 媒体列表
     *
     * @param mediaList
     */
    public void setMediaList(List<VqdMediaObject> mediaList) {
        this.mediaList = mediaList;
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
     * set 媒体列表
     *
     * @param mediaList
     */
    public BatchSubmitVqdTaskRequestObject mediaList(List<VqdMediaObject> mediaList) {
        this.mediaList = mediaList;
        return this;
    }

    /**
     * set 检测模板ID
     *
     * @param templateId
     */
    public BatchSubmitVqdTaskRequestObject templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }


    /**
     * add item to 媒体列表
     *
     * @param mediaList
     */
    public void addMediaList(VqdMediaObject mediaList) {
        if (this.mediaList == null) {
            this.mediaList = new ArrayList<>();
        }
        this.mediaList.add(mediaList);
    }

}