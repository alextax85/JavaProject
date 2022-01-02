package main;

public class Cat {
    private int catLength;
    private int catWeight;

    public Cat(int catLength, int catWeight) {
        this.catLength = catLength;
        this.catWeight = catWeight;
    }

    public int getCatLength() {
        return catLength;
    }

    public int getCatWeight() {
        return catWeight;
    }

    public void setCatLength(int catLength) {
        this.catLength = catLength;
    }

    public void setCatWeight(int catWeight) {
        this.catWeight = catWeight;
    }
}
