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
 * Ticket API
 * 云托管服务的工单API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdccs.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询工单详情
 */
public class DescribeTicketRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工单编号
     * Required:true
     */
    @Required
    private String ticketNo;


    /**
     * get 工单编号
     *
     * @return
     */
    public String getTicketNo() {
        return ticketNo;
    }

    /**
     * set 工单编号
     *
     * @param ticketNo
     */
    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }


    /**
     * set 工单编号
     *
     * @param ticketNo
     */
    public DescribeTicketRequest ticketNo(String ticketNo) {
        this.ticketNo = ticketNo;
        return this;
    }


}