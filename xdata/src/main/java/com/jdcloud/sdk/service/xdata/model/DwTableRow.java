/*
 * Copyright 2018-2025 JDCLOUD.COM
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

package com.jdcloud.sdk.service.xdata.model;


/**
 * dwTableRow
 */
public class DwTableRow  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 字段名称
     */
    private String columnName;

    /**
     * 字段类型
     */
    private String columnType;

    /**
     * 是否分区字段
     */
    private Boolean isPartition;

    /**
     * 描述信息
     */
    private String comments;


    /**
     * get 字段名称
     *
     * @return
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * set 字段名称
     *
     * @param columnName
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * get 字段类型
     *
     * @return
     */
    public String getColumnType() {
        return columnType;
    }

    /**
     * set 字段类型
     *
     * @param columnType
     */
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    /**
     * get 是否分区字段
     *
     * @return
     */
    public Boolean getIsPartition() {
        return isPartition;
    }

    /**
     * set 是否分区字段
     *
     * @param isPartition
     */
    public void setIsPartition(Boolean isPartition) {
        this.isPartition = isPartition;
    }

    /**
     * get 描述信息
     *
     * @return
     */
    public String getComments() {
        return comments;
    }

    /**
     * set 描述信息
     *
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }


    /**
     * set 字段名称
     *
     * @param columnName
     */
    public DwTableRow columnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * set 字段类型
     *
     * @param columnType
     */
    public DwTableRow columnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * set 是否分区字段
     *
     * @param isPartition
     */
    public DwTableRow isPartition(Boolean isPartition) {
        this.isPartition = isPartition;
        return this;
    }

    /**
     * set 描述信息
     *
     * @param comments
     */
    public DwTableRow comments(String comments) {
        this.comments = comments;
        return this;
    }


}