package com.example.demo.domain.model.engine;

import java.math.BigDecimal;
import java.util.UUID;

public class Engine {
    private UUID engineId;
    private Integer tork;
    private Integer horsePower;
    private Integer volume;
    private double totalDuration;
    private BigDecimal price;

    public Engine() {
    }

    public Engine(UUID engineId, Integer tork, Integer horsePower, Integer volume, double totalDuration,
                  BigDecimal price) {
        this.engineId = engineId;
        this.tork = tork;
        this.horsePower = horsePower;
        this.volume = volume;
        this.totalDuration = totalDuration;
        this.price = price;
    }

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

    public double getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(double totalDuration) {
        this.totalDuration = totalDuration;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
