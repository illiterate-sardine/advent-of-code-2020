package com.illiteratesardine.adventofcode2020

import org.springframework.core.io.ClassPathResource

class Day4 {

    Integer calculatePart1(String fileName) {
        List<String> input = new ClassPathResource(fileName).inputStream.readLines()
        //must have:
        //byr, iyr, eyr, hgt, hcl, ecl, pid
        //OPTIONAL: cid
        //
        //perhaps separate by double \n?
        List<String> newInput = []
        makeNewInput(input, newInput)
        countCorrectPassports(newInput)
    }

    Integer calculatePart2(String fileName) {
        List<String> input = new ClassPathResource(fileName).inputStream.readLines()
    }

    Integer makeNewInput(List<String> badInput, List<String> goodInput) {
        //if the line is '\n'
        //  increment the counter
        //else
        //  append the line to the current list item (hopefully this works)
        Integer counter = 0
        Integer badMarker = 0
        while(badInput[badMarker]) { //coulda used badInput.each {
            if(badInput[badMarker] == null) {
                counter++
            }
            else {
                if(goodInput[counter]) {
                    goodInput[counter] = goodInput[counter] + " " + badInput[badMarker]
                }
                else {
                    goodInput.add(badInput[badMarker])
                }
            }
            badMarker++
        }
        System.out.println(goodInput[0])
        System.out.println(goodInput[1])
        System.out.println(goodInput[2])
        System.out.println(goodInput[3])
        0
    }

    Integer countCorrectPassports(List<String> input) {

        0
    }

    Boolean passportCheck(String line, Integer pos) {
        true
    }
}