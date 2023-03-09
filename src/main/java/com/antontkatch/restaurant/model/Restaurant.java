package com.antontkatch.restaurant.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "restaurant", uniqueConstraints = {@UniqueConstraint(columnNames = {"address"}, name = "restaurant_unique_address_idx")})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant extends AbstractNamedEntity {

    @Column(name = "address", nullable = false, unique = true)
    @NotBlank
    @Size(max = 128)
    private String address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurant")
    @OrderBy("date DESC")
    private List<Menu> menus;

    @Override
    public String toString() {
        return "Restaurant{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
