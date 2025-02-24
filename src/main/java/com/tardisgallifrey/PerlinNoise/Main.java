package com.tardisgallifrey.PerlinNoise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Perlin Noise Class");

        Main.go();
    }

    private static void go() {

        int[] P = {194, 173, 140, 149, 1, 24, 195, 158,
                51, 183, 243, 198, 210, 74, 81, 39, 21,
                175, 135, 207, 210, 138, 39, 53, 250,
                185, 117, 123, 162, 185, 124, 62, 214,
                203, 144, 215, 238, 55, 54, 240, 91, 0,
                124, 53, 158, 174, 50, 98, 245, 171,
                178, 29, 52, 83, 53, 16, 100, 204, 171,
                162, 188, 95, 163, 5, 243, 211, 221,
                78, 96, 125, 253, 129, 40, 49, 237,
                31, 207, 135, 120, 199, 11, 171, 223,
                221, 74, 235, 113, 74, 59, 166, 50,
                25, 80, 157, 88, 134, 171, 177, 226,
                201, 127, 100, 4, 236, 164, 250, 116,
                193, 15, 22, 243, 36, 155, 52, 45,
                219, 193, 125, 71, 248, 157, 198, 88,
                35, 197, 245, 209, 23, 12, 230, 28,
                89, 15, 157, 109, 31, 7, 2, 232, 76,
                227, 144, 1, 217, 46, 213, 241, 169,
                238, 242, 75, 41, 29, 161, 25, 108,
                61, 107, 208, 114, 211, 221, 23, 5,
                241, 36, 177, 239, 23, 27, 192, 88,
                59, 214, 199, 254, 233, 234, 41, 142,
                107, 40, 83, 246, 13, 117, 250, 7,
                128, 136, 99, 182, 150, 223, 77, 166,
                126, 86, 202, 252, 243, 6, 103, 197,
                210, 134, 11, 9, 129, 38, 196, 146,
                69, 202, 201, 119, 93, 61, 105, 241,
                130, 94, 231, 14, 235, 9, 135, 11, 5,
                118, 49, 249, 139, 103, 172, 54, 222,
                194, 116, 187, 189, 170, 171, 11, 95,
                61, 106, 195, 56, 128, 73, 91, 49, 209};
        List<Point> world = new ArrayList<>();
        int worldSize = 10;

        //Random assign coordinates
        for(int i = 0 ; i < worldSize; i++) {
            for (int j = 0; j < worldSize; j++) {
                world.add(new Point(i, j, 1));

            }
        }

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
}