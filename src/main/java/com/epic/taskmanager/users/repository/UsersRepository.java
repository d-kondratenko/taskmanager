package com.epic.taskmanager.users.repository;

import com.epic.taskmanager.users.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findByUserNr(String userNr);

    Users findById(int userId);

    Users findByActivationCode(String activationCode);

    @Query("select userId from Users where userNr = ?1")
    int getUserId(String userNr);

    @Query("select (count(u) > 0) from Users u where u.userNr = ?1")
    boolean existByUserNr(String userNr);

    @Query("select (count(u) > 0) from Users u where u.email = ?1")
    boolean existByEmail(String email);


}