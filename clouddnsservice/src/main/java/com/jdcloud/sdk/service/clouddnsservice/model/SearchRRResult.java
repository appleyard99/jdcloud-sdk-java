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
 * 解析记录
 * 云解析OpenAPI解析记录接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clouddnsservice.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.clouddnsservice.model.RR;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询主域名的解析记录。&lt;br&gt;
在使用解析记录相关的接口之前，请调用此接口获取解析记录的列表。

 */
public class SearchRRResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dataList
     */
    private List<RR> dataList;

    /**
     * 所有解析记录的个数
     */
    private Integer totalCount;

    /**
     * 所有解析记录的页数
     */
    private Integer totalPage;

    /**
     * 当前页解析记录的个数
     */
    private Integer currentCount;


    /**
     * get dataList
     *
     * @return
     */
    public List<RR> getDataList() {
        return dataList;
    }

    /**
     * set dataList
     *
     * @param dataList
     */
    public void setDataList(List<RR> dataList) {
        this.dataList = dataList;
    }

    /**
     * get 所有解析记录的个数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 所有解析记录的个数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get 所有解析记录的页数
     *
     * @return
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * set 所有解析记录的页数
     *
     * @param totalPage
     */
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * get 当前页解析记录的个数
     *
     * @return
     */
    public Integer getCurrentCount() {
        return currentCount;
    }

    /**
     * set 当前页解析记录的个数
     *
     * @param currentCount
     */
    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }


    /**
     * set dataList
     *
     * @param dataList
     */
    public SearchRRResult dataList(List<RR> dataList) {
        this.dataList = dataList;
        return this;
    }

    /**
     * set 所有解析记录的个数
     *
     * @param totalCount
     */
    public SearchRRResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set 所有解析记录的页数
     *
     * @param totalPage
     */
    public SearchRRResult totalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * set 当前页解析记录的个数
     *
     * @param currentCount
     */
    public SearchRRResult currentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }


    /**
     * add item to dataList
     *
     * @param dataList
     */
    public void addDataList(RR dataList) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataList);
    }

}