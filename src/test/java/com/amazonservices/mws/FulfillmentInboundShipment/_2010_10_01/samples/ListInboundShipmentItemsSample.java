/*******************************************************************************
 * Copyright 2009-2016 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * FBA Inbound Service MWS
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.samples;

import java.util.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.amazonservices.mws.client.*;
import com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.*;
import com.amazonservices.mws.FulfillmentInboundShipment._2010_10_01.model.*;


/** Sample call for ListInboundShipmentItems. */
public class ListInboundShipmentItemsSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static ListInboundShipmentItemsResponse invokeListInboundShipmentItems(
            FBAInboundServiceMWS client, 
            ListInboundShipmentItemsRequest request) {
        try {
            // Call the service.
            ListInboundShipmentItemsResponse response = client.listInboundShipmentItems(request);
            ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
            // We recommend logging every the request id and timestamp of every call.
            System.out.println("Response:");
            System.out.println("RequestId: "+rhmd.getRequestId());
            System.out.println("Timestamp: "+rhmd.getTimestamp());
            String responseXml = response.toXML();
            System.out.println(responseXml);
            return response;
        } catch (FBAInboundServiceMWSException ex) {
            // Exception properties are important for diagnostics.
            System.out.println("Service Exception:");
            ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
            if(rhmd != null) {
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
            }
            System.out.println("Message: "+ex.getMessage());
            System.out.println("StatusCode: "+ex.getStatusCode());
            System.out.println("ErrorCode: "+ex.getErrorCode());
            System.out.println("ErrorType: "+ex.getErrorType());
            throw ex;
        }
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        // Make sure you've set the variables in FBAInboundServiceMWSSampleConfig.
        FBAInboundServiceMWSClient client = FBAInboundServiceMWSSampleConfig.getClient();

        // Create a request.
        ListInboundShipmentItemsRequest request = new ListInboundShipmentItemsRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String marketplace = "example";
        request.setMarketplace(marketplace);
        String shipmentId = "example";
        request.setShipmentId(shipmentId);
        XMLGregorianCalendar lastUpdatedBefore = MwsUtl.getDTF().newXMLGregorianCalendar();
        request.setLastUpdatedBefore(lastUpdatedBefore);
        XMLGregorianCalendar lastUpdatedAfter = MwsUtl.getDTF().newXMLGregorianCalendar();
        request.setLastUpdatedAfter(lastUpdatedAfter);

        // Make the call.
        ListInboundShipmentItemsSample.invokeListInboundShipmentItems(client, request);

    }

}
