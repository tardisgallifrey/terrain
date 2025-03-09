package com.tardisgallifrey.terraingen;

//ANSI color codes class copied from source on StackOverflow
//Used to create printout of 2D World

public class Color {

    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_B = "\033[1;30m";  // BLACK
    public static final String RED_B = "\033[1;31m";    // RED
    public static final String GREEN_B = "\033[1;32m";  // GREEN
    public static final String YELLOW_B = "\033[1;33m"; // YELLOW
    public static final String BLUE_B = "\033[1;34m";   // BLUE
    public static final String PURPLE_B = "\033[1;35m"; // PURPLE
    public static final String CYAN_B = "\033[1;36m";   // CYAN
    public static final String WHITE_B = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UL = "\033[4;30m";  // BLACK
    public static final String RED_UL = "\033[4;31m";    // RED
    public static final String GREEN_UL = "\033[4;32m";  // GREEN
    public static final String YELLOW_UL = "\033[4;33m"; // YELLOW
    public static final String BLUE_UL = "\033[4;34m";   // BLUE
    public static final String PURPLE_UL = "\033[4;35m"; // PURPLE
    public static final String CYAN_UL = "\033[4;36m";   // CYAN
    public static final String WHITE_UL = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BG = "\033[40m";  // BLACK
    public static final String RED_BG = "\033[41m";    // RED
    public static final String GREEN_BG = "\033[42m";  // GREEN
    public static final String YELLOW_BG = "\033[43m"; // YELLOW
    public static final String BLUE_BG = "\033[44m";   // BLUE
    public static final String PURPLE_BG = "\033[45m"; // PURPLE
    public static final String CYAN_BG = "\033[46m";   // CYAN
    public static final String WHITE_BG = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BR = "\033[0;90m";  // BLACK
    public static final String RED_BR = "\033[0;91m";    // RED
    public static final String GREEN_BR = "\033[0;92m";  // GREEN
    public static final String YELLOW_BR = "\033[0;93m"; // YELLOW
    public static final String BLUE_BR = "\033[0;94m";   // BLUE
    public static final String PURPLE_BR = "\033[0;95m"; // PURPLE
    public static final String CYAN_BR = "\033[0;96m";   // CYAN
    public static final String WHITE_BR = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_B_BR = "\033[1;90m"; // BLACK
    public static final String RED_B_BR = "\033[1;91m";   // RED
    public static final String GREEN_B_BR = "\033[1;92m"; // GREEN
    public static final String YELLOW_B_BR = "\033[1;93m";// YELLOW
    public static final String BLUE_B_BR = "\033[1;94m";  // BLUE
    public static final String PURPLE_B_BR = "\033[1;95m";// PURPLE
    public static final String CYAN_B_BR = "\033[1;96m";  // CYAN
    public static final String WHITE_B_BR = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BG_BR = "\033[0;100m";// BLACK
    public static final String RED_BG_BR = "\033[0;101m";// RED
    public static final String GREEN_BG_BR = "\033[0;102m";// GREEN
    public static final String YELLOW_BG_BR = "\033[0;103m";// YELLOW
    public static final String BLUE_BG_BR = "\033[0;104m";// BLUE
    public static final String PURPLE_BG_BR = "\033[0;105m"; // PURPLE
    public static final String CYAN_BG_BR = "\033[0;106m";  // CYAN
    public static final String WHITE_BG_BR = "\033[0;107m";   // WHITE
}
