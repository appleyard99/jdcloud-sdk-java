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
 * 图片样式相关接口
 * 图片样式API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mps.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 添加图片样式
 */
public class CreateImageStyleResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片样式ID
     */
    private Long id;


    /**
     * get 图片样式ID
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set 图片样式ID
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * set 图片样式ID
     *
     * @param id
     */
    public CreateImageStyleResult id(Long id) {
        this.id = id;
        return this;
    }


}