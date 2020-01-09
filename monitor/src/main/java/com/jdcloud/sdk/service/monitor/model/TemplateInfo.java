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

import java.util.List;
import java.util.ArrayList;

/**
 * templateInfo
 */
public class TemplateInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * createTime
     */
    private String createTime;

    /**
     * 是否删除，0否，1是
     */
    private Long deleted;

    /**
     * 描述
     */
    private String description;

    /**
     * 名称
     */
    private String name;

    /**
     * 模板参数信息
     */
    private List<ParamInfo> params;

    /**
     * 模板oss地址
     */
    private String templateAddr;

    /**
     * 类型，0为系统，1为自定义
     */
    private Long templateType;

    /**
     * 唯一标识
     */
    private String templateUid;

    /**
     * 模板缩略图oss地址
     */
    private String thumbnailAddr;

    /**
     * updateTime
     */
    private String updateTime;


    /**
     * get createTime
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 是否删除，0否，1是
     *
     * @return
     */
    public Long getDeleted() {
        return deleted;
    }

    /**
     * set 是否删除，0否，1是
     *
     * @param deleted
     */
    public void setDeleted(Long deleted) {
        this.deleted = deleted;
    }

    /**
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 模板参数信息
     *
     * @return
     */
    public List<ParamInfo> getParams() {
        return params;
    }

    /**
     * set 模板参数信息
     *
     * @param params
     */
    public void setParams(List<ParamInfo> params) {
        this.params = params;
    }

    /**
     * get 模板oss地址
     *
     * @return
     */
    public String getTemplateAddr() {
        return templateAddr;
    }

    /**
     * set 模板oss地址
     *
     * @param templateAddr
     */
    public void setTemplateAddr(String templateAddr) {
        this.templateAddr = templateAddr;
    }

    /**
     * get 类型，0为系统，1为自定义
     *
     * @return
     */
    public Long getTemplateType() {
        return templateType;
    }

    /**
     * set 类型，0为系统，1为自定义
     *
     * @param templateType
     */
    public void setTemplateType(Long templateType) {
        this.templateType = templateType;
    }

    /**
     * get 唯一标识
     *
     * @return
     */
    public String getTemplateUid() {
        return templateUid;
    }

    /**
     * set 唯一标识
     *
     * @param templateUid
     */
    public void setTemplateUid(String templateUid) {
        this.templateUid = templateUid;
    }

    /**
     * get 模板缩略图oss地址
     *
     * @return
     */
    public String getThumbnailAddr() {
        return thumbnailAddr;
    }

    /**
     * set 模板缩略图oss地址
     *
     * @param thumbnailAddr
     */
    public void setThumbnailAddr(String thumbnailAddr) {
        this.thumbnailAddr = thumbnailAddr;
    }

    /**
     * get updateTime
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set createTime
     *
     * @param createTime
     */
    public TemplateInfo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 是否删除，0否，1是
     *
     * @param deleted
     */
    public TemplateInfo deleted(Long deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public TemplateInfo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public TemplateInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 模板参数信息
     *
     * @param params
     */
    public TemplateInfo params(List<ParamInfo> params) {
        this.params = params;
        return this;
    }

    /**
     * set 模板oss地址
     *
     * @param templateAddr
     */
    public TemplateInfo templateAddr(String templateAddr) {
        this.templateAddr = templateAddr;
        return this;
    }

    /**
     * set 类型，0为系统，1为自定义
     *
     * @param templateType
     */
    public TemplateInfo templateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * set 唯一标识
     *
     * @param templateUid
     */
    public TemplateInfo templateUid(String templateUid) {
        this.templateUid = templateUid;
        return this;
    }

    /**
     * set 模板缩略图oss地址
     *
     * @param thumbnailAddr
     */
    public TemplateInfo thumbnailAddr(String thumbnailAddr) {
        this.thumbnailAddr = thumbnailAddr;
        return this;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public TemplateInfo updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * add item to 模板参数信息
     *
     * @param param
     */
    public void addParam(ParamInfo param) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(param);
    }

}