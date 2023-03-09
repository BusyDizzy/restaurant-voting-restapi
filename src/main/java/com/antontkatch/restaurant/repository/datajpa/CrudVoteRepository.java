package com.antontkatch.restaurant.repository.datajpa;

import com.antontkatch.restaurant.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface CrudVoteRepository extends JpaRepository<Vote, Integer> {
}
