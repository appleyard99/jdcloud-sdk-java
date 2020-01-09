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

import java.util.List;
import java.util.ArrayList;

/**
 * dashboardInfo
 */
public class DashboardInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * description
     */
    private String description;

    /**
     * id
     */
    private Long id;

    /**
     * tags
     */
    private List<String> tags;

    /**
     * timezone
     */
    private String timezone;

    /**
     * title
     */
    private String title;

    /**
     * uid
     */
    private String uid;

    /**
     * version
     */
    private Long version;


    /**
     * get description
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set description
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * get tags
     *
     * @return
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * set tags
     *
     * @param tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * get timezone
     *
     * @return
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * set timezone
     *
     * @param timezone
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * get title
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set title
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get uid
     *
     * @return
     */
    public String getUid() {
        return uid;
    }

    /**
     * set uid
     *
     * @param uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * get version
     *
     * @return
     */
    public Long getVersion() {
        return version;
    }

    /**
     * set version
     *
     * @param version
     */
    public void setVersion(Long version) {
        this.version = version;
    }


    /**
     * set description
     *
     * @param description
     */
    public DashboardInfo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set id
     *
     * @param id
     */
    public DashboardInfo id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * set tags
     *
     * @param tags
     */
    public DashboardInfo tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set timezone
     *
     * @param timezone
     */
    public DashboardInfo timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * set title
     *
     * @param title
     */
    public DashboardInfo title(String title) {
        this.title = title;
        return this;
    }

    /**
     * set uid
     *
     * @param uid
     */
    public DashboardInfo uid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * set version
     *
     * @param version
     */
    public DashboardInfo version(Long version) {
        this.version = version;
        return this;
    }


    /**
     * add item to tags
     *
     * @param tag
     */
    public void addTag(String tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}