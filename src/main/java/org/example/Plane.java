package org.example;

public class Plane extends Transport {
    public Plane(String name, int capacity, int speed, double costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    @Override
    float getPrice(City city) {
        float stoimost;
        if (city.isHasAirport()) {return stoimost= (float) (getCostOfKm()* city.getDistance());}
        else{return 0;}
    }


    @Override
    public void startRepair() {
        System.out.println("Самолёт на ремонте");
    }

    @Override
    public void finishRepair() {
        System.out.println("Самолёт доступен");
    }

    @Override
    public boolean isRepairing() {
        return true;
    }
}
