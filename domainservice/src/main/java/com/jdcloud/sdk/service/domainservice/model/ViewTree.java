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

package com.jdcloud.sdk.service.domainservice.model;

import java.util.List;
import java.util.ArrayList;

/**
 * viewTree
 */
public class ViewTree  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 此解析线路是否禁用
     */
    private Boolean disabled;

    /**
     * 解析线路的描述
     */
    private String label;

    /**
     * 此数据是否是叶子节点
     */
    private Boolean leaf;

    /**
     * 解析线路ID
     */
    private Integer value;

    /**
     * 解析线路的名称，在使用viewName的参数处使用，如果为空表明此解析线路不能直接使用，请使用它的子线路。
     */
    private String viewName;

    /**
     * children
     */
    private List<ViewTree> children;


    /**
     * get 此解析线路是否禁用
     *
     * @return
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * set 此解析线路是否禁用
     *
     * @param disabled
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * get 解析线路的描述
     *
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * set 解析线路的描述
     *
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * get 此数据是否是叶子节点
     *
     * @return
     */
    public Boolean getLeaf() {
        return leaf;
    }

    /**
     * set 此数据是否是叶子节点
     *
     * @param leaf
     */
    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    /**
     * get 解析线路ID
     *
     * @return
     */
    public Integer getValue() {
        return value;
    }

    /**
     * set 解析线路ID
     *
     * @param value
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * get 解析线路的名称，在使用viewName的参数处使用，如果为空表明此解析线路不能直接使用，请使用它的子线路。
     *
     * @return
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * set 解析线路的名称，在使用viewName的参数处使用，如果为空表明此解析线路不能直接使用，请使用它的子线路。
     *
     * @param viewName
     */
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    /**
     * get children
     *
     * @return
     */
    public List<ViewTree> getChildren() {
        return children;
    }

    /**
     * set children
     *
     * @param children
     */
    public void setChildren(List<ViewTree> children) {
        this.children = children;
    }


    /**
     * set 此解析线路是否禁用
     *
     * @param disabled
     */
    public ViewTree disabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * set 解析线路的描述
     *
     * @param label
     */
    public ViewTree label(String label) {
        this.label = label;
        return this;
    }

    /**
     * set 此数据是否是叶子节点
     *
     * @param leaf
     */
    public ViewTree leaf(Boolean leaf) {
        this.leaf = leaf;
        return this;
    }

    /**
     * set 解析线路ID
     *
     * @param value
     */
    public ViewTree value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * set 解析线路的名称，在使用viewName的参数处使用，如果为空表明此解析线路不能直接使用，请使用它的子线路。
     *
     * @param viewName
     */
    public ViewTree viewName(String viewName) {
        this.viewName = viewName;
        return this;
    }

    /**
     * set children
     *
     * @param children
     */
    public ViewTree children(List<ViewTree> children) {
        this.children = children;
        return this;
    }


    /**
     * add item to children
     *
     * @param children
     */
    public void addChildren(ViewTree children) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(children);
    }

}