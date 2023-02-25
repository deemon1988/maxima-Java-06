package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Place {

  /* @Autowired private Manul cat1;       // внедрение через св-во (самый худший, самый медленный, работает через рефлексию (Reflection API)
     @Autowired private  Sphynx cat2;     // с точки зрения развертывания ненужного кода, можно @Autowired только свойство

    public Sphynx getCat2() {
        return cat2;
    }

    public Manul getCat1() {
        return cat1;
    }*/

   /* @Autowired                          // внедрение через Сеттер  (самый неочевидный способ)
    public void setCat(Manul cat) {
        this.cat = cat;
    }*/

    public Place() {                       // у Бина должен быть коннструктор по умолчанию
    }

    /*    @Autowired                       //  внедрение через конструктор (самый быстрый способ)
       public Place(Manul cat) {           //  если конструктор не единственный нужно указывать @Autowired
           this.cat = cat;
       }*/
    @Autowired
    private Cat cat1;
    @Autowired
    @Qualifier("hairless")                   // не приоритетный Бин, явное указание
    private Cat cat2;

    public Cat getCat2() {
        return cat2;
    }

    public Cat getCat1() {
        return cat1;
    }
}
