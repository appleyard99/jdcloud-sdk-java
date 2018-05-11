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
 * 云监控
 * 云监控相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.monitor.model.DeleteAlarmsRequest;
import com.jdcloud.sdk.service.monitor.model.DeleteAlarmsResponse;
import com.jdcloud.sdk.service.monitor.client.DeleteAlarmsExecutor;
import com.jdcloud.sdk.service.monitor.model.DescribeMetricDataRequest;
import com.jdcloud.sdk.service.monitor.model.DescribeMetricDataResponse;
import com.jdcloud.sdk.service.monitor.client.DescribeMetricDataExecutor;
import com.jdcloud.sdk.service.monitor.model.UpdateAlarmRequest;
import com.jdcloud.sdk.service.monitor.model.UpdateAlarmResponse;
import com.jdcloud.sdk.service.monitor.client.UpdateAlarmExecutor;
import com.jdcloud.sdk.service.monitor.model.DescribeAlarmHistoryRequest;
import com.jdcloud.sdk.service.monitor.model.DescribeAlarmHistoryResponse;
import com.jdcloud.sdk.service.monitor.client.DescribeAlarmHistoryExecutor;
import com.jdcloud.sdk.service.monitor.model.DescribeMetricsRequest;
import com.jdcloud.sdk.service.monitor.model.DescribeMetricsResponse;
import com.jdcloud.sdk.service.monitor.client.DescribeMetricsExecutor;
import com.jdcloud.sdk.service.monitor.model.DisableAlarmRequest;
import com.jdcloud.sdk.service.monitor.model.DisableAlarmResponse;
import com.jdcloud.sdk.service.monitor.client.DisableAlarmExecutor;
import com.jdcloud.sdk.service.monitor.model.CreateAlarmRequest;
import com.jdcloud.sdk.service.monitor.model.CreateAlarmResponse;
import com.jdcloud.sdk.service.monitor.client.CreateAlarmExecutor;
import com.jdcloud.sdk.service.monitor.model.DescribeAlarmsRequest;
import com.jdcloud.sdk.service.monitor.model.DescribeAlarmsResponse;
import com.jdcloud.sdk.service.monitor.client.DescribeAlarmsExecutor;
import com.jdcloud.sdk.service.monitor.model.DescribeAlarmsByIDRequest;
import com.jdcloud.sdk.service.monitor.model.DescribeAlarmsByIDResponse;
import com.jdcloud.sdk.service.monitor.client.DescribeAlarmsByIDExecutor;
import com.jdcloud.sdk.service.monitor.model.DescribeMetricsForCreateAlarmRequest;
import com.jdcloud.sdk.service.monitor.model.DescribeMetricsForCreateAlarmResponse;
import com.jdcloud.sdk.service.monitor.client.DescribeMetricsForCreateAlarmExecutor;
import com.jdcloud.sdk.service.monitor.model.EnableAlarmRequest;
import com.jdcloud.sdk.service.monitor.model.EnableAlarmResponse;
import com.jdcloud.sdk.service.monitor.client.EnableAlarmExecutor;

/**
 * monitorClient
 */
public class MonitorClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.1";
    public final static String DefaultEndpoint = "monitor.jdcloud-api.com";
    public final static String ServiceName = "monitor";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private MonitorClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 批量删除规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteAlarmsResponse deleteAlarms(DeleteAlarmsRequest request) throws JdcloudSdkException {
        return new DeleteAlarmsExecutor().client(this).execute(request);
    }

    /**
     * 查看某资源的监控数据
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeMetricDataResponse describeMetricData(DescribeMetricDataRequest request) throws JdcloudSdkException {
        return new DescribeMetricDataExecutor().client(this).execute(request);
    }

    /**
     * 修改已创建的报警规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateAlarmResponse updateAlarm(UpdateAlarmRequest request) throws JdcloudSdkException {
        return new UpdateAlarmExecutor().client(this).execute(request);
    }

    /**
     * 查询报警历史
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAlarmHistoryResponse describeAlarmHistory(DescribeAlarmHistoryRequest request) throws JdcloudSdkException {
        return new DescribeAlarmHistoryExecutor().client(this).execute(request);
    }

    /**
     * 根据产品线查询可用监控项列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeMetricsResponse describeMetrics(DescribeMetricsRequest request) throws JdcloudSdkException {
        return new DescribeMetricsExecutor().client(this).execute(request);
    }

    /**
     * 禁用报警规则。报警规则禁用后，将停止探测实例的监控项数据。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableAlarmResponse disableAlarm(DisableAlarmRequest request) throws JdcloudSdkException {
        return new DisableAlarmExecutor().client(this).execute(request);
    }

    /**
     * 创建报警规则，可以为某一个实例创建报警规则，也可以为多个实例同时创建报警规则。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateAlarmResponse createAlarm(CreateAlarmRequest request) throws JdcloudSdkException {
        return new CreateAlarmExecutor().client(this).execute(request);
    }

    /**
     * 查询监控规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAlarmsResponse describeAlarms(DescribeAlarmsRequest request) throws JdcloudSdkException {
        return new DescribeAlarmsExecutor().client(this).execute(request);
    }

    /**
     * 查询规则详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAlarmsByIDResponse describeAlarmsByID(DescribeAlarmsByIDRequest request) throws JdcloudSdkException {
        return new DescribeAlarmsByIDExecutor().client(this).execute(request);
    }

    /**
     * 查询可用创建监控规则的指标列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeMetricsForCreateAlarmResponse describeMetricsForCreateAlarm(DescribeMetricsForCreateAlarmRequest request) throws JdcloudSdkException {
        return new DescribeMetricsForCreateAlarmExecutor().client(this).execute(request);
    }

    /**
     * 启用报警规则，当客户的报警规则处于停止状态时，可以使用此接口启用报警规则。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableAlarmResponse enableAlarm(EnableAlarmRequest request) throws JdcloudSdkException {
        return new EnableAlarmExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public MonitorClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private MonitorClient monitorClient;

        public DefaultBuilder() {
            monitorClient = new MonitorClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            monitorClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            monitorClient.httpRequestConfig = config;
            return this;
        }

        public MonitorClient build() throws JdcloudSdkException {

            if (monitorClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                monitorClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (monitorClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("MonitorClient build error: jdcloud credentials provider not set");
                }
            }
            if (monitorClient.httpRequestConfig == null) {
                monitorClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (monitorClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("MonitorClient build error: http request config not set");
                }
            }
            return monitorClient;
        }

        public Builder environment(Environment environment) {
            monitorClient.environment = environment;
            return this;
        }
    }
}
