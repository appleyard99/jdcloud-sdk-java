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

import java.util.List;
import java.util.ArrayList;

/**
 * dwTableDesc
 */
public class DwTableDesc  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库名
     */
    private String dbName;

    /**
     * 表名
     */
    private String tableName;

    /**
     * 存储格式
     */
    private String hiveFileFormat;

    /**
     * 字段分隔符
     */
    private String fieldsDelimit;

    /**
     * 行分隔符
     */
    private String linesDelimit;

    /**
     * 其他serde属性
     */
    private Object otherSerdeProperties;

    /**
     * 创建时间（自动生成）
     */
    private String createTime;

    /**
     * 所有者（自动生成）
     */
    private String owner;

    /**
     * 描述信息
     */
    private String comments;

    /**
     * 外表位置
     */
    private String externalLocation;

    /**
     * 参数
     */
    private Object parameters;

    /**
     * 列信息
     */
    private List<DwTableRow> rows;


    /**
     * get 数据库名
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get 表名
     *
     * @return
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * set 表名
     *
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * get 存储格式
     *
     * @return
     */
    public String getHiveFileFormat() {
        return hiveFileFormat;
    }

    /**
     * set 存储格式
     *
     * @param hiveFileFormat
     */
    public void setHiveFileFormat(String hiveFileFormat) {
        this.hiveFileFormat = hiveFileFormat;
    }

    /**
     * get 字段分隔符
     *
     * @return
     */
    public String getFieldsDelimit() {
        return fieldsDelimit;
    }

    /**
     * set 字段分隔符
     *
     * @param fieldsDelimit
     */
    public void setFieldsDelimit(String fieldsDelimit) {
        this.fieldsDelimit = fieldsDelimit;
    }

    /**
     * get 行分隔符
     *
     * @return
     */
    public String getLinesDelimit() {
        return linesDelimit;
    }

    /**
     * set 行分隔符
     *
     * @param linesDelimit
     */
    public void setLinesDelimit(String linesDelimit) {
        this.linesDelimit = linesDelimit;
    }

    /**
     * get 其他serde属性
     *
     * @return
     */
    public Object getOtherSerdeProperties() {
        return otherSerdeProperties;
    }

    /**
     * set 其他serde属性
     *
     * @param otherSerdeProperties
     */
    public void setOtherSerdeProperties(Object otherSerdeProperties) {
        this.otherSerdeProperties = otherSerdeProperties;
    }

    /**
     * get 创建时间（自动生成）
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间（自动生成）
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 所有者（自动生成）
     *
     * @return
     */
    public String getOwner() {
        return owner;
    }

    /**
     * set 所有者（自动生成）
     *
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
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
     * get 外表位置
     *
     * @return
     */
    public String getExternalLocation() {
        return externalLocation;
    }

    /**
     * set 外表位置
     *
     * @param externalLocation
     */
    public void setExternalLocation(String externalLocation) {
        this.externalLocation = externalLocation;
    }

    /**
     * get 参数
     *
     * @return
     */
    public Object getParameters() {
        return parameters;
    }

    /**
     * set 参数
     *
     * @param parameters
     */
    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    /**
     * get 列信息
     *
     * @return
     */
    public List<DwTableRow> getRows() {
        return rows;
    }

    /**
     * set 列信息
     *
     * @param rows
     */
    public void setRows(List<DwTableRow> rows) {
        this.rows = rows;
    }


    /**
     * set 数据库名
     *
     * @param dbName
     */
    public DwTableDesc dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set 表名
     *
     * @param tableName
     */
    public DwTableDesc tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * set 存储格式
     *
     * @param hiveFileFormat
     */
    public DwTableDesc hiveFileFormat(String hiveFileFormat) {
        this.hiveFileFormat = hiveFileFormat;
        return this;
    }

    /**
     * set 字段分隔符
     *
     * @param fieldsDelimit
     */
    public DwTableDesc fieldsDelimit(String fieldsDelimit) {
        this.fieldsDelimit = fieldsDelimit;
        return this;
    }

    /**
     * set 行分隔符
     *
     * @param linesDelimit
     */
    public DwTableDesc linesDelimit(String linesDelimit) {
        this.linesDelimit = linesDelimit;
        return this;
    }

    /**
     * set 其他serde属性
     *
     * @param otherSerdeProperties
     */
    public DwTableDesc otherSerdeProperties(Object otherSerdeProperties) {
        this.otherSerdeProperties = otherSerdeProperties;
        return this;
    }

    /**
     * set 创建时间（自动生成）
     *
     * @param createTime
     */
    public DwTableDesc createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 所有者（自动生成）
     *
     * @param owner
     */
    public DwTableDesc owner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * set 描述信息
     *
     * @param comments
     */
    public DwTableDesc comments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * set 外表位置
     *
     * @param externalLocation
     */
    public DwTableDesc externalLocation(String externalLocation) {
        this.externalLocation = externalLocation;
        return this;
    }

    /**
     * set 参数
     *
     * @param parameters
     */
    public DwTableDesc parameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * set 列信息
     *
     * @param rows
     */
    public DwTableDesc rows(List<DwTableRow> rows) {
        this.rows = rows;
        return this;
    }


    /**
     * add item to 列信息
     *
     * @param row
     */
    public void addRow(DwTableRow row) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        this.rows.add(row);
    }

}