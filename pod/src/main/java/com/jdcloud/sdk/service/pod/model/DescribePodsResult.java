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
 * Pod
 * Pod 相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.pod.model.Pod;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 批量查询 pod 的详细信息&lt;br&gt;
此接口支持分页查询，默认每页20条。

 */
public class DescribePodsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pods
     */
    private List<Pod> pods;

    /**
     * totalCount
     */
    private Number totalCount;


    /**
     * get pods
     *
     * @return
     */
    public List<Pod> getPods() {
        return pods;
    }

    /**
     * set pods
     *
     * @param pods
     */
    public void setPods(List<Pod> pods) {
        this.pods = pods;
    }

    /**
     * get totalCount
     *
     * @return
     */
    public Number getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Number totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set pods
     *
     * @param pods
     */
    public DescribePodsResult pods(List<Pod> pods) {
        this.pods = pods;
        return this;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribePodsResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to pods
     *
     * @param pod
     */
    public void addPod(Pod pod) {
        if (this.pods == null) {
            this.pods = new ArrayList<>();
        }
        this.pods.add(pod);
    }

}