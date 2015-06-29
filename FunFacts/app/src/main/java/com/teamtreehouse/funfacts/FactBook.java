package com.teamtreehouse.funfacts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 * Created by benjakuben on 7/31/14.
 */
public class FactBook {
    private static final String TAG = FactBook.class.getSimpleName();

    // Member variable (properties about the object)
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."};
    private String mFilename;

    // Method (abilities: things the object can do)
    public String getFact() {

        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random();  // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(99) + 1;

            try {
                FileReader fr = new FileReader("glaubensaetze.txt");
                BufferedReader br = new BufferedReader(fr);

                String zeile = "";

                while( (zeile = br.readLine()) != null )
                {
                    System.out.println(zeile);
                }

                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return fact;

    }
}
