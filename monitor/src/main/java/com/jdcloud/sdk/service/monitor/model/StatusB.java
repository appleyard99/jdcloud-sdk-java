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
 * statusB
 */
public class StatusB  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * color
     */
    private String color;

    /**
     * immediate
     */
    private Boolean immediate;

    /**
     * label
     */
    private String label;

    /**
     * value
     */
    private String value;


    /**
     * get color
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * set color
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * get immediate
     *
     * @return
     */
    public Boolean getImmediate() {
        return immediate;
    }

    /**
     * set immediate
     *
     * @param immediate
     */
    public void setImmediate(Boolean immediate) {
        this.immediate = immediate;
    }

    /**
     * get label
     *
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * set label
     *
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * get value
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set value
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * set color
     *
     * @param color
     */
    public StatusB color(String color) {
        this.color = color;
        return this;
    }

    /**
     * set immediate
     *
     * @param immediate
     */
    public StatusB immediate(Boolean immediate) {
        this.immediate = immediate;
        return this;
    }

    /**
     * set label
     *
     * @param label
     */
    public StatusB label(String label) {
        this.label = label;
        return this;
    }

    /**
     * set value
     *
     * @param value
     */
    public StatusB value(String value) {
        this.value = value;
        return this;
    }


}