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
 * 原生容器
 * 原生容器相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.nc.model;

import com.jdcloud.sdk.service.nc.model.Container;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询一台原生容器的详细信息

 */
public class DescribeContainerResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * container
     */
    private Container container;


    /**
     * get container
     *
     * @return
     */
    public Container getContainer() {
        return container;
    }

    /**
     * set container
     *
     * @param container
     */
    public void setContainer(Container container) {
        this.container = container;
    }


    /**
     * set container
     *
     * @param container
     */
    public DescribeContainerResult container(Container container) {
        this.container = container;
        return this;
    }


}