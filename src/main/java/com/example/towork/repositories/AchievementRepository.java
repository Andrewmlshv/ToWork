package com.example.towork.repositories;

import com.example.towork.models.Achievement;
import com.example.towork.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AchievementRepository extends JpaRepository<Achievement, Long> {
    Achievement findByName(String name);
}
