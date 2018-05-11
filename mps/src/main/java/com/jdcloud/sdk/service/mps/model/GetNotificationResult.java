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
 * 媒体处理相关接口
 * 媒体处理API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取截图通知
 */
public class GetNotificationResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否启用通知
     */
    private Boolean enabled;

    /**
     * 通知endpoint, 当前支持http://和https://
     */
    private String endpoint;

    /**
     * 触发通知的事件集合 (mpsTranscodeComplete, mpsThumbnailComplete)
     */
    private List<String> events;

    /**
     * 重试策略, BACKOFF_RETRY: 退避重试策略, 重试 3 次, 每次重试的间隔时间是 10秒 到 20秒 之间的随机值; EXPONENTIAL_DECAY_RETRY: 指数衰减重试, 重试 176 次, 每次重试的间隔时间指数递增至 512秒, 总计重试时间为1天; 每次重试的具体间隔为: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512 ... 512 秒(共167个512)
     */
    private String notifyStrategy;

    /**
     * 描述了向 Endpoint 推送的消息格式, JSON: 包含消息正文和消息属性, SIMPLIFIED: 消息体即用户发布的消息, 不包含任何属性信息
     */
    private String notifyContentFormat;


    /**
     * get 是否启用通知
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set 是否启用通知
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * get 通知endpoint, 当前支持http://和https://
     *
     * @return
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * set 通知endpoint, 当前支持http://和https://
     *
     * @param endpoint
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * get 触发通知的事件集合 (mpsTranscodeComplete, mpsThumbnailComplete)
     *
     * @return
     */
    public List<String> getEvents() {
        return events;
    }

    /**
     * set 触发通知的事件集合 (mpsTranscodeComplete, mpsThumbnailComplete)
     *
     * @param events
     */
    public void setEvents(List<String> events) {
        this.events = events;
    }

    /**
     * get 重试策略, BACKOFF_RETRY: 退避重试策略, 重试 3 次, 每次重试的间隔时间是 10秒 到 20秒 之间的随机值; EXPONENTIAL_DECAY_RETRY: 指数衰减重试, 重试 176 次, 每次重试的间隔时间指数递增至 512秒, 总计重试时间为1天; 每次重试的具体间隔为: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512 ... 512 秒(共167个512)
     *
     * @return
     */
    public String getNotifyStrategy() {
        return notifyStrategy;
    }

    /**
     * set 重试策略, BACKOFF_RETRY: 退避重试策略, 重试 3 次, 每次重试的间隔时间是 10秒 到 20秒 之间的随机值; EXPONENTIAL_DECAY_RETRY: 指数衰减重试, 重试 176 次, 每次重试的间隔时间指数递增至 512秒, 总计重试时间为1天; 每次重试的具体间隔为: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512 ... 512 秒(共167个512)
     *
     * @param notifyStrategy
     */
    public void setNotifyStrategy(String notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
    }

    /**
     * get 描述了向 Endpoint 推送的消息格式, JSON: 包含消息正文和消息属性, SIMPLIFIED: 消息体即用户发布的消息, 不包含任何属性信息
     *
     * @return
     */
    public String getNotifyContentFormat() {
        return notifyContentFormat;
    }

    /**
     * set 描述了向 Endpoint 推送的消息格式, JSON: 包含消息正文和消息属性, SIMPLIFIED: 消息体即用户发布的消息, 不包含任何属性信息
     *
     * @param notifyContentFormat
     */
    public void setNotifyContentFormat(String notifyContentFormat) {
        this.notifyContentFormat = notifyContentFormat;
    }


    /**
     * set 是否启用通知
     *
     * @param enabled
     */
    public GetNotificationResult enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 通知endpoint, 当前支持http://和https://
     *
     * @param endpoint
     */
    public GetNotificationResult endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * set 触发通知的事件集合 (mpsTranscodeComplete, mpsThumbnailComplete)
     *
     * @param events
     */
    public GetNotificationResult events(List<String> events) {
        this.events = events;
        return this;
    }

    /**
     * set 重试策略, BACKOFF_RETRY: 退避重试策略, 重试 3 次, 每次重试的间隔时间是 10秒 到 20秒 之间的随机值; EXPONENTIAL_DECAY_RETRY: 指数衰减重试, 重试 176 次, 每次重试的间隔时间指数递增至 512秒, 总计重试时间为1天; 每次重试的具体间隔为: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512 ... 512 秒(共167个512)
     *
     * @param notifyStrategy
     */
    public GetNotificationResult notifyStrategy(String notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }

    /**
     * set 描述了向 Endpoint 推送的消息格式, JSON: 包含消息正文和消息属性, SIMPLIFIED: 消息体即用户发布的消息, 不包含任何属性信息
     *
     * @param notifyContentFormat
     */
    public GetNotificationResult notifyContentFormat(String notifyContentFormat) {
        this.notifyContentFormat = notifyContentFormat;
        return this;
    }


    /**
     * add item to 触发通知的事件集合 (mpsTranscodeComplete, mpsThumbnailComplete)
     *
     * @param event
     */
    public void addEvent(String event) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(event);
    }

}