package ru.lomov.ee.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    private int id =0;
    private String title;
    private int cost;
    private List<Product>children;


}
