package org.example.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Sphynx implements Cat{
    private String name = "Рамзес";
    private int weight=2;

    @Override
    public String toString() {
        return "Sphynx{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }


public void init(){
    System.out.println("Сфинкс пришел");
}

public void destroy(){
    System.out.println("Сфинкс ушел");
}

}
