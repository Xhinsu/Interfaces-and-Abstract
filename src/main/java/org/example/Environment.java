package org.example;
import java.util.ArrayList;
import java.util.List;

public abstract class Environment<T> {

    protected List<T> traffic = new ArrayList<>();




    public abstract void checkTraffic();
//when subclass use this method, it adds new obj to traffic
    public void addTraffic(T traffic) {

        this.traffic.add(traffic);
    }


    public void checkVehicles(){
//        System.out.println(traffic.getClass().getSimpleName());
//        if(traffic  instanceof Road){
//            System.out.println("sky");
//
//        }
//    }
        for (T t : traffic) {
            if(t.getClass().getSuperclass().getSimpleName().equals("Vehicle")){
                    if(t.getClass().getSimpleName().equals("Aeroplane")){
                        System.out.println(t.getClass().getSimpleName() + " is flying");

                    }else{
                        System.out.println(t.getClass().getSimpleName() + " is driving");

                    }
            }

//
//
//            if(Environment<T> instanceof Sky){
//                System.out.println(t.getClass().getSimpleName() + " is flying");
//
//            }
//            else if(t instanceof Water){
//                System.out.println(t.getClass().getSimpleName() + " is swimming");
//            }

    }}}
