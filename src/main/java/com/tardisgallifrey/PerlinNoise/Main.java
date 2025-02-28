package com.tardisgallifrey.PerlinNoise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Random Noise Class");

        Main.go();
    }

    private static void go() {
        int worldSize = 10;
        String bullet = "\u2022\t"; //prints bullet point
        World myWorld = new World();

        List<Point> world = myWorld.genWorld(worldSize);
        myWorld.printWorld(world, bullet);
    }
}