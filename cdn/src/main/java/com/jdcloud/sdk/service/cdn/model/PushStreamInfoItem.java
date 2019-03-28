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

package com.jdcloud.sdk.service.cdn.model;


/**
 * pushStreamInfoItem
 */
public class PushStreamInfoItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * stream
     */
    private String stream;

    /**
     * clientIp
     */
    private String clientIp;

    /**
     * startTimeStamp
     */
    private Long startTimeStamp;

    /**
     * endTimeStamp
     */
    private Long endTimeStamp;

    /**
     * duration
     */
    private Long duration;


    /**
     * get stream
     *
     * @return
     */
    public String getStream() {
        return stream;
    }

    /**
     * set stream
     *
     * @param stream
     */
    public void setStream(String stream) {
        this.stream = stream;
    }

    /**
     * get clientIp
     *
     * @return
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * set clientIp
     *
     * @param clientIp
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * get startTimeStamp
     *
     * @return
     */
    public Long getStartTimeStamp() {
        return startTimeStamp;
    }

    /**
     * set startTimeStamp
     *
     * @param startTimeStamp
     */
    public void setStartTimeStamp(Long startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }

    /**
     * get endTimeStamp
     *
     * @return
     */
    public Long getEndTimeStamp() {
        return endTimeStamp;
    }

    /**
     * set endTimeStamp
     *
     * @param endTimeStamp
     */
    public void setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
    }

    /**
     * get duration
     *
     * @return
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * set duration
     *
     * @param duration
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }


    /**
     * set stream
     *
     * @param stream
     */
    public PushStreamInfoItem stream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * set clientIp
     *
     * @param clientIp
     */
    public PushStreamInfoItem clientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * set startTimeStamp
     *
     * @param startTimeStamp
     */
    public PushStreamInfoItem startTimeStamp(Long startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
        return this;
    }

    /**
     * set endTimeStamp
     *
     * @param endTimeStamp
     */
    public PushStreamInfoItem endTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }

    /**
     * set duration
     *
     * @param duration
     */
    public PushStreamInfoItem duration(Long duration) {
        this.duration = duration;
        return this;
    }


}