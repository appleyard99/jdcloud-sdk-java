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

package com.jdcloud.sdk.service.ipanti.model;


/**
 * cCAttackLogDetail
 */
public class CCAttackLogDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 特征key
     */
    private String key;

    /**
     * 攻击次数
     */
    private Integer num;


    /**
     * get 特征key
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set 特征key
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * get 攻击次数
     *
     * @return
     */
    public Integer getNum() {
        return num;
    }

    /**
     * set 攻击次数
     *
     * @param num
     */
    public void setNum(Integer num) {
        this.num = num;
    }


    /**
     * set 特征key
     *
     * @param key
     */
    public CCAttackLogDetail key(String key) {
        this.key = key;
        return this;
    }

    /**
     * set 攻击次数
     *
     * @param num
     */
    public CCAttackLogDetail num(Integer num) {
        this.num = num;
        return this;
    }


}