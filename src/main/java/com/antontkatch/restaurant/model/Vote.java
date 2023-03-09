package com.antontkatch.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "vote", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "restaurant_id", "vote_date"}, name = "vote_unique_user_date_restaurant_idx")})
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Vote extends AbstractBaseEntity {

    @Column(name = "vote_date", nullable = false)
    @NotNull
    private LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    @NotNull
    private Restaurant restaurant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @NotNull
    private User user;

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                "date=" + date +
//                ", restaurant=" + restaurant +
//                ", user=" + user +
                '}';
    }
}
