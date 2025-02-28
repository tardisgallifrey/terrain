package com.tardisgallifrey.PerlinNoise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {

    public List<Point> genWorld(int worldSize){
        List<Point> world = new ArrayList<>();
        Random rand = new Random();

        //Random assign coordinates
        for(int i = 0 ; i < worldSize; i++) {
            for (int j = 0; j < worldSize; j++) {
                world.add(new Point(i, j, rand.nextInt(3) ));

            }
        }

        return world;
    }

    public void printWorld(List<Point> world, String msg){
        String coord;

        //Print out coordinates
        System.out.println("These are the world coordinates.");
        for(Point p : world){
            int x = p.x();
            int y = p.y();

            if(msg != null){
                if(p.height() != 0){
                    coord = msg;
                }else{
                    coord = " \t";
                }
            }else{
                coord = "("+x+","+y+","+p.height()+") ";
            }

            if(x == 0) {
                System.out.println();
                System.out.print(coord);
            }else {
                System.out.print(coord);
            }
        }
    }
}
