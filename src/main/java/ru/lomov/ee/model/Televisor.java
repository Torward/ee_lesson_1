package ru.lomov.ee.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Televisor {
    private String brand;
    private int diagonal;
    private List<Televisor>models;
    
}
