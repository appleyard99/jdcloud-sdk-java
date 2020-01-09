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

import com.jdcloud.sdk.service.jdccs.model.Ticket;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询工单详情
 */
public class DescribeTicketResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工单详情
     */
    private Ticket ticket;


    /**
     * get 工单详情
     *
     * @return
     */
    public Ticket getTicket() {
        return ticket;
    }

    /**
     * set 工单详情
     *
     * @param ticket
     */
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }


    /**
     * set 工单详情
     *
     * @param ticket
     */
    public DescribeTicketResult ticket(Ticket ticket) {
        this.ticket = ticket;
        return this;
    }


}