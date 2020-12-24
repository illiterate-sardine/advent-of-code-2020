package com.illiteratesardine.adventofcode2020

import spock.lang.Specification

class Day2Spec extends Specification {
    Day1 systemUnderTest
    
    void setup() {
        systemUnderTest = new Day1()
    }
        
    void 'should calculate part 1'() {

        when:'calculatePart1 is called'
        Integer answer = systemUnderTest.calculatePart1('Day1')

        then:
        answer == 482811
    }

    void 'should calculate part 1 test'() {

        when:'calculatePart1 is called'
        Integer answer = systemUnderTest.calculatePart1('day1test')

        then:
        answer == 514579
    }
    void 'should calculate part 2'() {

        when:'calculatePart2 is called'
        Integer answer = systemUnderTest.calculatePart2('Day1')

        then:
        answer == 193171814
    }

    void 'should calculate part 2 test'() {

        when:'calculatePart2 is called'
        Integer answer = systemUnderTest.calculatePart2('day1test')

        then:
        answer == 241861950
    }
}