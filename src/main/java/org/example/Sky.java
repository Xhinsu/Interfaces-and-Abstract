package org.example;

public class Sky extends Environment<Flyable>{

    @Override
    public void checkTraffic() {
        for(Flyable item: traffic){
            item.fly();
        }
    }


}
