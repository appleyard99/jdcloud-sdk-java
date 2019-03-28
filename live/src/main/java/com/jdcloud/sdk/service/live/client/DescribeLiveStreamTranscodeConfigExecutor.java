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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.live.model.DescribeLiveStreamTranscodeConfigResponse;

/**
 * 查询转码模板配置
- 转码模板配置按照 域名,应用,流 3级配置添加,以最小的粒度配置生效原则
- 域名、应用、流 依次粒度递减 即: 域名&gt;应用&gt;流
- 该查询旨在查询域名、应用、流最终生效的转码模板配置,并非各级的模板绑定情况

 */
class DescribeLiveStreamTranscodeConfigExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String url() {
        return "/transcodes:config";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return DescribeLiveStreamTranscodeConfigResponse.class;
    }
}
