package model.service;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filtroSoma(List<Product> list, Predicate<Product> criterios) {
        double sum = 0.0;
        for (Product p : list){
            if (criterios.test(p)){
                sum +=p.getPrice();
            }
        }
        return sum;
    }
}
