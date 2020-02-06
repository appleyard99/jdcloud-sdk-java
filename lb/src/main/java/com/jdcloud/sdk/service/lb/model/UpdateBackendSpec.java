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

package com.jdcloud.sdk.service.lb.model;

import java.util.List;
import java.util.ArrayList;

/**
 * updateBackendSpec
 */
public class UpdateBackendSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 后端服务名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     */
    private String backendName;

    /**
     * 健康检查信息
     */
    private HealthCheckSpec healthCheckSpec;

    /**
     * 调度算法 &lt;br&gt;【alb,nlb】取值范围为[IpHash, RoundRobin, LeastConn]（含义分别为：加权源Ip哈希，加权轮询和加权最小连接） &lt;br&gt;【dnlb】取值范围为[IpHash, QuintupleHash]（含义分别为：加权源Ip哈希和加权五元组哈希）
     */
    private String algorithm;

    /**
     * 虚拟服务器组的Id列表，目前只支持一个，且与agIds不能同时存在
     */
    private List<String> targetGroupIds;

    /**
     * 高可用组的Id列表，目前只支持一个，且与targetGroupIds不能同时存在
     */
    private List<String> agIds;

    /**
     * 【alb Tcp协议】是否启用Proxy ProtocolV1协议获取真实源ip, 取值为false(不开启)或者true(开启), 默认为false
     */
    private Boolean proxyProtocol;

    /**
     * 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;

    /**
     * 会话保持, 取值为false(不开启)或者true(开启)，默认为false &lt;br&gt;【alb Http协议，RoundRobin算法】支持基于cookie的会话保持 &lt;br&gt;【nlb】支持基于报文源目的IP的会话保持
     */
    private Boolean sessionStickiness;

    /**
     * 【nlb】会话保持超时时间，sessionStickiness开启时生效, 取值范围[1-3600]
     */
    private Integer sessionStickyTimeout;

    /**
     * 【nlb】连接耗尽超时，移除target前，连接的最大保持时间，默认300s，取值范围[0-3600]
     */
    private Integer connectionDrainingSeconds;

    /**
     * 【alb Http协议】cookie的过期时间,sessionStickiness开启时生效，取值范围为[0-86400], 0表示cookie与浏览器同生命周期
     */
    private Integer httpCookieExpireSeconds;

    /**
     * 【alb Http协议】获取负载均衡的协议, 取值为False(不获取)或True(获取)
     */
    private Boolean httpForwardedProtocol;

    /**
     * 【alb Http协议】获取负载均衡的端口, 取值为False(不获取)或True(获取)
     */
    private Boolean httpForwardedPort;

    /**
     * 【alb Http协议】获取负载均衡的host信息, 取值为False(不获取)或True(获取)
     */
    private Boolean httpForwardedHost;

    /**
     * 【alb Http协议】获取负载均衡的vip, 取值为False(不获取)或True(获取)
     */
    private Boolean httpForwardedVip;

    /**
     * 【alb,dnlb】关闭健康检查，取值为false(不关闭)或true(关闭)
     */
    private Boolean closeHealthCheck;


    /**
     * get 后端服务名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @return
     */
    public String getBackendName() {
        return backendName;
    }

    /**
     * set 后端服务名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param backendName
     */
    public void setBackendName(String backendName) {
        this.backendName = backendName;
    }

    /**
     * get 健康检查信息
     *
     * @return
     */
    public HealthCheckSpec getHealthCheckSpec() {
        return healthCheckSpec;
    }

    /**
     * set 健康检查信息
     *
     * @param healthCheckSpec
     */
    public void setHealthCheckSpec(HealthCheckSpec healthCheckSpec) {
        this.healthCheckSpec = healthCheckSpec;
    }

    /**
     * get 调度算法 &lt;br&gt;【alb,nlb】取值范围为[IpHash, RoundRobin, LeastConn]（含义分别为：加权源Ip哈希，加权轮询和加权最小连接） &lt;br&gt;【dnlb】取值范围为[IpHash, QuintupleHash]（含义分别为：加权源Ip哈希和加权五元组哈希）
     *
     * @return
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * set 调度算法 &lt;br&gt;【alb,nlb】取值范围为[IpHash, RoundRobin, LeastConn]（含义分别为：加权源Ip哈希，加权轮询和加权最小连接） &lt;br&gt;【dnlb】取值范围为[IpHash, QuintupleHash]（含义分别为：加权源Ip哈希和加权五元组哈希）
     *
     * @param algorithm
     */
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * get 虚拟服务器组的Id列表，目前只支持一个，且与agIds不能同时存在
     *
     * @return
     */
    public List<String> getTargetGroupIds() {
        return targetGroupIds;
    }

    /**
     * set 虚拟服务器组的Id列表，目前只支持一个，且与agIds不能同时存在
     *
     * @param targetGroupIds
     */
    public void setTargetGroupIds(List<String> targetGroupIds) {
        this.targetGroupIds = targetGroupIds;
    }

    /**
     * get 高可用组的Id列表，目前只支持一个，且与targetGroupIds不能同时存在
     *
     * @return
     */
    public List<String> getAgIds() {
        return agIds;
    }

    /**
     * set 高可用组的Id列表，目前只支持一个，且与targetGroupIds不能同时存在
     *
     * @param agIds
     */
    public void setAgIds(List<String> agIds) {
        this.agIds = agIds;
    }

    /**
     * get 【alb Tcp协议】是否启用Proxy ProtocolV1协议获取真实源ip, 取值为false(不开启)或者true(开启), 默认为false
     *
     * @return
     */
    public Boolean getProxyProtocol() {
        return proxyProtocol;
    }

    /**
     * set 【alb Tcp协议】是否启用Proxy ProtocolV1协议获取真实源ip, 取值为false(不开启)或者true(开启), 默认为false
     *
     * @param proxyProtocol
     */
    public void setProxyProtocol(Boolean proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
    }

    /**
     * get 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 会话保持, 取值为false(不开启)或者true(开启)，默认为false &lt;br&gt;【alb Http协议，RoundRobin算法】支持基于cookie的会话保持 &lt;br&gt;【nlb】支持基于报文源目的IP的会话保持
     *
     * @return
     */
    public Boolean getSessionStickiness() {
        return sessionStickiness;
    }

    /**
     * set 会话保持, 取值为false(不开启)或者true(开启)，默认为false &lt;br&gt;【alb Http协议，RoundRobin算法】支持基于cookie的会话保持 &lt;br&gt;【nlb】支持基于报文源目的IP的会话保持
     *
     * @param sessionStickiness
     */
    public void setSessionStickiness(Boolean sessionStickiness) {
        this.sessionStickiness = sessionStickiness;
    }

    /**
     * get 【nlb】会话保持超时时间，sessionStickiness开启时生效, 取值范围[1-3600]
     *
     * @return
     */
    public Integer getSessionStickyTimeout() {
        return sessionStickyTimeout;
    }

    /**
     * set 【nlb】会话保持超时时间，sessionStickiness开启时生效, 取值范围[1-3600]
     *
     * @param sessionStickyTimeout
     */
    public void setSessionStickyTimeout(Integer sessionStickyTimeout) {
        this.sessionStickyTimeout = sessionStickyTimeout;
    }

    /**
     * get 【nlb】连接耗尽超时，移除target前，连接的最大保持时间，默认300s，取值范围[0-3600]
     *
     * @return
     */
    public Integer getConnectionDrainingSeconds() {
        return connectionDrainingSeconds;
    }

    /**
     * set 【nlb】连接耗尽超时，移除target前，连接的最大保持时间，默认300s，取值范围[0-3600]
     *
     * @param connectionDrainingSeconds
     */
    public void setConnectionDrainingSeconds(Integer connectionDrainingSeconds) {
        this.connectionDrainingSeconds = connectionDrainingSeconds;
    }

    /**
     * get 【alb Http协议】cookie的过期时间,sessionStickiness开启时生效，取值范围为[0-86400], 0表示cookie与浏览器同生命周期
     *
     * @return
     */
    public Integer getHttpCookieExpireSeconds() {
        return httpCookieExpireSeconds;
    }

    /**
     * set 【alb Http协议】cookie的过期时间,sessionStickiness开启时生效，取值范围为[0-86400], 0表示cookie与浏览器同生命周期
     *
     * @param httpCookieExpireSeconds
     */
    public void setHttpCookieExpireSeconds(Integer httpCookieExpireSeconds) {
        this.httpCookieExpireSeconds = httpCookieExpireSeconds;
    }

    /**
     * get 【alb Http协议】获取负载均衡的协议, 取值为False(不获取)或True(获取)
     *
     * @return
     */
    public Boolean getHttpForwardedProtocol() {
        return httpForwardedProtocol;
    }

    /**
     * set 【alb Http协议】获取负载均衡的协议, 取值为False(不获取)或True(获取)
     *
     * @param httpForwardedProtocol
     */
    public void setHttpForwardedProtocol(Boolean httpForwardedProtocol) {
        this.httpForwardedProtocol = httpForwardedProtocol;
    }

    /**
     * get 【alb Http协议】获取负载均衡的端口, 取值为False(不获取)或True(获取)
     *
     * @return
     */
    public Boolean getHttpForwardedPort() {
        return httpForwardedPort;
    }

    /**
     * set 【alb Http协议】获取负载均衡的端口, 取值为False(不获取)或True(获取)
     *
     * @param httpForwardedPort
     */
    public void setHttpForwardedPort(Boolean httpForwardedPort) {
        this.httpForwardedPort = httpForwardedPort;
    }

    /**
     * get 【alb Http协议】获取负载均衡的host信息, 取值为False(不获取)或True(获取)
     *
     * @return
     */
    public Boolean getHttpForwardedHost() {
        return httpForwardedHost;
    }

    /**
     * set 【alb Http协议】获取负载均衡的host信息, 取值为False(不获取)或True(获取)
     *
     * @param httpForwardedHost
     */
    public void setHttpForwardedHost(Boolean httpForwardedHost) {
        this.httpForwardedHost = httpForwardedHost;
    }

    /**
     * get 【alb Http协议】获取负载均衡的vip, 取值为False(不获取)或True(获取)
     *
     * @return
     */
    public Boolean getHttpForwardedVip() {
        return httpForwardedVip;
    }

    /**
     * set 【alb Http协议】获取负载均衡的vip, 取值为False(不获取)或True(获取)
     *
     * @param httpForwardedVip
     */
    public void setHttpForwardedVip(Boolean httpForwardedVip) {
        this.httpForwardedVip = httpForwardedVip;
    }

    /**
     * get 【alb,dnlb】关闭健康检查，取值为false(不关闭)或true(关闭)
     *
     * @return
     */
    public Boolean getCloseHealthCheck() {
        return closeHealthCheck;
    }

    /**
     * set 【alb,dnlb】关闭健康检查，取值为false(不关闭)或true(关闭)
     *
     * @param closeHealthCheck
     */
    public void setCloseHealthCheck(Boolean closeHealthCheck) {
        this.closeHealthCheck = closeHealthCheck;
    }


    /**
     * set 后端服务名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param backendName
     */
    public UpdateBackendSpec backendName(String backendName) {
        this.backendName = backendName;
        return this;
    }

    /**
     * set 健康检查信息
     *
     * @param healthCheckSpec
     */
    public UpdateBackendSpec healthCheckSpec(HealthCheckSpec healthCheckSpec) {
        this.healthCheckSpec = healthCheckSpec;
        return this;
    }

    /**
     * set 调度算法 &lt;br&gt;【alb,nlb】取值范围为[IpHash, RoundRobin, LeastConn]（含义分别为：加权源Ip哈希，加权轮询和加权最小连接） &lt;br&gt;【dnlb】取值范围为[IpHash, QuintupleHash]（含义分别为：加权源Ip哈希和加权五元组哈希）
     *
     * @param algorithm
     */
    public UpdateBackendSpec algorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * set 虚拟服务器组的Id列表，目前只支持一个，且与agIds不能同时存在
     *
     * @param targetGroupIds
     */
    public UpdateBackendSpec targetGroupIds(List<String> targetGroupIds) {
        this.targetGroupIds = targetGroupIds;
        return this;
    }

    /**
     * set 高可用组的Id列表，目前只支持一个，且与targetGroupIds不能同时存在
     *
     * @param agIds
     */
    public UpdateBackendSpec agIds(List<String> agIds) {
        this.agIds = agIds;
        return this;
    }

    /**
     * set 【alb Tcp协议】是否启用Proxy ProtocolV1协议获取真实源ip, 取值为false(不开启)或者true(开启), 默认为false
     *
     * @param proxyProtocol
     */
    public UpdateBackendSpec proxyProtocol(Boolean proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
        return this;
    }

    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public UpdateBackendSpec description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 会话保持, 取值为false(不开启)或者true(开启)，默认为false &lt;br&gt;【alb Http协议，RoundRobin算法】支持基于cookie的会话保持 &lt;br&gt;【nlb】支持基于报文源目的IP的会话保持
     *
     * @param sessionStickiness
     */
    public UpdateBackendSpec sessionStickiness(Boolean sessionStickiness) {
        this.sessionStickiness = sessionStickiness;
        return this;
    }

    /**
     * set 【nlb】会话保持超时时间，sessionStickiness开启时生效, 取值范围[1-3600]
     *
     * @param sessionStickyTimeout
     */
    public UpdateBackendSpec sessionStickyTimeout(Integer sessionStickyTimeout) {
        this.sessionStickyTimeout = sessionStickyTimeout;
        return this;
    }

    /**
     * set 【nlb】连接耗尽超时，移除target前，连接的最大保持时间，默认300s，取值范围[0-3600]
     *
     * @param connectionDrainingSeconds
     */
    public UpdateBackendSpec connectionDrainingSeconds(Integer connectionDrainingSeconds) {
        this.connectionDrainingSeconds = connectionDrainingSeconds;
        return this;
    }

    /**
     * set 【alb Http协议】cookie的过期时间,sessionStickiness开启时生效，取值范围为[0-86400], 0表示cookie与浏览器同生命周期
     *
     * @param httpCookieExpireSeconds
     */
    public UpdateBackendSpec httpCookieExpireSeconds(Integer httpCookieExpireSeconds) {
        this.httpCookieExpireSeconds = httpCookieExpireSeconds;
        return this;
    }

    /**
     * set 【alb Http协议】获取负载均衡的协议, 取值为False(不获取)或True(获取)
     *
     * @param httpForwardedProtocol
     */
    public UpdateBackendSpec httpForwardedProtocol(Boolean httpForwardedProtocol) {
        this.httpForwardedProtocol = httpForwardedProtocol;
        return this;
    }

    /**
     * set 【alb Http协议】获取负载均衡的端口, 取值为False(不获取)或True(获取)
     *
     * @param httpForwardedPort
     */
    public UpdateBackendSpec httpForwardedPort(Boolean httpForwardedPort) {
        this.httpForwardedPort = httpForwardedPort;
        return this;
    }

    /**
     * set 【alb Http协议】获取负载均衡的host信息, 取值为False(不获取)或True(获取)
     *
     * @param httpForwardedHost
     */
    public UpdateBackendSpec httpForwardedHost(Boolean httpForwardedHost) {
        this.httpForwardedHost = httpForwardedHost;
        return this;
    }

    /**
     * set 【alb Http协议】获取负载均衡的vip, 取值为False(不获取)或True(获取)
     *
     * @param httpForwardedVip
     */
    public UpdateBackendSpec httpForwardedVip(Boolean httpForwardedVip) {
        this.httpForwardedVip = httpForwardedVip;
        return this;
    }

    /**
     * set 【alb,dnlb】关闭健康检查，取值为false(不关闭)或true(关闭)
     *
     * @param closeHealthCheck
     */
    public UpdateBackendSpec closeHealthCheck(Boolean closeHealthCheck) {
        this.closeHealthCheck = closeHealthCheck;
        return this;
    }


    /**
     * add item to 虚拟服务器组的Id列表，目前只支持一个，且与agIds不能同时存在
     *
     * @param targetGroupId
     */
    public void addTargetGroupId(String targetGroupId) {
        if (this.targetGroupIds == null) {
            this.targetGroupIds = new ArrayList<>();
        }
        this.targetGroupIds.add(targetGroupId);
    }

    /**
     * add item to 高可用组的Id列表，目前只支持一个，且与targetGroupIds不能同时存在
     *
     * @param agId
     */
    public void addAgId(String agId) {
        if (this.agIds == null) {
            this.agIds = new ArrayList<>();
        }
        this.agIds.add(agId);
    }

}