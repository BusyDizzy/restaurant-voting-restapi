package com.antontkatch.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "menu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Menu extends AbstractBaseEntity {

    @Column(name = "date_added", nullable = false, columnDefinition = "timestamp default now()", updatable = false)
    @NotNull
    private LocalDate date;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "menu")
    private List<Dish> dishes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    @NotNull
    private Restaurant restaurant;

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
}
