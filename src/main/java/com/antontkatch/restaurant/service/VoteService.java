package com.antontkatch.restaurant.service;

import com.antontkatch.restaurant.repository.VoteRepository;
import org.springframework.stereotype.Service;

@Service
public class VoteService {

    private final VoteRepository repository;

    public VoteService(VoteRepository repository) {
        this.repository = repository;
    }
}
