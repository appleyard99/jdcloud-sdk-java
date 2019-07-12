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
 * Watermark Management
 * 水印管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;


/**
 * 修改水印请求信息
 */
public class UpdateWatermarkRequestObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 水印名称
     */
    private String name;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 宽度
     */
    private String width;

    /**
     * 高度
     */
    private String height;

    /**
     * 水印位置
     */
    private String position;

    /**
     * 偏移单位
     */
    private String unit;

    /**
     * 水平偏移
     */
    private Integer offsetX;

    /**
     * 竖直偏移
     */
    private Integer offsetY;


    /**
     * get 水印名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 水印名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 图片地址
     *
     * @return
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * set 图片地址
     *
     * @param imgUrl
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * get 宽度
     *
     * @return
     */
    public String getWidth() {
        return width;
    }

    /**
     * set 宽度
     *
     * @param width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * get 高度
     *
     * @return
     */
    public String getHeight() {
        return height;
    }

    /**
     * set 高度
     *
     * @param height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * get 水印位置
     *
     * @return
     */
    public String getPosition() {
        return position;
    }

    /**
     * set 水印位置
     *
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * get 偏移单位
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set 偏移单位
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * get 水平偏移
     *
     * @return
     */
    public Integer getOffsetX() {
        return offsetX;
    }

    /**
     * set 水平偏移
     *
     * @param offsetX
     */
    public void setOffsetX(Integer offsetX) {
        this.offsetX = offsetX;
    }

    /**
     * get 竖直偏移
     *
     * @return
     */
    public Integer getOffsetY() {
        return offsetY;
    }

    /**
     * set 竖直偏移
     *
     * @param offsetY
     */
    public void setOffsetY(Integer offsetY) {
        this.offsetY = offsetY;
    }


    /**
     * set 水印名称
     *
     * @param name
     */
    public UpdateWatermarkRequestObject name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 图片地址
     *
     * @param imgUrl
     */
    public UpdateWatermarkRequestObject imgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    /**
     * set 宽度
     *
     * @param width
     */
    public UpdateWatermarkRequestObject width(String width) {
        this.width = width;
        return this;
    }

    /**
     * set 高度
     *
     * @param height
     */
    public UpdateWatermarkRequestObject height(String height) {
        this.height = height;
        return this;
    }

    /**
     * set 水印位置
     *
     * @param position
     */
    public UpdateWatermarkRequestObject position(String position) {
        this.position = position;
        return this;
    }

    /**
     * set 偏移单位
     *
     * @param unit
     */
    public UpdateWatermarkRequestObject unit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * set 水平偏移
     *
     * @param offsetX
     */
    public UpdateWatermarkRequestObject offsetX(Integer offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    /**
     * set 竖直偏移
     *
     * @param offsetY
     */
    public UpdateWatermarkRequestObject offsetY(Integer offsetY) {
        this.offsetY = offsetY;
        return this;
    }


}