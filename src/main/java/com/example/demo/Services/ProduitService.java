package com.example.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Produit;
import com.example.demo.Repository.ProduitRespository;



@Service
public class ProduitService extends Abstarctservices<Produit> {
	@Autowired
	private ProduitRespository produitRepository;

	@Override
	public Iterable<Produit> findAll() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public Optional<Produit> findbyid(int id) {
		// TODO Auto-generated method stub
		return produitRepository.findById(id);
	}

	@Override
	public boolean Delete(int id) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(id);
		return true;
	}

	@Override
	public Produit update(Produit a) {
		// TODO Auto-generated method stub
		return produitRepository.save(a);
	}

	@Override
	public Produit create(Produit a) {
		// TODO Auto-generated method stub
		return produitRepository.save(a);
	}

}