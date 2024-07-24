package org.example;

public class Sky extends Environment<Flyable>{

    @Override
    public void checkTraffic() {
        //Flyable type is in traffic list
        for(Flyable item: traffic){
            item.fly();
        }
    }


}
