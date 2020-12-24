package com.illiteratesardine.adventofcode2020

import spock.lang.Specification

class Day2Spec extends Specification {
    Day2 systemUnderTest
    
    void setup() {
        systemUnderTest = new Day2()
    }
        
    void 'should calculate part 1'() {

        when:'calculatePart1 is called'
        Integer answer = systemUnderTest.calculatePart1('Day2')

        then:
        answer == 625
    }

    void 'should calculate part 1 test'() {

        when:'calculatePart1 is called'
        Integer answer = systemUnderTest.calculatePart1('day2test')

        then:
        answer == 2
    }
    void 'should calculate part 2'() {

        when:'calculatePart2 is called'
        Integer answer = systemUnderTest.calculatePart2('Day2')

        then:
        answer == 391
    }

    void 'should calculate part 2 test'() {

        when:'calculatePart2 is called'
        Integer answer = systemUnderTest.calculatePart2('day2test')

        then:
        answer == 1
    }
}