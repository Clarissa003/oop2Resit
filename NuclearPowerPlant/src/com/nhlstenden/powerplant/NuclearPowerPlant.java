package com.nhlstenden.powerplant;

import com.nhlstenden.controlroom.ControlRoom;

public class NuclearPowerPlant
{
    private Reactor reactor;
    private Generator generator;
    private CoolingSystem coolingSystem;
    private ControlRoom controlRoom;

    public NuclearPowerPlant()
    {
        this.reactor = null;
        this.generator = null;
        this.coolingSystem = null;
        this.controlRoom = null;
    }

    public Reactor getReactor() {
        return reactor;
    }

    public void setReactor(Reactor reactor) {
        this.reactor = reactor;
    }

    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    public CoolingSystem getCoolingSystem() {
        return coolingSystem;
    }

    public void setCoolingSystem(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    public ControlRoom getControlRoom() {
        return controlRoom;
    }

    public void setControlRoom(ControlRoom controlRoom) {
        this.controlRoom = controlRoom;
    }
}
