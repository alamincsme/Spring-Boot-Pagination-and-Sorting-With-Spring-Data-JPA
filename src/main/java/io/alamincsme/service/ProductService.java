package io.alamincsme.service;

import io.alamincsme.model.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    public List<Product> findAllProducts();
//    public List<Product> findProductsWithSorting(String field);
//    public Page<Product> findProductsWithPagination(int offset, int pageSize);
//    public Page<Product> findProductsWithPaginationAndSorting(int offset,int pageSize,String field);
}
