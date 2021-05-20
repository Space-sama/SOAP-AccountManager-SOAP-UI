package com.samaspace.service;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.samaspace.metier.Compte;


@WebService
public class ServiceComptesBancaire implements ICompteBancaire {

    public static List<Compte> listeAccounts(){
    	List<Compte> list  = new ArrayList<Compte>();
    	Compte c = new Compte("KIU87FR", 890);
    	Compte c1 = new Compte("LOkç78H", 8780);
    	Compte c2 = new Compte("123K", 1890);
    	Compte c3 = new Compte("àà#hg", 2000);
    	list.add(c1);
    	list.add(c2);
    	list.add(c3);
    	list.add(c);
    	return list;
    	
    }
	
	@Override
	@WebMethod(operationName = "findOneAccount")
	public int findCompte(@WebParam(name = "matricule")String num) {
		List<Compte> cc = new ArrayList<Compte>();
		for(Compte c : listeAccounts()) {
            if ( c.getNumero().equals(num));
            {
                return  cc.indexOf(c);
            }
	}
		 return -1;
		 }
	

	@Override
	@WebMethod(operationName = "allAccounts")
	public List<Compte> allComptes() {
		
		return listeAccounts();
	}

	@Override
	@WebMethod(operationName = "setOneAccount")
	public Compte set(@WebParam(name = "index") int index, Compte c) {
		//this.Comptes.set(index,c);
		Compte cc = new Compte();
		
		cc = this.listeAccounts().set(index, c);
		return cc;
	}

	
	
}
