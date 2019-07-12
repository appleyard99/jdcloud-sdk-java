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
 * Upload
 * 上传功能相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;


/**
 * uploadCallbackResultObject
 */
public class UploadCallbackResultObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 媒资ID
     */
    private String mid;


    /**
     * get 媒资ID
     *
     * @return
     */
    public String getMid() {
        return mid;
    }

    /**
     * set 媒资ID
     *
     * @param mid
     */
    public void setMid(String mid) {
        this.mid = mid;
    }


    /**
     * set 媒资ID
     *
     * @param mid
     */
    public UploadCallbackResultObject mid(String mid) {
        this.mid = mid;
        return this;
    }


}