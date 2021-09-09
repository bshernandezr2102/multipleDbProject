package com.ftd.multicountryconcept.col.repositories;

import com.ftd.multicountryconcept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryCol extends JpaRepository<User, Integer> {
}
