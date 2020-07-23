package main;

import java.util.Random;

public class Box {
    private Integer value;
    public Box () {}
    public Box (Integer value) { setValue(value); }
    public Box (boolean random) {if (random) setValue(new Random().nextInt(1001));}
    public Integer  getValue() { return value; }
    public void setValue(Integer value) { this.value = value; }
}
