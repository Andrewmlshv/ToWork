package com.example.towork.services;

import com.example.towork.models.Achievement;
import com.example.towork.repositories.AchievementRepository;
import com.example.towork.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AchievementService {
    private final AchievementRepository achievementRepository;
    public boolean getAchievement() {
        return achievementRepository.findByName("First Achievement") != null;
    }
}
