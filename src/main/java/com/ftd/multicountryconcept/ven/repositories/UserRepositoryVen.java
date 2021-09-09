package com.ftd.multicountryconcept.ven.repositories;

import com.ftd.multicountryconcept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryVen extends JpaRepository<User, Integer> {
}
