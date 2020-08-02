package com.example.accelerometer;

public class Result_3 {

    private final int mNumber;


    public Result_3(float[][] probs) {
        mNumber = argmax(probs);
    }

    public int getNumber() {
        return mNumber;
    }



    private static int argmax(float[][] probs) {
        int maxIdx = -1;
        float maxProb = 0.0f;
        for (int i = 0; i < 3; i++) {
            if (probs[0][i] > maxProb) {
                maxProb = probs[0][i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}