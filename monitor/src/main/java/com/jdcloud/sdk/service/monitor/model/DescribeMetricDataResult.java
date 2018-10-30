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
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.MetricData;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看某资源的监控数据，metric介绍：&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/monitoring/metrics&quot;&gt;Metrics&lt;/a&gt;
 */
public class DescribeMetricDataResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * metricDatas
     */
    private List<MetricData> metricDatas;


    /**
     * get metricDatas
     *
     * @return
     */
    public List<MetricData> getMetricDatas() {
        return metricDatas;
    }

    /**
     * set metricDatas
     *
     * @param metricDatas
     */
    public void setMetricDatas(List<MetricData> metricDatas) {
        this.metricDatas = metricDatas;
    }


    /**
     * set metricDatas
     *
     * @param metricDatas
     */
    public DescribeMetricDataResult metricDatas(List<MetricData> metricDatas) {
        this.metricDatas = metricDatas;
        return this;
    }


    /**
     * add item to metricDatas
     *
     * @param metricData
     */
    public void addMetricData(MetricData metricData) {
        if (this.metricDatas == null) {
            this.metricDatas = new ArrayList<>();
        }
        this.metricDatas.add(metricData);
    }

}