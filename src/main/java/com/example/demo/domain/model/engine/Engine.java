package com.example.demo.domain.model.engine;

import com.example.demo.domain.enum_type.EngineType;

import java.math.BigDecimal;

public class Engine {
    private Integer tork;
    private Integer horsePower;
    private Integer volume;
    private EngineType engineType;
    private double totalDuration;
    private BigDecimal price;

    public Engine() {
    }

    public Engine(Integer tork, Integer horsePower, Integer volume, EngineType engineType,
                  double totalDuration, BigDecimal price) {
        this.tork = tork;
        this.horsePower = horsePower;
        this.volume = volume;
        this.engineType = engineType;
        this.totalDuration = totalDuration;
        this.price = price;
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

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
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
