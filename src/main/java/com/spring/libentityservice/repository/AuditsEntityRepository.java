package com.spring.libentityservice.repository;


import com.spring.libentityservice.entity.AuditsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditsEntityRepository extends JpaRepository<AuditsEntity, Long> {

}
