package com.example.jokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jokes {
    private static List<String> lame_jokes = new ArrayList<>();

    public static String tellJoke() {
        Random rand = new Random();
        int index = rand.nextInt(lame_jokes.size());
        return lame_jokes.get(index);
    }

    static {
        lame_jokes.add("Q: What do you call a bear with no teeth?\nA: A gummy bear");
        lame_jokes.add("Q: What do you call a fish with no eyes?\nA: a fsh");
        lame_jokes.add("Q: What do you call Halloween jokes? \nA: Punpkins");
        lame_jokes.add("Q: What do you call a thief alligator?\nA: Crookodile.");
    }
}
