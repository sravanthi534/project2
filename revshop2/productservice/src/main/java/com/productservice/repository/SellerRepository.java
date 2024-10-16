package com.productservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productservice.model.Seller;



public interface SellerRepository extends JpaRepository<Seller, Long>{
	
	Optional<Seller> findByEmailAndPassword(String email, String password);
	Seller findByEmail(String email);
}
