package org.example.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")     // по умолчанию Bean - синглтон
@Primary
@PropertySource(value = "classpath:application.properties" , encoding = "UTF-8")
public class Manul implements Cat{

    @Value("${manul.name}")             // свойства бина указаны через properties файл
    private String name ;
    @Value("${manul.weight}")
    private int weight;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init(){
        System.out.println("Манул пришел");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Манул ушел");
    }
}
