package com.illiteratesardine.adventofcode2020

import spock.lang.Specification

class Day4Spec extends Specification {
    Day4 systemUnderTest
    
    void setup() {
        systemUnderTest = new Day4()
    }
        
    void 'should calculate part 1'() {

        when:'calculatePart1 is called'
        Integer answer = systemUnderTest.calculatePart1('Day4.txt')

        then:
        answer == 0
    }

    void 'should calculate part 1 test'() {

        when:'calculatePart1 is called'
        Integer answer = systemUnderTest.calculatePart1('day4test')

        then:
        answer == 2
    }
    void 'should calculate part 2'() {

        when:'calculatePart2 is called'
        Long answer = systemUnderTest.calculatePart2('Day4.txt')

        then:
        answer == 0
    }

    void 'should calculate part 2 test'() {

        when:'calculatePart2 is called'
        Long answer = systemUnderTest.calculatePart2('day4test')

        then:
        answer == 0
    }
}