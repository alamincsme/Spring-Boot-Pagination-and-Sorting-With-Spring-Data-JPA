package io.alamincsme.controller;

import io.alamincsme.model.Product;
import io.alamincsme.payload.APIResponse;
import io.alamincsme.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service ;

    @GetMapping("/products")
    public APIResponse<List<Product>> getProducts () {
        List<Product> products = service.findAllProducts();
        return new APIResponse<>(products.size() , products);
    }

    @GetMapping("/{field}")
    public APIResponse<List<Product>> findProductsWithSorting (@PathVariable String field) {
        List<Product> products = service.findProductsWithSorting(field);
        return new APIResponse<>(products.size() , products);
    }


    @GetMapping("/pagination/{offset}/{pageSize}")
    public APIResponse<Page<Product>> findProductsWithPagination (@PathVariable int offset, @PathVariable int pageSize) {
        var productsWithPagination = service.findProductsWithPagination(offset, pageSize);
        return new APIResponse<>(productsWithPagination.getSize(), productsWithPagination);
    }

    @GetMapping("/paginationAndSort/{offset}/{pageSize}/{field}")
    public APIResponse<Page<Product>> findProductsWithPaginationAndSorting (@PathVariable int offset, @PathVariable int pageSize, @PathVariable String field) {
        var productsWithPaginationAndSorting = service.findProductsWithPaginationAndSorting(offset, pageSize, field);
        return new APIResponse<>(productsWithPaginationAndSorting.getSize(), productsWithPaginationAndSorting);
    }

}
