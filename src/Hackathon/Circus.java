package Hackathon;

public class Circus implements Comparable<Circus>{
    int height;
    int weight;

    Circus(int h,int w){
        this.height=h;
        this.weight=w;
    }
    @Override
    public int compareTo(Circus circus) {
        return this.weight-circus.weight;
    }
}
