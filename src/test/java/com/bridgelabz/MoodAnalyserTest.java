package com.bridgelabz;

import com.sun.source.tree.NewArrayTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a sad message");
        System.out.println(mood);
        Assertions.assertEquals("SAD", mood);
    }
}
