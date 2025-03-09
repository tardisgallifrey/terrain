package com.tardisgallifrey.terraingen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//World class allows generation of terrain in
//random, 2D Perlin, and (later) 3D Perlin noise

public class World {

    //strictly random world generation
    public List<Point> genRandWorld(int worldSize){
        List<Point> world = new ArrayList<>();
        Random rand = new Random();

        //Randomly assign coordinates
        for(int i = 0 ; i < worldSize; i++) {
            for (int j = 0; j < worldSize; j++) {
                world.add(new Point(i, j, rand.nextInt(3) ));

            }
        }

        return world;
    }

    //generates a 2D world via perlin noise function
    public List<Point> gen2DWorld(int worldSize){
        List<Point> world2D = new ArrayList<>();
        PerlinNoise2D perlin = new PerlinNoise2D();

        //Random assign coordinates
        for(int i = 0 ; i < worldSize; i++) {
            for (int j = 0; j < worldSize; j++) {
                world2D.add(new Point(i, j, perlin.noise((double)i + 0.01, (double)j + 0.01) * 1000.0));

            }
        }

        return world2D;
    }

    //console print of 2D World
    //parameters:
    //      a world coordinate list of type Point
    //      a String to print (usually one character)
    //      color to use below Perlin 0 (background works best)
    //      color to use above Perlin 0 (color off)
    //
    //if msg == null, prints coordinates and height value
    public void printWorld(List<Point> world, String msg, String on_color, String off_color){
        String coord;

        //Print out coordinates
        System.out.println("These are the world coordinates.");
        for(Point p : world){
            int x = p.x();
            int y = p.y();

            if(msg != null){
                if(p.height() < 0){

                    coord = on_color+msg;
                }else{
                    coord = off_color+msg;
                }
            }else{
                coord = "("+x+","+y+","+p.height()+") ";
            }

            if(x == 0) {
                System.out.println(Color.RESET);
                System.out.print(coord);
            }else {
                System.out.print(coord);
            }

        }
    }
}
