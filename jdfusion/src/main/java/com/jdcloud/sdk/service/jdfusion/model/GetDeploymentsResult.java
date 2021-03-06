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
 * Deployment
 * 与Deployment相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.jdfusion.model.DeploymentInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询部署信息列表
 */
public class GetDeploymentsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * deployments
     */
    private List<DeploymentInfo> deployments;


    /**
     * get deployments
     *
     * @return
     */
    public List<DeploymentInfo> getDeployments() {
        return deployments;
    }

    /**
     * set deployments
     *
     * @param deployments
     */
    public void setDeployments(List<DeploymentInfo> deployments) {
        this.deployments = deployments;
    }


    /**
     * set deployments
     *
     * @param deployments
     */
    public GetDeploymentsResult deployments(List<DeploymentInfo> deployments) {
        this.deployments = deployments;
        return this;
    }


    /**
     * add item to deployments
     *
     * @param deployment
     */
    public void addDeployment(DeploymentInfo deployment) {
        if (this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        this.deployments.add(deployment);
    }

}