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
 * Video Management
 * 视频资源管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import java.util.List;
import java.util.ArrayList;

/**
 * batchUpdateVideosRequestObject
 */
public class BatchUpdateVideosRequestObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 批量更新视频的条目列表信息
     */
    private List<UpdateVideoBulkItem> bulk;


    /**
     * get 批量更新视频的条目列表信息
     *
     * @return
     */
    public List<UpdateVideoBulkItem> getBulk() {
        return bulk;
    }

    /**
     * set 批量更新视频的条目列表信息
     *
     * @param bulk
     */
    public void setBulk(List<UpdateVideoBulkItem> bulk) {
        this.bulk = bulk;
    }


    /**
     * set 批量更新视频的条目列表信息
     *
     * @param bulk
     */
    public BatchUpdateVideosRequestObject bulk(List<UpdateVideoBulkItem> bulk) {
        this.bulk = bulk;
        return this;
    }


    /**
     * add item to 批量更新视频的条目列表信息
     *
     * @param bulk
     */
    public void addBulk(UpdateVideoBulkItem bulk) {
        if (this.bulk == null) {
            this.bulk = new ArrayList<>();
        }
        this.bulk.add(bulk);
    }

}