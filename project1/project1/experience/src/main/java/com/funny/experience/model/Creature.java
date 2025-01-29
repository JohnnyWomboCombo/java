package com.funny.experience.model;

import com.funny.experience.enums.HealthStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Creature {

    @Id
    private UUID creatureId;

    private String name;
    private Integer age;
    private String description;
    private HealthStatus healthStatus;

    public Creature() {
    }

    public Creature(String name, Integer age, String description, HealthStatus healthStatus) {
        this.name = name;
        this.age = age;
        this.description = description;
        this.healthStatus = healthStatus;
        this.creatureId = UUID.randomUUID();
    }

    public UUID getCreatureId() {
        return creatureId;
    }

    public void setCreatureId(UUID creatureId) {
        this.creatureId = creatureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }
}
