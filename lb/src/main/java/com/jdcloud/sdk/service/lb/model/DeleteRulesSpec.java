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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * deleteRulesSpec
 */
public class DeleteRulesSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * rule Id列表
     * Required:true
     */
    @Required
    private List<String> ruleIds;


    /**
     * get rule Id列表
     *
     * @return
     */
    public List<String> getRuleIds() {
        return ruleIds;
    }

    /**
     * set rule Id列表
     *
     * @param ruleIds
     */
    public void setRuleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
    }


    /**
     * set rule Id列表
     *
     * @param ruleIds
     */
    public DeleteRulesSpec ruleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }


    /**
     * add item to rule Id列表
     *
     * @param ruleId
     */
    public void addRuleId(String ruleId) {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<>();
        }
        this.ruleIds.add(ruleId);
    }

}