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
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cdn.model.ConfigItem;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询域名的全部分类配置
 */
public class QueryDomainAllConfigClassifyResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * configItems
     */
    private List<ConfigItem> configItems;


    /**
     * get configItems
     *
     * @return
     */
    public List<ConfigItem> getConfigItems() {
        return configItems;
    }

    /**
     * set configItems
     *
     * @param configItems
     */
    public void setConfigItems(List<ConfigItem> configItems) {
        this.configItems = configItems;
    }


    /**
     * set configItems
     *
     * @param configItems
     */
    public QueryDomainAllConfigClassifyResult configItems(List<ConfigItem> configItems) {
        this.configItems = configItems;
        return this;
    }


    /**
     * add item to configItems
     *
     * @param configItem
     */
    public void addConfigItem(ConfigItem configItem) {
        if (this.configItems == null) {
            this.configItems = new ArrayList<>();
        }
        this.configItems.add(configItem);
    }

}