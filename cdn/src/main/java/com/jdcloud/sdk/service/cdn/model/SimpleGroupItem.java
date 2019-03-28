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

package com.jdcloud.sdk.service.cdn.model;


/**
 * simpleGroupItem
 */
public class SimpleGroupItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * name
     */
    private String name;

    /**
     * id
     */
    private Long id;


    /**
     * get name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get id
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * set name
     *
     * @param name
     */
    public SimpleGroupItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set id
     *
     * @param id
     */
    public SimpleGroupItem id(Long id) {
        this.id = id;
        return this;
    }


}