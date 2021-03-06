package com.market.server.service;

import com.market.server.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    // 중고 물품 등록
    void register(String id, ProductDTO productDTO);

    List<ProductDTO> getMyProducts(int accountId);

    void updateProducts(ProductDTO productDTO);

    void deleteProduct(int accountId, int productId);
}
