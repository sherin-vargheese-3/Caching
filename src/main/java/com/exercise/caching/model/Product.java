package com.exercise.caching.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double basePrice;
    private double discount;

    public Double calculatePrice() {
        try {
            Thread.sleep(3000);      //Delay for 3 second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        double tax = basePrice * 0.1;   //10% tax added
        return (basePrice + tax) - discount;
    }
}
