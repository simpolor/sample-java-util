package io.simpolor.sample;


import org.junit.jupiter.api.Test;

public class RandomGerneratorTest {

    @Test
    public void testGeneratorName(){

        // give, when
        String result = RandomGenerator.generateName();

        // then
        System.out.println(result);
    }

    @Test
    public void testGeneratorAge(){

        // give, when
        int result = RandomGenerator.generateAge();

        // then
        System.out.println(result);
    }

    @Test
    public void testGeneratorHobby(){

        // give, when
        String result = RandomGenerator.generateHobby();

        // then
        System.out.println(result);
    }
}
