package com.illiteratesardine.adventofcode2020

import org.springframework.core.io.ClassPathResource

class Day3 {

    Long calculatePart1(String fileName) {
        List<String> input = new ClassPathResource(fileName).inputStream.readLines()
        Long treeCount = 0
        Integer horizontalPos = 0
        input.each{
            if (hasTree(it, horizontalPos)) {
                treeCount++
            }
            horizontalPos++
            horizontalPos++
            horizontalPos++
        }
        treeCount
    }

    Long calculatePart2(String fileName) {
        List<String> input = new ClassPathResource(fileName).inputStream.readLines()
        Long routeOne   = routeTest(input, 1, 1)
        Long routeTwo   = routeTest(input, 3, 1)
        Long routeThree = routeTest(input, 5, 1)
        Long routeFour  = routeTest(input, 7, 1)
        Long routeFive  = routeTest(input, 1, 2)
        routeOne*routeTwo*routeThree*routeFour*routeFive
    }

    Long routeTest(List<String> input, Integer right, Integer down) {
        Integer horizontalPos = 0
        Integer verticalPos = 0
        Long treeCount = 0 as Long
        input.each {
            if (verticalPos % down == 0 && verticalPos <= input.size()) {
                if (hasTree(it, horizontalPos)) {
                    treeCount++
                }
                horizontalPos = horizontalPos + right
            }
            verticalPos++
        }
        treeCount as Long
    }

    Boolean hasTree(String line, Integer pos) {
        Integer tempPos = 0
        tempPos = tempPos + (pos % line.length())
        line[tempPos] == '#'
    }
}