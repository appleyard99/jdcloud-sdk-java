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

package com.jdcloud.sdk.service.lb.model;


/**
 * quota
 */
public class Quota  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源类型，取值范围：loadbalancer、listener、target_group、target、backend、urlMap(仅alb支持)、rules(仅alb支持)
     */
    private String type;

    /**
     * type为loadbalancer时，本字段为空。type为listener、backend、target_group、urlMap时，本字段为LoadBalancerId。type为target时，本字段为targetGroupId。type为rules时，本字段为urlMapId
     */
    private String parentResourceId;

    /**
     * 配额大小
     */
    private Integer maxLimit;

    /**
     * 已存在的资源数量
     */
    private Integer count;


    /**
     * get 资源类型，取值范围：loadbalancer、listener、target_group、target、backend、urlMap(仅alb支持)、rules(仅alb支持)
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 资源类型，取值范围：loadbalancer、listener、target_group、target、backend、urlMap(仅alb支持)、rules(仅alb支持)
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get type为loadbalancer时，本字段为空。type为listener、backend、target_group、urlMap时，本字段为LoadBalancerId。type为target时，本字段为targetGroupId。type为rules时，本字段为urlMapId
     *
     * @return
     */
    public String getParentResourceId() {
        return parentResourceId;
    }

    /**
     * set type为loadbalancer时，本字段为空。type为listener、backend、target_group、urlMap时，本字段为LoadBalancerId。type为target时，本字段为targetGroupId。type为rules时，本字段为urlMapId
     *
     * @param parentResourceId
     */
    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
    }

    /**
     * get 配额大小
     *
     * @return
     */
    public Integer getMaxLimit() {
        return maxLimit;
    }

    /**
     * set 配额大小
     *
     * @param maxLimit
     */
    public void setMaxLimit(Integer maxLimit) {
        this.maxLimit = maxLimit;
    }

    /**
     * get 已存在的资源数量
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * set 已存在的资源数量
     *
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }


    /**
     * set 资源类型，取值范围：loadbalancer、listener、target_group、target、backend、urlMap(仅alb支持)、rules(仅alb支持)
     *
     * @param type
     */
    public Quota type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set type为loadbalancer时，本字段为空。type为listener、backend、target_group、urlMap时，本字段为LoadBalancerId。type为target时，本字段为targetGroupId。type为rules时，本字段为urlMapId
     *
     * @param parentResourceId
     */
    public Quota parentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
        return this;
    }

    /**
     * set 配额大小
     *
     * @param maxLimit
     */
    public Quota maxLimit(Integer maxLimit) {
        this.maxLimit = maxLimit;
        return this;
    }

    /**
     * set 已存在的资源数量
     *
     * @param count
     */
    public Quota count(Integer count) {
        this.count = count;
        return this;
    }


}