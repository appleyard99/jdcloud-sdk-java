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
 * Vqd Task
 * 视频质检任务相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vqd.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vqd.model.Filter;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询视频质检任务列表
支持过滤查询：
  - createTime,ge 最早任务创建时间
  - createTime,le 最晚任务创建时间
  - status,in 任务状态

 */
public class ListVqdTasksRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认值为 1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认值为 10；取值范围 [10, 100]
     */
    private Integer pageSize;

    /**
     * filters
     */
    private List<Filter> filters;


    /**
     * get 页码；默认值为 1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认值为 1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小；默认值为 10；取值范围 [10, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认值为 10；取值范围 [10, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get filters
     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set filters
     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
     * set 页码；默认值为 1
     *
     * @param pageNumber
     */
    public ListVqdTasksRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小；默认值为 10；取值范围 [10, 100]
     *
     * @param pageSize
     */
    public ListVqdTasksRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set filters
     *
     * @param filters
     */
    public ListVqdTasksRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * add item to filters
     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

}