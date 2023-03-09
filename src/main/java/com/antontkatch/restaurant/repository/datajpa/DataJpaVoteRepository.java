package com.antontkatch.restaurant.repository.datajpa;

import com.antontkatch.restaurant.model.Vote;
import com.antontkatch.restaurant.repository.VoteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaVoteRepository implements VoteRepository {

    private final CrudVoteRepository crudVoteRepository;

    private final CrudRestaurantRepository crudRestaurantRepository;

    private final CrudUserRepository crudUserRepository;

    public DataJpaVoteRepository(CrudVoteRepository crudVoteRepository,
                                 CrudRestaurantRepository crudRestaurantRepository,
                                 CrudUserRepository crudUserRepository) {
        this.crudVoteRepository = crudVoteRepository;
        this.crudRestaurantRepository = crudRestaurantRepository;
        this.crudUserRepository = crudUserRepository;
    }

    @Override
    public Vote get(int id, int userId, int restaurantId) {
        return null;
    }

    @Override
    public boolean delete(int id, int userId, int restaurantId) {
        return false;
    }

    @Override
    public Vote save(Vote vote, int userId, int restaurantId) {
        return null;
    }

    @Override
    public List<Vote> getAllUserVotes(int userId) {
        return null;
    }

    @Override
    public List<Vote> getAllRestaurantVotes(int restaurantId) {
        return null;
    }
}
