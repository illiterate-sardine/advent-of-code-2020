package com.illiteratesardine.adventofcode2020

import spock.lang.Specification

class Day3Spec extends Specification {
    Day3 systemUnderTest
    
    void setup() {
        systemUnderTest = new Day3()
    }
        
    void 'should calculate part 1'() {

        when:'calculatePart1 is called'
        Integer answer = systemUnderTest.calculatePart1('Day3.txt')

        then:
        answer == 151
    }

    void 'should calculate part 1 test'() {

        when:'calculatePart1 is called'
        Integer answer = systemUnderTest.calculatePart1('day3test')

        then:
        answer == 7
    }
    void 'should calculate part 2'() {

        when:'calculatePart2 is called'
        Integer answer = systemUnderTest.calculatePart2('Day3')

        then:
        answer == 0
    }

    void 'should calculate part 2 test'() {

        when:'calculatePart2 is called'
        Integer answer = systemUnderTest.calculatePart2('day3test')

        then:
        answer == 336
    }
}