package com.example.demo.domain.model.engine;

import com.example.demo.domain.enumType.EngineType;

import java.math.BigDecimal;
import java.util.UUID;

public class Engine {
    private UUID engineId;
    private Integer tork;
    private Integer horsePower;
    private Integer volume;

    private EngineType engineType;

    public UUID getEngineId() {
        return engineId;
    }

    public void setEngineId(UUID engineId) {
        this.engineId = engineId;
    }

    public Integer getTork() {
        return tork;
    }

    public void setTork(Integer tork) {
        this.tork = tork;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
