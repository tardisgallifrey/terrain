package com.tardisgallifrey.PerlinNoise;

//class adapted from ChatGPT

public class PerlinNoise2D {
    //private static final int[] p = new int[512];
    private static final int[] p = new int[512];

    static {
        for (int i = 0; i < 254; i++) {
            p[254 + i] = p[i] = Permutation.P[i];
        }
    }

    public double noise(double x, double y) {
        int X = (int) Math.floor(x) & 255;
        int Y = (int) Math.floor(y) & 255;
        x -= Math.floor(x);
        y -= Math.floor(y);

        double u = fade(x);
        double v = fade(y);

        int A = p[X] + Y, AA = p[A], AB = p[A + 1];
        int B = p[X + 1] + Y, BA = p[B], BB = p[B + 1];

        return lerp(v, lerp(u, grad(p[AA], x, y), grad(p[BA], x - 1, y)),
                lerp(u, grad(p[AB], x, y - 1), grad(p[BB], x - 1, y - 1)));
    }

    private static double fade(double t) {
        return t * t * t * (t * (t * 6 - 15) + 10);
    }

    private static double lerp(double t, double a, double b) {
        return a + t * (b - a);
    }

    private static double grad(int hash, double x, double y) {
        int h = hash & 7;
        double u = h < 4 ? x : y;
        double v = h < 4 ? y : x;
        return ((h & 1) == 0 ? u : -u) + ((h & 2) == 0 ? v : -v);
    }

    /*
        How to use
        public static void main(String[] args) {
            System.out.println(noise(0.5, 0.5));
        }
     */
}

