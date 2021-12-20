package com.tam.an.skyfly.model;

public class TransportCategories {
    int index;
    String transport;
 public TransportCategories(){

 }
    public TransportCategories(String transport) {
        this.transport = transport;
    }


    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }
}
