package com.productservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productservice.model.Seller;
import com.productservice.repository.SellerRepository;
import com.productservice.util.PasswordUtil;


@Service
public class SellerLoginService {

	@Autowired
	private SellerRepository sellerRepo;
	
	@Autowired 
	PasswordUtil pwd_hash;
	
	public boolean isSellerRegistered(String email, String password)
	{
		Optional<Seller> seller = sellerRepo.findByEmailAndPassword(email, pwd_hash.hashPassword(password));
		return seller.isPresent();
	}

	public Seller findByemail(String email) {
		Seller seller=sellerRepo.findByEmail(email);
		return seller;
	}
	
	
}
