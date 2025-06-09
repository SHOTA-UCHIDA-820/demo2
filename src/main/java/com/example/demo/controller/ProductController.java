package com.example.demo.controller;

import com.example.demo.entity.ProductEntity;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid; 
import java.util.List;


@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    // 商品登録処理
    @PostMapping("/product/create")
    public String createProduct(@Valid @ModelAttribute ProductEntity productEntity, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            // エラーがあればフォームを再表示
            model.addAttribute("productEntity", productEntity); // フォームに入力されたデータを保持
            return "productCreate"; // エラーメッセージを表示するために同じフォームを再表示
        }

        productService.saveProduct(productEntity);
        return "redirect:/product/get"; // 商品一覧画面へリダイレクト
    }

    // 商品登録フォーム表示
    @GetMapping("/product/create")
    public String showProductForm(Model model) {
        model.addAttribute("productEntity", new ProductEntity()); // 新しい商品エンティティをモデルに追加
        return "productCreate"; // 商品登録フォームを表示
    }

    // 商品一覧表示
    @GetMapping("/product/get")
    public String getAllProducts(Model model) {
        List<ProductEntity> products = productService.getAllProducts(); // サービス層で全商品を取得
        model.addAttribute("products", products);
        return "productlist"; // 商品一覧画面
    }
}


