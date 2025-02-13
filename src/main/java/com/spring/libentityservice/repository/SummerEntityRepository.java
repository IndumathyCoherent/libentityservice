package com.spring.libentityservice.repository;


import com.spring.libentityservice.entity.SummerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SummerEntityRepository extends JpaRepository<SummerEntity,Integer> {
}
