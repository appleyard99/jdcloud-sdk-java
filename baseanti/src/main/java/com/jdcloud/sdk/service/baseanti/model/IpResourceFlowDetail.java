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

package com.jdcloud.sdk.service.baseanti.model;

import java.util.List;
import java.util.ArrayList;

/**
 * ipResourceFlowDetail
 */
public class IpResourceFlowDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * used
     */
    private List<Long> used;

    /**
     * times
     */
    private List<String> times;


    /**
     * get used
     *
     * @return
     */
    public List<Long> getUsed() {
        return used;
    }

    /**
     * set used
     *
     * @param used
     */
    public void setUsed(List<Long> used) {
        this.used = used;
    }

    /**
     * get times
     *
     * @return
     */
    public List<String> getTimes() {
        return times;
    }

    /**
     * set times
     *
     * @param times
     */
    public void setTimes(List<String> times) {
        this.times = times;
    }


    /**
     * set used
     *
     * @param used
     */
    public IpResourceFlowDetail used(List<Long> used) {
        this.used = used;
        return this;
    }

    /**
     * set times
     *
     * @param times
     */
    public IpResourceFlowDetail times(List<String> times) {
        this.times = times;
        return this;
    }


    /**
     * add item to used
     *
     * @param used
     */
    public void addUsed(Long used) {
        if (this.used == null) {
            this.used = new ArrayList<>();
        }
        this.used.add(used);
    }

    /**
     * add item to times
     *
     * @param time
     */
    public void addTime(String time) {
        if (this.times == null) {
            this.times = new ArrayList<>();
        }
        this.times.add(time);
    }

}