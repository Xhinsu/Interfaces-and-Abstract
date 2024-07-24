package org.example;

public class Water extends Environment<Swimmable>{
    @Override
    public void checkTraffic() {
        for(Swimmable item: traffic){
            item.swim();
        }

    }
}
