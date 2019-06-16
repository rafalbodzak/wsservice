package com.rbo.ws;

import javax.xml.ws.Endpoint;

/**
 * Created by rafal on 15.06.19.
 */
public class SOAPPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/wsservice/person", new PersonServiceImpl());
    }
}
