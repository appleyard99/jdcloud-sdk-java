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
 * 监控项相关接口
 * 监控项相关接口，提供可用监控项列表查询和监控数据查询等功能
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.LastDownsampleRespItem;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 根据不同的聚合方式将metric的数据聚合为一个点。downAggrType：last(最后一个点)、max(最大值)、min(最小值)、avg(平均值)。该接口返回值为上报metric的原始值，没有做单位转换。metric介绍：&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/monitoring/metrics&quot;&gt;Metrics&lt;/a&gt;
 */
public class DescribeOneDataPointResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * items
     */
    private List<LastDownsampleRespItem> items;


    /**
     * get items
     *
     * @return
     */
    public List<LastDownsampleRespItem> getItems() {
        return items;
    }

    /**
     * set items
     *
     * @param items
     */
    public void setItems(List<LastDownsampleRespItem> items) {
        this.items = items;
    }


    /**
     * set items
     *
     * @param items
     */
    public DescribeOneDataPointResult items(List<LastDownsampleRespItem> items) {
        this.items = items;
        return this;
    }


    /**
     * add item to items
     *
     * @param item
     */
    public void addItem(LastDownsampleRespItem item) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(item);
    }

}