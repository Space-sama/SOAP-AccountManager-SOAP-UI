package com.samaspace.service;

import javax.xml.ws.Endpoint;
import static com.samaspace.service.ServiceComptesBancaire.initializeList;
public class ServerAccount {

	public static void main(String[] args) {
		String url="http://localhost:8686/";
        Endpoint.publish(url, new ServiceComptesBancaire(initializeList()));
        System.out.println("Sever Runing "+url);

	}

}
