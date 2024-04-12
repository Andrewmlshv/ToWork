package com.example.towork.models;

import com.example.towork.services.AchievementService;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "achievement")
public class Achievement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String name;

    @Column(name = "description", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String description;

    @Column(name = "picture", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String picture;

    @OneToMany(mappedBy = "idAchievements")
    private Set<Userwithachievement> userwithachievements = new LinkedHashSet<>();

}