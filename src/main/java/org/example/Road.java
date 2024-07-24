package org.example;

public class Road extends Environment<Vehicle>{
    @Override
    public void checkTraffic() {
        System.out.println(this.getClass().getSimpleName() + " is flying!");
    }
}
