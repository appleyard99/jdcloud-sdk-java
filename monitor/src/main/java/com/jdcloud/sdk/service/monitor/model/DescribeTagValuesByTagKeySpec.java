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
 * describeTagValuesByTagKeySpec
 */
public class DescribeTagValuesByTagKeySpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 要搜索的dimensionValue前缀
     */
    private String dimensionValue;

    /**
     * 监控指标数据的维度信息,根据tags来筛选指标数据不同的维度
     */
    private List<TagFilter> tags;


    /**
     * get 要搜索的dimensionValue前缀
     *
     * @return
     */
    public String getDimensionValue() {
        return dimensionValue;
    }

    /**
     * set 要搜索的dimensionValue前缀
     *
     * @param dimensionValue
     */
    public void setDimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
    }

    /**
     * get 监控指标数据的维度信息,根据tags来筛选指标数据不同的维度
     *
     * @return
     */
    public List<TagFilter> getTags() {
        return tags;
    }

    /**
     * set 监控指标数据的维度信息,根据tags来筛选指标数据不同的维度
     *
     * @param tags
     */
    public void setTags(List<TagFilter> tags) {
        this.tags = tags;
    }


    /**
     * set 要搜索的dimensionValue前缀
     *
     * @param dimensionValue
     */
    public DescribeTagValuesByTagKeySpec dimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
        return this;
    }

    /**
     * set 监控指标数据的维度信息,根据tags来筛选指标数据不同的维度
     *
     * @param tags
     */
    public DescribeTagValuesByTagKeySpec tags(List<TagFilter> tags) {
        this.tags = tags;
        return this;
    }


    /**
     * add item to 监控指标数据的维度信息,根据tags来筛选指标数据不同的维度
     *
     * @param tag
     */
    public void addTag(TagFilter tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}