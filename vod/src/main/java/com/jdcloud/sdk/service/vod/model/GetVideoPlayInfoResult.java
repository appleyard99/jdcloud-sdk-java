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
 * Video
 * 视频资源管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vod.model.VideoBaseInfo;
import com.jdcloud.sdk.service.vod.model.VideoPlayInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取视频播放信息
 */
public class GetVideoPlayInfoResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * baseInfo
     */
    private VideoBaseInfo baseInfo;

    /**
     * playInfoList
     */
    private List<VideoPlayInfo> playInfoList;


    /**
     * get baseInfo
     *
     * @return
     */
    public VideoBaseInfo getBaseInfo() {
        return baseInfo;
    }

    /**
     * set baseInfo
     *
     * @param baseInfo
     */
    public void setBaseInfo(VideoBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    /**
     * get playInfoList
     *
     * @return
     */
    public List<VideoPlayInfo> getPlayInfoList() {
        return playInfoList;
    }

    /**
     * set playInfoList
     *
     * @param playInfoList
     */
    public void setPlayInfoList(List<VideoPlayInfo> playInfoList) {
        this.playInfoList = playInfoList;
    }


    /**
     * set baseInfo
     *
     * @param baseInfo
     */
    public GetVideoPlayInfoResult baseInfo(VideoBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    /**
     * set playInfoList
     *
     * @param playInfoList
     */
    public GetVideoPlayInfoResult playInfoList(List<VideoPlayInfo> playInfoList) {
        this.playInfoList = playInfoList;
        return this;
    }


    /**
     * add item to playInfoList
     *
     * @param playInfoList
     */
    public void addPlayInfoList(VideoPlayInfo playInfoList) {
        if (this.playInfoList == null) {
            this.playInfoList = new ArrayList<>();
        }
        this.playInfoList.add(playInfoList);
    }

}