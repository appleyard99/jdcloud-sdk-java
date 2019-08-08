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
 * 网站监控
 * 云解析OpenAPI网站监控接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.domainservice.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.domainservice.model.ModifyMonitorStatusResponse;

/**
 * 监控项的操作集合，包括：暂停，启动, 手动恢复, 手动切换
 */
class ModifyMonitorStatusExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "PUT";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/domain/{domainId}/monitor/{monitorId}/status";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return ModifyMonitorStatusResponse.class;
    }
}
