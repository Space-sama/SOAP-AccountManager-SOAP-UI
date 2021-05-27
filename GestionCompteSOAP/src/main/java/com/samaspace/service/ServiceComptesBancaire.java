package com.samaspace.service;


import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(name = "ServiceBanque")
public class ServiceComptesBancaire {

	public List<Compte> Comptes;
   
	
	protected ServiceComptesBancaire(List<Compte> list)  {
        super();
        this.Comptes = list;
    }
	
	
	public ServiceComptesBancaire() {
    }


	public static List<Compte> initializeList() {
        List<Compte> list  = new ArrayList<Compte>();

        list.add(new Compte("A111",10000));
        list.add(new Compte("B222",150000));
        list.add(new Compte("C222",1500));
        list.add(new Compte("D222",20000));
        return list;
    }
	
	@WebMethod(operationName = "findCompte")
    public int findCompte(@WebParam(name = "NumClient") String NumClient){

        for(Compte c : initializeList()) {
            if ( c.getNumero().equals(NumClient))
            {
                return  initializeList().indexOf(c);

            }
        }

        // write Contact object only with num when name is not found
        return -1;

    }

	
	@WebMethod(operationName = "allAccounts")
	public List<Compte> allComptes() {
		
		return this.initializeList();
	}

	
	@WebMethod(operationName = "setOneAccount")
	public void setAccount(@WebParam(name = "index") int index, Compte c) {
		
		initializeList().set(index, c);
	}

	
	
}
