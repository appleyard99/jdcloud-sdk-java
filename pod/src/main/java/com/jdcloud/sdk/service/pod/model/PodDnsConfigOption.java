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

package com.jdcloud.sdk.service.pod.model;


/**
 * DNS解析器选项。
 */
public class PodDnsConfigOption  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 长度范围：[1-63]，需满足linux resolver限制
     */
    private String name;

    /**
     * 长度范围：[0-100]，仅限timeout, attempts, ndots
     */
    private String value;


    /**
     * get 长度范围：[1-63]，需满足linux resolver限制
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 长度范围：[1-63]，需满足linux resolver限制
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 长度范围：[0-100]，仅限timeout, attempts, ndots
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 长度范围：[0-100]，仅限timeout, attempts, ndots
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * set 长度范围：[1-63]，需满足linux resolver限制
     *
     * @param name
     */
    public PodDnsConfigOption name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 长度范围：[0-100]，仅限timeout, attempts, ndots
     *
     * @param value
     */
    public PodDnsConfigOption value(String value) {
        this.value = value;
        return this;
    }


}