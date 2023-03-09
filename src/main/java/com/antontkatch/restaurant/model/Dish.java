package com.antontkatch.restaurant.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "dish")
@Getter
@Setter
public class Dish extends AbstractNamedEntity {

    @Column(name = "price", nullable = false)
    @Range(min = 0, max = 10000)
    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id", nullable = false)
    @NotNull
    private Menu menu;

    public Dish() {
    }

    public Dish(String dishName, double price) {
        this(null, dishName, price);
    }

    public Dish(Integer id, String name, double price) {
        super(id, name);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
