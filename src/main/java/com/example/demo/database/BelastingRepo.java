package com.example.demo.database;

import com.example.demo.models.entities.BelastingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BelastingRepo extends JpaRepository<BelastingEntity,Long> {
    boolean existsByUserIdAndBelastingJaarAndBelastingsoort(Long userId, int belastingJaar,String belastingsoort);

    List<BelastingEntity> findByUserId(Long userId);
}
