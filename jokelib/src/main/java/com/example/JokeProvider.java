package com.example;

import java.util.Random;

public class JokeProvider {

    private static final String[] jokes = {
            "A SQL query goes into a bar, walks up to two tables and asks, 'Can I join you?'",
            "How many programmers does it take to change a light bulb ? None, that's a hardware problem",
            "You know that tingly little feeling you get when you like someone? That's your common sense leaving your body.",
            "In theory, there ought to be no difference between theory and practice. In practice, there is.",
            "Why did the programmer quit his job? Because he didn't get arrays.",
            "My wife and I were happy for twenty years. Then we met."
    };

    public static String getJoke(){
        int size = jokes.length;

        Random r = new Random();
        int index = r.nextInt(size);

        return jokes[index];
    }

}
