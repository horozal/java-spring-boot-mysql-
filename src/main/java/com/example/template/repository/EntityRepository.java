package com.example.template.repository;

import com.example.template.model.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepository extends JpaRepository<SampleEntity, Long> {
    // Additional custom queries can be added here
}

