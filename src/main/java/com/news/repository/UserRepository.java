package com.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.news.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
