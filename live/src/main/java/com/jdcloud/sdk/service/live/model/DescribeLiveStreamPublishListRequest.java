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
 * 查看推流历史记录
 */
public class DescribeLiveStreamPublishListRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码&lt;br&gt;
- 取值范围[1, 100000]

     */
    private Integer pageNum;

    /**
     * 分页大小&lt;br&gt;
- 取值范围[10, 100]

     */
    private Integer pageSize;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 流名称
     */
    private String streamName;

    /**
     * 推流起始时间&lt;br&gt;
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z
- 最大支持最近90天内的流历史查询

     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 推流结束时间&lt;br&gt;
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z
- 最大支持最近90天内的流历史查询
- 结束时间为空默认为当前时间

     */
    private String endTime;

    /**
     * 推流域名
     * Required:true
     */
    @Required
    private String publishDomain;


    /**
     * get 页码&lt;br&gt;
- 取值范围[1, 100000]

     *
     * @return
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * set 页码&lt;br&gt;
- 取值范围[1, 100000]

     *
     * @param pageNum
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * get 分页大小&lt;br&gt;
- 取值范围[10, 100]

     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小&lt;br&gt;
- 取值范围[10, 100]

     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
     * get 流名称
     *
     * @return
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * set 流名称
     *
     * @param streamName
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * get 推流起始时间&lt;br&gt;
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z
- 最大支持最近90天内的流历史查询

     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 推流起始时间&lt;br&gt;
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z
- 最大支持最近90天内的流历史查询

     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 推流结束时间&lt;br&gt;
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z
- 最大支持最近90天内的流历史查询
- 结束时间为空默认为当前时间

     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 推流结束时间&lt;br&gt;
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z
- 最大支持最近90天内的流历史查询
- 结束时间为空默认为当前时间

     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

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
     * set 页码&lt;br&gt;
- 取值范围[1, 100000]

     *
     * @param pageNum
     */
    public DescribeLiveStreamPublishListRequest pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * set 分页大小&lt;br&gt;
- 取值范围[10, 100]

     *
     * @param pageSize
     */
    public DescribeLiveStreamPublishListRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public DescribeLiveStreamPublishListRequest appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 流名称
     *
     * @param streamName
     */
    public DescribeLiveStreamPublishListRequest streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * set 推流起始时间&lt;br&gt;
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z
- 最大支持最近90天内的流历史查询

     *
     * @param startTime
     */
    public DescribeLiveStreamPublishListRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 推流结束时间&lt;br&gt;
- UTC时间
  格式:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
  示例:2018-10-21T10:00:00Z
- 最大支持最近90天内的流历史查询
- 结束时间为空默认为当前时间

     *
     * @param endTime
     */
    public DescribeLiveStreamPublishListRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 推流域名
     *
     * @param publishDomain
     */
    public DescribeLiveStreamPublishListRequest publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }


}