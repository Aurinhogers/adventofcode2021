package main.days.dayOne;

import main.common.FileReader;

import java.util.Collections;
import java.util.List;

public class DayOne {

    public static void main(String[] args) {
        List<Integer> inputList = FileReader.transformFileToIntegerList("dayOne.txt");
        int increase = 0, decrease = 0;

       for( int i= 0; i< inputList.size()-1 ; i++){
        System.out.println (inputList.get(i));

           if(inputList.get(i) > inputList.get(i+1)) {decrease++;}
           else increase++;
       }

         System.out.println ("The answer is " + increase);
        }

}


