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

package com.jdcloud.sdk.service.live.model;


/**
 * publishOnlineStreamResultData
 */
public class PublishOnlineStreamResultData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * APP名称

     */
    private String appName;

    /**
     * 流名称

     */
    private String streamName;

    /**
     * 客户端ip

     */
    private String clientIp;

    /**
     * 边缘节点ip

     */
    private String serverIp;

    /**
     * 帧率

     */
    private Number frameRate;

    /**
     * 丢帧率

     */
    private Number frameLossRate;

    /**
     * 最近活跃时间

     */
    private Long lastActive;

    /**
     * 实时帧率

     */
    private Number realFps;

    /**
     * 上传速度  单位：KB/s

     */
    private Long uploadSpeed;

    /**
     * 视频codec，取值：
- VideoAVC &#x3D; 7
- VideoHEVC &#x3D; 12

     */
    private Long videoCodec;

    /**
     * 视频码率 单位：KB/s

     */
    private Long videoDataRate;

    /**
     * 音频codec，取值：
- AudioReserved1 &#x3D; 16
- AudioDisabled &#x3D; 17
- AudioLinearPCMPlatformEndian &#x3D; 0
- AudioADPCM &#x3D; 1
- AudioMP3 &#x3D; 2
- AudioLinearPCMLittleEndian &#x3D; 3
- AudioNellymoser16kHzMono &#x3D; 4
- AudioNellymoser8kHzMono &#x3D; 5
- AudioNellymoser &#x3D; 6
- AudioReservedG711AlawLogarithmicPCM &#x3D; 7
- AudioReservedG711MuLawLogarithmicPCM &#x3D; 8
- AudioReserved &#x3D; 9
- AudioAAC &#x3D; 10
- AudioSpeex &#x3D; 11
- AudioReservedMP3_8kHz &#x3D; 14
- AudioReservedDeviceSpecificSound &#x3D; 15

     */
    private Long audioCodec;


    /**
     * get APP名称

     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set APP名称

     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get 流名称

     *
     * @return
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * set 流名称

     *
     * @param streamName
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * get 客户端ip

     *
     * @return
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * set 客户端ip

     *
     * @param clientIp
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * get 边缘节点ip

     *
     * @return
     */
    public String getServerIp() {
        return serverIp;
    }

    /**
     * set 边缘节点ip

     *
     * @param serverIp
     */
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    /**
     * get 帧率

     *
     * @return
     */
    public Number getFrameRate() {
        return frameRate;
    }

    /**
     * set 帧率

     *
     * @param frameRate
     */
    public void setFrameRate(Number frameRate) {
        this.frameRate = frameRate;
    }

    /**
     * get 丢帧率

     *
     * @return
     */
    public Number getFrameLossRate() {
        return frameLossRate;
    }

    /**
     * set 丢帧率

     *
     * @param frameLossRate
     */
    public void setFrameLossRate(Number frameLossRate) {
        this.frameLossRate = frameLossRate;
    }

    /**
     * get 最近活跃时间

     *
     * @return
     */
    public Long getLastActive() {
        return lastActive;
    }

    /**
     * set 最近活跃时间

     *
     * @param lastActive
     */
    public void setLastActive(Long lastActive) {
        this.lastActive = lastActive;
    }

    /**
     * get 实时帧率

     *
     * @return
     */
    public Number getRealFps() {
        return realFps;
    }

    /**
     * set 实时帧率

     *
     * @param realFps
     */
    public void setRealFps(Number realFps) {
        this.realFps = realFps;
    }

    /**
     * get 上传速度  单位：KB/s

     *
     * @return
     */
    public Long getUploadSpeed() {
        return uploadSpeed;
    }

    /**
     * set 上传速度  单位：KB/s

     *
     * @param uploadSpeed
     */
    public void setUploadSpeed(Long uploadSpeed) {
        this.uploadSpeed = uploadSpeed;
    }

    /**
     * get 视频codec，取值：
- VideoAVC &#x3D; 7
- VideoHEVC &#x3D; 12

     *
     * @return
     */
    public Long getVideoCodec() {
        return videoCodec;
    }

    /**
     * set 视频codec，取值：
- VideoAVC &#x3D; 7
- VideoHEVC &#x3D; 12

     *
     * @param videoCodec
     */
    public void setVideoCodec(Long videoCodec) {
        this.videoCodec = videoCodec;
    }

    /**
     * get 视频码率 单位：KB/s

     *
     * @return
     */
    public Long getVideoDataRate() {
        return videoDataRate;
    }

    /**
     * set 视频码率 单位：KB/s

     *
     * @param videoDataRate
     */
    public void setVideoDataRate(Long videoDataRate) {
        this.videoDataRate = videoDataRate;
    }

    /**
     * get 音频codec，取值：
- AudioReserved1 &#x3D; 16
- AudioDisabled &#x3D; 17
- AudioLinearPCMPlatformEndian &#x3D; 0
- AudioADPCM &#x3D; 1
- AudioMP3 &#x3D; 2
- AudioLinearPCMLittleEndian &#x3D; 3
- AudioNellymoser16kHzMono &#x3D; 4
- AudioNellymoser8kHzMono &#x3D; 5
- AudioNellymoser &#x3D; 6
- AudioReservedG711AlawLogarithmicPCM &#x3D; 7
- AudioReservedG711MuLawLogarithmicPCM &#x3D; 8
- AudioReserved &#x3D; 9
- AudioAAC &#x3D; 10
- AudioSpeex &#x3D; 11
- AudioReservedMP3_8kHz &#x3D; 14
- AudioReservedDeviceSpecificSound &#x3D; 15

     *
     * @return
     */
    public Long getAudioCodec() {
        return audioCodec;
    }

    /**
     * set 音频codec，取值：
- AudioReserved1 &#x3D; 16
- AudioDisabled &#x3D; 17
- AudioLinearPCMPlatformEndian &#x3D; 0
- AudioADPCM &#x3D; 1
- AudioMP3 &#x3D; 2
- AudioLinearPCMLittleEndian &#x3D; 3
- AudioNellymoser16kHzMono &#x3D; 4
- AudioNellymoser8kHzMono &#x3D; 5
- AudioNellymoser &#x3D; 6
- AudioReservedG711AlawLogarithmicPCM &#x3D; 7
- AudioReservedG711MuLawLogarithmicPCM &#x3D; 8
- AudioReserved &#x3D; 9
- AudioAAC &#x3D; 10
- AudioSpeex &#x3D; 11
- AudioReservedMP3_8kHz &#x3D; 14
- AudioReservedDeviceSpecificSound &#x3D; 15

     *
     * @param audioCodec
     */
    public void setAudioCodec(Long audioCodec) {
        this.audioCodec = audioCodec;
    }


    /**
     * set APP名称

     *
     * @param appName
     */
    public PublishOnlineStreamResultData appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 流名称

     *
     * @param streamName
     */
    public PublishOnlineStreamResultData streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * set 客户端ip

     *
     * @param clientIp
     */
    public PublishOnlineStreamResultData clientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * set 边缘节点ip

     *
     * @param serverIp
     */
    public PublishOnlineStreamResultData serverIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }

    /**
     * set 帧率

     *
     * @param frameRate
     */
    public PublishOnlineStreamResultData frameRate(Number frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * set 丢帧率

     *
     * @param frameLossRate
     */
    public PublishOnlineStreamResultData frameLossRate(Number frameLossRate) {
        this.frameLossRate = frameLossRate;
        return this;
    }

    /**
     * set 最近活跃时间

     *
     * @param lastActive
     */
    public PublishOnlineStreamResultData lastActive(Long lastActive) {
        this.lastActive = lastActive;
        return this;
    }

    /**
     * set 实时帧率

     *
     * @param realFps
     */
    public PublishOnlineStreamResultData realFps(Number realFps) {
        this.realFps = realFps;
        return this;
    }

    /**
     * set 上传速度  单位：KB/s

     *
     * @param uploadSpeed
     */
    public PublishOnlineStreamResultData uploadSpeed(Long uploadSpeed) {
        this.uploadSpeed = uploadSpeed;
        return this;
    }

    /**
     * set 视频codec，取值：
- VideoAVC &#x3D; 7
- VideoHEVC &#x3D; 12

     *
     * @param videoCodec
     */
    public PublishOnlineStreamResultData videoCodec(Long videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }

    /**
     * set 视频码率 单位：KB/s

     *
     * @param videoDataRate
     */
    public PublishOnlineStreamResultData videoDataRate(Long videoDataRate) {
        this.videoDataRate = videoDataRate;
        return this;
    }

    /**
     * set 音频codec，取值：
- AudioReserved1 &#x3D; 16
- AudioDisabled &#x3D; 17
- AudioLinearPCMPlatformEndian &#x3D; 0
- AudioADPCM &#x3D; 1
- AudioMP3 &#x3D; 2
- AudioLinearPCMLittleEndian &#x3D; 3
- AudioNellymoser16kHzMono &#x3D; 4
- AudioNellymoser8kHzMono &#x3D; 5
- AudioNellymoser &#x3D; 6
- AudioReservedG711AlawLogarithmicPCM &#x3D; 7
- AudioReservedG711MuLawLogarithmicPCM &#x3D; 8
- AudioReserved &#x3D; 9
- AudioAAC &#x3D; 10
- AudioSpeex &#x3D; 11
- AudioReservedMP3_8kHz &#x3D; 14
- AudioReservedDeviceSpecificSound &#x3D; 15

     *
     * @param audioCodec
     */
    public PublishOnlineStreamResultData audioCodec(Long audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }


}