package com.designpatterns.builder.components;

public class CarEngine {
    private String pistonsType; // flat and dome
    private String crankshaft; //  monolithic and assembled type
    private String camshaft; // flat  or roller

    public CarEngine(String pistonsType, String crankshaft, String camshaft) {
        this.pistonsType = pistonsType;
        this.crankshaft = crankshaft;
        this.camshaft = camshaft;
    }

    @Override
    public String toString() {
        return "CarEngine{" +
                "pistonsType='" + pistonsType + '\'' +
                ", crankshaft='" + crankshaft + '\'' +
                ", camshaft='" + camshaft + '\'' +
                '}';
    }
}
