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


/**
 * ruleState
 */
public class RuleState  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 规则个数
     */
    private Long ruleCount;

    /**
     * 资源的规则状态。1：正常、 2：报警、4：数据不足 -1:没有规则 -2:未启用
     */
    private Long state;


    /**
     * get 资源id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 规则个数
     *
     * @return
     */
    public Long getRuleCount() {
        return ruleCount;
    }

    /**
     * set 规则个数
     *
     * @param ruleCount
     */
    public void setRuleCount(Long ruleCount) {
        this.ruleCount = ruleCount;
    }

    /**
     * get 资源的规则状态。1：正常、 2：报警、4：数据不足 -1:没有规则 -2:未启用
     *
     * @return
     */
    public Long getState() {
        return state;
    }

    /**
     * set 资源的规则状态。1：正常、 2：报警、4：数据不足 -1:没有规则 -2:未启用
     *
     * @param state
     */
    public void setState(Long state) {
        this.state = state;
    }


    /**
     * set 资源id
     *
     * @param resourceId
     */
    public RuleState resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 规则个数
     *
     * @param ruleCount
     */
    public RuleState ruleCount(Long ruleCount) {
        this.ruleCount = ruleCount;
        return this;
    }

    /**
     * set 资源的规则状态。1：正常、 2：报警、4：数据不足 -1:没有规则 -2:未启用
     *
     * @param state
     */
    public RuleState state(Long state) {
        this.state = state;
        return this;
    }


}