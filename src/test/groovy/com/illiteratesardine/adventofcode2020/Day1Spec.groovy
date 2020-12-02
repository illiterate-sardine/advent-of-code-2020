package com.illiteratesardine.adventofcode2020

import spock.lang.Specification

class Day1Spec extends Specification {
    Day1 systemUnderTest
    
    void setup() {
        systemUnderTest = new Day1()
    }
        
    void 'should calculate part 1'() {

        when:'calculatePart1 is called'
        Integer answer = systemUnderTest.calculatePart1()

        then:
        false
        !answer
        answer == 3
    }
}