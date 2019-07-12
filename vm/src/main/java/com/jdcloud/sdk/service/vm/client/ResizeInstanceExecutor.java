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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.vm.model.ResizeInstanceResponse;

/**
 * 云主机变更实例规格&lt;br&gt;
云主机的状态必须为&lt;b&gt;stopped&lt;/b&gt;状态。&lt;br&gt;
以下情况的云主机，不允许在一代与二代实例规格间互相调整，例：不允许g.n1与g.n2之间互相调配&lt;br&gt;
1、16年创建的云硬盘做系统盘的云主机&lt;br&gt;
2、本地盘(local类型)做系统盘的云主机。&lt;br&gt;
3、使用高可用组(Ag)创建的云主机。&lt;br&gt;
如果当前主机中的弹性网卡数量，大于新实例规格允许的弹性网卡数量，会返回错误。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes&quot;&gt;DescribeInstanceTypes&lt;/a&gt;接口获得指定地域及可用区下的实例规格信息。&lt;br&gt;
当前主机所使用的镜像，需要支持要变更的目标实例规格，否则返回错误。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeimageconstraints&quot;&gt;DescribeImageConstraints&lt;/a&gt;接口获得指定镜像的实例规格限制信息。&lt;br&gt;
云主机欠费或到期时，无法更改实例规格。

 */
class ResizeInstanceExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/instances/{instanceId}:resizeInstance";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return ResizeInstanceResponse.class;
    }
}
