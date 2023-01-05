package org.example;


import org.example.config.SpringConfig;
import org.example.model.Manul;
import org.example.model.Place;
import org.example.model.Sphynx;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("Hello Spring!");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        /*Logistics logistics = context.getBean(Logistics.class);
        TransportFactory transportFactory = context.getBean(TransportFactory.class);

        System.out.println(transportFactory);
        System.out.println(logistics);*/

        /*Manul murka = context.getBean(Manul.class);
       Manul murzik= context.getBean(Manul.class);
        Sphynx ramzes= context.getBean(Sphynx.class);

        System.out.println(murzik);
        System.out.println(ramzes);
        System.out.println(murka);

        murka.setName("Мурка");
        System.out.println(murzik.getName());
        System.out.println(murka.getName());
        System.out.println(murzik==murka);*/

       Place place = context.getBean(Place.class);
        System.out.println(place.getCat1());
        System.out.println(place.getCat2());
    }
}
