package com.tardisgallifrey.PerlinNoise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Random Noise Class");

        Main.go();
    }

    private static List<Point> genWorld(int worldSize){
        List<Point> world = new ArrayList<>();

        //Random assign coordinates
        for(int i = 0 ; i < worldSize; i++) {
            for (int j = 0; j < worldSize; j++) {
                world.add(new Point(i, j, 1));

            }
        }

        return world;
    }

    private static void printWorld(List<Point> world){
        //Print out coordinates
        System.out.println("These are the world coordinates.");
        for(Point p : world){
            int x = p.x();
            int y = p.y();
            String coord = "("+x+","+y+","+p.height()+") ";
            if(x == 0) {
                System.out.println();
                System.out.print(coord);
            }else {
                System.out.print(coord);
            }
        }
    }

    private static void go() {
        int worldSize = 10;

        List<Point> world = genWorld(worldSize);
        printWorld(world);
    }
}