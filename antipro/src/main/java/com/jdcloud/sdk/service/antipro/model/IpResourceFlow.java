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

package com.jdcloud.sdk.service.antipro.model;

import java.util.List;
import java.util.ArrayList;

/**
 * ipResourceFlow
 */
public class IpResourceFlow  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     */
    private List<String> time;

    /**
     * 防护后流量
     */
    private List<Double> postProtect;

    /**
     * 防护前流量
     */
    private List<Double> preProtect;

    /**
     * 流量单位
     */
    private String unit;


    /**
     * get 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return
     */
    public List<String> getTime() {
        return time;
    }

    /**
     * set 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param time
     */
    public void setTime(List<String> time) {
        this.time = time;
    }

    /**
     * get 防护后流量
     *
     * @return
     */
    public List<Double> getPostProtect() {
        return postProtect;
    }

    /**
     * set 防护后流量
     *
     * @param postProtect
     */
    public void setPostProtect(List<Double> postProtect) {
        this.postProtect = postProtect;
    }

    /**
     * get 防护前流量
     *
     * @return
     */
    public List<Double> getPreProtect() {
        return preProtect;
    }

    /**
     * set 防护前流量
     *
     * @param preProtect
     */
    public void setPreProtect(List<Double> preProtect) {
        this.preProtect = preProtect;
    }

    /**
     * get 流量单位
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set 流量单位
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }


    /**
     * set 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param time
     */
    public IpResourceFlow time(List<String> time) {
        this.time = time;
        return this;
    }

    /**
     * set 防护后流量
     *
     * @param postProtect
     */
    public IpResourceFlow postProtect(List<Double> postProtect) {
        this.postProtect = postProtect;
        return this;
    }

    /**
     * set 防护前流量
     *
     * @param preProtect
     */
    public IpResourceFlow preProtect(List<Double> preProtect) {
        this.preProtect = preProtect;
        return this;
    }

    /**
     * set 流量单位
     *
     * @param unit
     */
    public IpResourceFlow unit(String unit) {
        this.unit = unit;
        return this;
    }


    /**
     * add item to 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param time
     */
    public void addTime(String time) {
        if (this.time == null) {
            this.time = new ArrayList<>();
        }
        this.time.add(time);
    }

    /**
     * add item to 防护后流量
     *
     * @param postProtect
     */
    public void addPostProtect(Double postProtect) {
        if (this.postProtect == null) {
            this.postProtect = new ArrayList<>();
        }
        this.postProtect.add(postProtect);
    }

    /**
     * add item to 防护前流量
     *
     * @param preProtect
     */
    public void addPreProtect(Double preProtect) {
        if (this.preProtect == null) {
            this.preProtect = new ArrayList<>();
        }
        this.preProtect.add(preProtect);
    }

}