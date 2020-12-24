package com.illiteratesardine.adventofcode2020

import org.springframework.core.io.ClassPathResource

class Day3 {

    Integer calculatePart1(String fileName) {
        List<String> input = new ClassPathResource(fileName).inputStream.readLines()
        Integer treeCount = 0
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

    Boolean hasTree(String line, Integer pos) {
        Integer tempPos = 0
        tempPos = tempPos + (pos % line.length())
        Boolean isTree = false
        if (line[tempPos] == '#') {
            isTree = true
        }
        isTree
    }

    Integer calculatePart2(String fileName) {
        List<String> input = new ClassPathResource(fileName).inputStream.readLines()
        input.count{isValid2(it)}
    }

    Boolean isValid2(String line) {
        //2-9 c: ccccccccc
        //1stIndex-2ndIndex char: pass
        //separate by spaces, dash, colon
//        Boolean isAllowed = false
        List <String> separated = line.split(' ')*.split('-').flatten()
        Integer first = separated[0].toInteger()
        Integer second = separated[1].toInteger()
        String letter = separated[2].charAt(0)
        String pass = separated[3]
        (pass[first-1].toString() == letter && pass[second-1].toString() != letter) || (pass[first-1].toString() != letter && pass[second-1].toString() == letter)
//        if (((pass[first].toString() == letter)&&(pass[second].toString() != letter)) || ((pass[first].toString() != letter)&&(pass[second].toString() == letter))) {
//            isAllowed = true
//        }
//        isAllowed
    }

}