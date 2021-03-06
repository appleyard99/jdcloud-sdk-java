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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * liveStatisticGroupByStreamResult
 */
public class LiveStatisticGroupByStreamResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 起始时间点，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     */
    private String startTime;

    /**
     * 结束时间点，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     */
    private String endTime;

    /**
     * data
     */
    private List<LiveStatisticGroupByStreamResultData> data;


    /**
     * get 起始时间点，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 起始时间点，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 结束时间点，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间点，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get data
     *
     * @return
     */
    public List<LiveStatisticGroupByStreamResultData> getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(List<LiveStatisticGroupByStreamResultData> data) {
        this.data = data;
    }


    /**
     * set 起始时间点，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @param startTime
     */
    public LiveStatisticGroupByStreamResult startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 结束时间点，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @param endTime
     */
    public LiveStatisticGroupByStreamResult endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set data
     *
     * @param data
     */
    public LiveStatisticGroupByStreamResult data(List<LiveStatisticGroupByStreamResultData> data) {
        this.data = data;
        return this;
    }


    /**
     * add item to data
     *
     * @param data
     */
    public void addData(LiveStatisticGroupByStreamResultData data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

}