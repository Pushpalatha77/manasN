package com.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.news.entity.Advertiser;

@Repository
public interface AdvertiserRepository extends JpaRepository<Advertiser, Long>{

}
