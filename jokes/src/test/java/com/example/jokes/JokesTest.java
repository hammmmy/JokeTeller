package com.example.jokes;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class JokesTest {
    @Test
    public void testJokeNotEmpty() {
        assertThat(Jokes.tellJoke().isEmpty(), is(false));
    }
}
