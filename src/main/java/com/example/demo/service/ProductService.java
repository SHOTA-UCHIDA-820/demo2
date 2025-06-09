package com.example.demo.service;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // 商品保存
    public void saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
    }

    // 商品一覧取得
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }
}
