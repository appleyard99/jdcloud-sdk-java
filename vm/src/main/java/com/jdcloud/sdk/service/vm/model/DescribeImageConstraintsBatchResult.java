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
 * 镜像
 * 关于主机镜像操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vm.model.ImageConstraint;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 批量查询镜像的实例规格限制。&lt;br&gt;
通过此接口可以查看镜像不支持的实例规格。只有官方镜像、第三方镜像有实例规格的限制，个人的私有镜像没有此限制。

 */
public class DescribeImageConstraintsBatchResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * imageConstraints
     */
    private List<ImageConstraint> imageConstraints;


    /**
     * get imageConstraints
     *
     * @return
     */
    public List<ImageConstraint> getImageConstraints() {
        return imageConstraints;
    }

    /**
     * set imageConstraints
     *
     * @param imageConstraints
     */
    public void setImageConstraints(List<ImageConstraint> imageConstraints) {
        this.imageConstraints = imageConstraints;
    }


    /**
     * set imageConstraints
     *
     * @param imageConstraints
     */
    public DescribeImageConstraintsBatchResult imageConstraints(List<ImageConstraint> imageConstraints) {
        this.imageConstraints = imageConstraints;
        return this;
    }


    /**
     * add item to imageConstraints
     *
     * @param imageConstraint
     */
    public void addImageConstraint(ImageConstraint imageConstraint) {
        if (this.imageConstraints == null) {
            this.imageConstraints = new ArrayList<>();
        }
        this.imageConstraints.add(imageConstraint);
    }

}