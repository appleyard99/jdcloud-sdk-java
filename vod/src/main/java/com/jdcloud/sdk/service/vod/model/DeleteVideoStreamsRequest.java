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
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除视频码流信息
 */
public class DeleteVideoStreamsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * taskIds
     */
    private List<Long> taskIds;

    /**
     * 视频ID
     * Required:true
     */
    @Required
    private String videoId;


    /**
     * get taskIds
     *
     * @return
     */
    public List<Long> getTaskIds() {
        return taskIds;
    }

    /**
     * set taskIds
     *
     * @param taskIds
     */
    public void setTaskIds(List<Long> taskIds) {
        this.taskIds = taskIds;
    }

    /**
     * get 视频ID
     *
     * @return
     */
    public String getVideoId() {
        return videoId;
    }

    /**
     * set 视频ID
     *
     * @param videoId
     */
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }


    /**
     * set taskIds
     *
     * @param taskIds
     */
    public DeleteVideoStreamsRequest taskIds(List<Long> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    /**
     * set 视频ID
     *
     * @param videoId
     */
    public DeleteVideoStreamsRequest videoId(String videoId) {
        this.videoId = videoId;
        return this;
    }


    /**
     * add item to taskIds
     *
     * @param taskId
     */
    public void addTaskId(Long taskId) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        this.taskIds.add(taskId);
    }

}