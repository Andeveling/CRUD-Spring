package com.example.CRUD.repository;

import com.example.CRUD.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {}
