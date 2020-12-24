package com.illiteratesardine.adventofcode2020

import org.springframework.core.io.ClassPathResource

class Day1 {

    Integer calculatePart1(String fileName) {
        List<Integer> input = new ClassPathResource(fileName).inputStream.readLines()*.toInteger()
        Integer val1 = 0, val2 = 0
        input.each {Integer outerValue ->
            input.each {Integer innerValue ->
                if (outerValue + innerValue == 2020) {
                    val1 = outerValue
                    val2 = innerValue
                }
            }
        }
        val1*val2
    }
    Integer calculatePart2(String fileName) {
        List<Integer> input = new ClassPathResource(fileName).inputStream.readLines()*.toInteger()
        Integer val1 = 0, val2 = 0, val3 = 0
        input.each {Integer outerValue ->
            input.each {Integer innerValue ->
                input.each {Integer thirdValue ->
                    if (outerValue + innerValue + thirdValue == 2020) {
                        val1 = outerValue
                        val2 = innerValue
                        val3 = thirdValue
                    }
                }
            }
        }
        val1*val2*val3
    }
}