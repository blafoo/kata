package de.blafoo.kata.roman;
/*
 * Copyright (C) 2017 José Paumard
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by José
 * 
 * Quelle: https://github.com/JosePaumard/JosePaumard.github.io/blob/romannumerals-kata/src/test/java/org/paumard/katas/romannumerals/RomanNumeralsTest.java
 */
public class ArabicNumeralsTest {

    @Test
    public void should_return_1_for_I() {

        // Given
        String input = "I";
        int expectedOutput = 1;
        RomanNumerals romanNumerals = new RomanNumerals();

        // When
        int output = romanNumerals.from(input);

        // Then
        assertEquals(output, expectedOutput);
    }

    @Test
    public void should_return_2_for_II() {

        // Given
        String input = "II";
        int expectedOutput = 2;
        RomanNumerals romanNumerals = new RomanNumerals();

        // When
        int output = romanNumerals.from(input);

        // Then
        assertEquals(output, expectedOutput);
    }

    @Test
    public void should_return_3_for_III() {

        // Given
        String input = "III";
        int expectedOutput = 3;
        RomanNumerals romanNumerals = new RomanNumerals();

        // When
        int output = romanNumerals.from(input);

        // Then
        assertEquals(output, expectedOutput);
    }

    @Test
    public void should_return_5_for_V() {

        // Given
        String input = "V";
        int expectedOutput = 5;
        RomanNumerals romanNumerals = new RomanNumerals();

        // When
        int output = romanNumerals.from(input);

        // Then
        assertEquals(output, expectedOutput);
    }

    @Test
    public void should_return_12_for_XII() {

        // Given
        String input = "XII";
        int expectedOutput = 12;
        RomanNumerals romanNumerals = new RomanNumerals();

        // When
        int output = romanNumerals.from(input);

        // Then
        assertEquals(output, expectedOutput);
    }

    @Test
    public void should_return_62_for_LXII() {

        // Given
        String input = "LXII";
        int expectedOutput = 62;
        RomanNumerals romanNumerals = new RomanNumerals();

        // When
        int output = romanNumerals.from(input);

        // Then
        assertEquals(output, expectedOutput);
    }

    @Test
    public void should_return_135_for_CXXV() {

        // Given
        String input = "CXXXV";
        int expectedOutput = 135;
        RomanNumerals romanNumerals = new RomanNumerals();

        // When
        int output = romanNumerals.from(input);

        // Then
        assertEquals(output, expectedOutput);
    }

    @Test
    public void should_return_635_for_DCXXV() {

        // Given
        String input = "DCXXXV";
        int expectedOutput = 635;
        RomanNumerals romanNumerals = new RomanNumerals();

        // When
        int output = romanNumerals.from(input);

        // Then
        assertEquals(output, expectedOutput);
    }

    @Test
    public void should_return_1335_for_MCCCXXV() {

        // Given
        String input = "MCCCXXV";
        int expectedOutput = 1325;
        RomanNumerals romanNumerals = new RomanNumerals();

        // When
        int output = romanNumerals.from(input);

        // Then
        assertEquals(output, expectedOutput);
    }

    @Test
    public void should_return_4_for_IV() {

        // Given
        String input = "IV";
        int expectedOutput = 4;
        RomanNumerals romanNumerals = new RomanNumerals();

        // When
        int output = romanNumerals.from(input);

        // Then
        assertEquals(output, expectedOutput);
    }
}
