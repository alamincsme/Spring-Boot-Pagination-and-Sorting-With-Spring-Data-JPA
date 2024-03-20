package io.alamincsme.service;

import io.alamincsme.model.Product;
import io.alamincsme.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository ;

//    @PostConstruct
//    public void initDB() {
//        List<Product> products = IntStream.rangeClosed(1, 200)
//                .mapToObj(i -> new Product("product" + i, new Random().nextInt(100), new Random().nextInt(50000)))
//                .collect(Collectors.toList());
//        repository.saveAll(products);
//    }
    @Override
    public List<Product> findAllProducts() {
        return null;
    }

//    @Override
//    public List<Product> findProductsWithSorting(String field) {
//        return null;
//    }
//
//    @Override
//    public Page<Product> findProductsWithPagination(int offset, int pageSize) {
//        return null;
//    }
//
//    @Override
//    public Page<Product> findProductsWithPaginationAndSorting(int offset, int pageSize, String field) {
//        return null;
//    }
}
