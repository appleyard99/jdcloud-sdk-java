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

package com.jdcloud.sdk.service.pod.model;


/**
 * 容器探活方式。
 */
public class Probe  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 容器启动多久后触发探针。
     */
    private Integer initialDelaySeconds;

    /**
     * 探测的时间间隔。
     */
    private Integer periodSeconds;

    /**
     * 探测的超时时间。
     */
    private Integer timeoutSeconds;

    /**
     * 在成功状态后，连续探活失败的次数，认为探活失败。
     */
    private Integer failureThreshold;

    /**
     * 在失败状态后，连续探活成功的次数，认为探活成功。
     */
    private Integer successThreshold;

    /**
     * 在容器内执行指定命令；如果命令退出时返回码为 0 则认为诊断成功。
     */
    private Exec exec;

    /**
     * 对指定的端口和路径上的容器的 IP 地址执行 HTTP Get 请求。如果响应的状态码大于等于 200 且小于 400，则认为诊断成功。
     */
    private Hg httpGet;

    /**
     * 对指定端口上的容器的 IP 地址进行 TCP 检查；如果端口打开，则认为诊断成功。
     */
    private TcpSocket tcpSocket;


    /**
     * get 容器启动多久后触发探针。
     *
     * @return
     */
    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    /**
     * set 容器启动多久后触发探针。
     *
     * @param initialDelaySeconds
     */
    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    /**
     * get 探测的时间间隔。
     *
     * @return
     */
    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    /**
     * set 探测的时间间隔。
     *
     * @param periodSeconds
     */
    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    /**
     * get 探测的超时时间。
     *
     * @return
     */
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * set 探测的超时时间。
     *
     * @param timeoutSeconds
     */
    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * get 在成功状态后，连续探活失败的次数，认为探活失败。
     *
     * @return
     */
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    /**
     * set 在成功状态后，连续探活失败的次数，认为探活失败。
     *
     * @param failureThreshold
     */
    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    /**
     * get 在失败状态后，连续探活成功的次数，认为探活成功。
     *
     * @return
     */
    public Integer getSuccessThreshold() {
        return successThreshold;
    }

    /**
     * set 在失败状态后，连续探活成功的次数，认为探活成功。
     *
     * @param successThreshold
     */
    public void setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
    }

    /**
     * get 在容器内执行指定命令；如果命令退出时返回码为 0 则认为诊断成功。
     *
     * @return
     */
    public Exec getExec() {
        return exec;
    }

    /**
     * set 在容器内执行指定命令；如果命令退出时返回码为 0 则认为诊断成功。
     *
     * @param exec
     */
    public void setExec(Exec exec) {
        this.exec = exec;
    }

    /**
     * get 对指定的端口和路径上的容器的 IP 地址执行 HTTP Get 请求。如果响应的状态码大于等于 200 且小于 400，则认为诊断成功。
     *
     * @return
     */
    public Hg getHttpGet() {
        return httpGet;
    }

    /**
     * set 对指定的端口和路径上的容器的 IP 地址执行 HTTP Get 请求。如果响应的状态码大于等于 200 且小于 400，则认为诊断成功。
     *
     * @param httpGet
     */
    public void setHttpGet(Hg httpGet) {
        this.httpGet = httpGet;
    }

    /**
     * get 对指定端口上的容器的 IP 地址进行 TCP 检查；如果端口打开，则认为诊断成功。
     *
     * @return
     */
    public TcpSocket getTcpSocket() {
        return tcpSocket;
    }

    /**
     * set 对指定端口上的容器的 IP 地址进行 TCP 检查；如果端口打开，则认为诊断成功。
     *
     * @param tcpSocket
     */
    public void setTcpSocket(TcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }


    /**
     * set 容器启动多久后触发探针。
     *
     * @param initialDelaySeconds
     */
    public Probe initialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    /**
     * set 探测的时间间隔。
     *
     * @param periodSeconds
     */
    public Probe periodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    /**
     * set 探测的超时时间。
     *
     * @param timeoutSeconds
     */
    public Probe timeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * set 在成功状态后，连续探活失败的次数，认为探活失败。
     *
     * @param failureThreshold
     */
    public Probe failureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * set 在失败状态后，连续探活成功的次数，认为探活成功。
     *
     * @param successThreshold
     */
    public Probe successThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

    /**
     * set 在容器内执行指定命令；如果命令退出时返回码为 0 则认为诊断成功。
     *
     * @param exec
     */
    public Probe exec(Exec exec) {
        this.exec = exec;
        return this;
    }

    /**
     * set 对指定的端口和路径上的容器的 IP 地址执行 HTTP Get 请求。如果响应的状态码大于等于 200 且小于 400，则认为诊断成功。
     *
     * @param httpGet
     */
    public Probe httpGet(Hg httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    /**
     * set 对指定端口上的容器的 IP 地址进行 TCP 检查；如果端口打开，则认为诊断成功。
     *
     * @param tcpSocket
     */
    public Probe tcpSocket(TcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
        return this;
    }


}