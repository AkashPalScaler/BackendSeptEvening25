package Generics;

import AdderSubtractor.Adder;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair.something("Akash");
        Pair.something(10);
        Pair.something(10.0);


        Pair.<String, Integer>some();
        Pair.someOther(20, 10);
//        Pair<Integer, Integer> p = new Pair<>();
//        p.setFirst(10);
//        p.setSecond(20);
//
//        Pair<String, Integer> p1 = new Pair<>("Akash", 10);
//
//        Pair p3 = new Pair(); // Backward compatibility
//        Pair<Object, Object> p4 = new Pair<>();
//
//        p3.setFirst(new Object());
//        p3.setSecond("StringTest");
//
//        List list = new ArrayList<>();
//        List<Object> list1 = new ArrayList<>();
          List<Dog> dogs = new ArrayList<>();
          dogs.add(new Dog());
          List<Cat> cats = new ArrayList<>();
          cats.add(new Cat());
          List<Animal> animals = new ArrayList<>();
          animals.add(new Animal());
//          somefun(dogs); //Doesn't work
//          somefun(cats); // Doesn't work
          somefun(animals);

//          animals = dogs;
//          animals = cats;

        // PECS principle -> Producer extends, Consumer supers
          // Upper bound generics
          List<? extends Animal> extendedAnimals = new ArrayList<>();
          extendedAnimals = dogs; // any arrayList of type which is Animal or extends Animal
//          extendedAnimals = cats;
          Animal a = extendedAnimals.get(0);
          Object o = extendedAnimals.get(0);

//          extendedAnimals.add(new Animal());
//          extendedAnimals.add(new Dog());
//          extendedAnimals.add(new Object());



          printAllAnimalNames(dogs);
          printAllAnimalNames(cats);
          printAllAnimalNames(animals);


          // Lower bound generic
          List<? super Dog> superDogs= new ArrayList<>();
          superDogs = dogs; // any arrayList of type which is Dog or parent/superclass of Dog
          superDogs = animals;
          superDogs = new ArrayList<Object>();

          superDogs.add(new Dog());
//          superDogs.add(new Animal());
//          Dog d1 = superDogs.get(0);
//          Animal a1 = superDogs.get(0);
          Object o3 = superDogs.get(0);

          addDogToList(new Dog(), animals);
          addDogToList(new Dog(), dogs);
//          addDogToList(new Dog(), mammals); // animals -> mammals -> dogs

        //wildcard
         List<?> someList = dogs;
         someList = cats;
         someList = animals;

         // can't add, can't read (except for object)
        Object o2 = someList.get(0);

//        List<?> list= someList.get(0);

        PairP<Integer> p = new PairP<>();
        p.setVar1(10);

    }

    static void somefun(List<Animal> animals){
        animals.add(new Dog());
        animals.add(new Cat());
    }

    static void printAllAnimalNames(List<? extends Animal> animals){
        for(Animal a : animals){
            a.makeNoise();
            System.out.println(a.name);
        }
    }

    static void addDogToList(Dog d, List<? super Dog> superdogs){
        superdogs.add(d);
    }
}

