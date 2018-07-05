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
 * Ip高防攻击记录相关接口
 * Ip高防攻击记录相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.ipanti.model.CCAttackLogDetail;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询cc攻击日志详情
 */
public class DescribeCcAttackLogDetailsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dataList
     */
    private List<CCAttackLogDetail> dataList;

    /**
     * totalCount
     */
    private Integer totalCount;


    /**
     * get dataList
     *
     * @return
     */
    public List<CCAttackLogDetail> getDataList() {
        return dataList;
    }

    /**
     * set dataList
     *
     * @param dataList
     */
    public void setDataList(List<CCAttackLogDetail> dataList) {
        this.dataList = dataList;
    }

    /**
     * get totalCount
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set dataList
     *
     * @param dataList
     */
    public DescribeCcAttackLogDetailsResult dataList(List<CCAttackLogDetail> dataList) {
        this.dataList = dataList;
        return this;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeCcAttackLogDetailsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to dataList
     *
     * @param dataList
     */
    public void addDataList(CCAttackLogDetail dataList) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataList);
    }

}