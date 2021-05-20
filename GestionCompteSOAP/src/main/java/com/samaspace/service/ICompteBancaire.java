package com.samaspace.service;

import java.util.List;

import com.samaspace.metier.Compte;

public interface ICompteBancaire {

	int findCompte(String num);
    List<Compte> allComptes();
    Compte set(int index, Compte c);
}
