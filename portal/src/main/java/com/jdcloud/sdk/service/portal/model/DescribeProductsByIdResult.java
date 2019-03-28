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
 * product
 * 产品页相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.portal.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.portal.model.Navigation;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 产品页列表查询接口

 */
public class DescribeProductsByIdResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * result
     */
    private List<Navigation> result;


    /**
     * get result
     *
     * @return
     */
    public List<Navigation> getResult() {
        return result;
    }

    /**
     * set result
     *
     * @param result
     */
    public void setResult(List<Navigation> result) {
        this.result = result;
    }


    /**
     * set result
     *
     * @param result
     */
    public DescribeProductsByIdResult result(List<Navigation> result) {
        this.result = result;
        return this;
    }


    /**
     * add item to result
     *
     * @param result
     */
    public void addResult(Navigation result) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(result);
    }

}