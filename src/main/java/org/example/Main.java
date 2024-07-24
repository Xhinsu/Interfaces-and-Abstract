package org.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<Object> objects = List.of(
//                new Aeroplane(),
//                new Car(),
//                new Pigeon(),
//                new Duck(),
//                new Fish()
//        );
//
//        for (Object object : objects) {
//
//            if (object instanceof Swimmable swimmable) {
//                swimmable.swim();
//            }
//
//            if (object instanceof Flyable flyable) {
//                flyable.fly();
//            }
//
//            if (object instanceof Vehicle vehicle) {
//                vehicle.move();
//            }
//
//        }



        Sky sky = new Sky();
        sky.addTraffic(new Duck());
        sky.addTraffic(new Pigeon());
        sky.addTraffic(new Aeroplane());

        Water water = new Water();
        water.addTraffic(new Duck());
        water.addTraffic(new Fish());

        Road road = new Road();
        road.addTraffic(new Car());
        road.addTraffic(new Aeroplane());
//        road.addTraffic(new Lorry());

        //type Environment, environments is reference
        //Environment type object is being stored in list
        List<Environment<?>> environments = List.of(sky, water, road);

        for (Environment<?> environment: environments) {
            //i.e sky.checkTraffic() which loops through traffic<T>
//            environment.checkTraffic();
            environment.checkVehicles();
        }







    }
}