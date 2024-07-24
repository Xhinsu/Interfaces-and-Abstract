package org.example;

public class Road extends Environment<Drive>{
    @Override
    public void checkTraffic() {
        for(Drive item: traffic){
            item.drive();
        };
    }
}
