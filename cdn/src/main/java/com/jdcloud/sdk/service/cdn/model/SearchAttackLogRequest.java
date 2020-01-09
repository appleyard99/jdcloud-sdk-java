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
 * SCDN相关接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 攻击记录查询
 */
public class SearchAttackLogRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2019-08-16T06:00:00Z
     */
    private String startTime;

    /**
     * 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2019-08-16T07:00:00Z
     */
    private String endTime;

    /**
     * 页码
     */
    private Integer pageNumber;

    /**
     * 分页条数
     */
    private Integer pageSize;

    /**
     * 排序字段，默认传avgbandwidth
     */
    private String sortField;

    /**
     * 排序规则，默认是降序排序，传值asc或者desc
     */
    private String sortRule;


    /**
     * get 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2019-08-16T06:00:00Z
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2019-08-16T06:00:00Z
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2019-08-16T07:00:00Z
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2019-08-16T07:00:00Z
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页条数
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页条数
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 排序字段，默认传avgbandwidth
     *
     * @return
     */
    public String getSortField() {
        return sortField;
    }

    /**
     * set 排序字段，默认传avgbandwidth
     *
     * @param sortField
     */
    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    /**
     * get 排序规则，默认是降序排序，传值asc或者desc
     *
     * @return
     */
    public String getSortRule() {
        return sortRule;
    }

    /**
     * set 排序规则，默认是降序排序，传值asc或者desc
     *
     * @param sortRule
     */
    public void setSortRule(String sortRule) {
        this.sortRule = sortRule;
    }


    /**
     * set 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2019-08-16T06:00:00Z
     *
     * @param startTime
     */
    public SearchAttackLogRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2019-08-16T07:00:00Z
     *
     * @param endTime
     */
    public SearchAttackLogRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public SearchAttackLogRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页条数
     *
     * @param pageSize
     */
    public SearchAttackLogRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 排序字段，默认传avgbandwidth
     *
     * @param sortField
     */
    public SearchAttackLogRequest sortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * set 排序规则，默认是降序排序，传值asc或者desc
     *
     * @param sortRule
     */
    public SearchAttackLogRequest sortRule(String sortRule) {
        this.sortRule = sortRule;
        return this;
    }


}