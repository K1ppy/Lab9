package src.main.java.com.bsu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Ninja> konoha = new ArrayList<>();
        List<Ninja> some;
        konoha.add(new Ninja("Naruto","Uzumaki",100500,10.0));
        konoha.add(new Ninja("Saske","Uchiha",100499,9.0));
        konoha.add(new Ninja("Shikamaru","Nara",100000,9.0));
        konoha.add(new Ninja("Sakura","Haruno",90000,9.0));
        konoha.add(new Ninja("Tsunade","Sendzhu",99999,9.95));
        some = konoha.stream().filter(item->item.getPower() > 100000 && item.getPower() < 100501).collect(Collectors.toList());
        System.out.println(some);
        List<String> names;
        names = konoha.stream().map(Ninja::getName).collect(Collectors.toList());
        System.out.println(names);
        Map<String,Double> something;
        something = konoha.stream().collect(Collectors.toMap(Ninja::getName,Ninja::getRate));
        System.out.println(something);
        System.out.println(konoha.stream().map(Ninja::getPower).reduce(Integer::sum).toString());
        System.out.println(konoha.stream().filter(i-> Objects.equals(i.getName(), "Naruto")).findFirst());
        Map<Double,List<Ninja>> mapa = konoha.stream().collect(Collectors.groupingBy(Ninja::getRate));
        System.out.println(mapa);
    }
}
