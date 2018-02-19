package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int maxHeightJumps = k / j;
        int minHeightJumps = k % j;
        return maxHeightJumps + minHeightJumps;
    }
}
