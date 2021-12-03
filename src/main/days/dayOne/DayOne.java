package main.days.dayOne;

import main.common.FileReader;

import java.util.List;

public class DayOne {

    public static void main(String[] args) {
        List<Integer> inputList = FileReader.transformFileToIntegerList("dayOne.txt");

         System.out.println ("The answer is " + getAmountofincreases(inputList));
         System.out.println("The second answer is " + getAmountofincreasesWithinWindow(inputList));
        }

        public static int getAmountofincreases(List<Integer>list){
            int increase = 0;

            for( int i= 0; i< list.size()-1 ; i++){     
                if(list.get(i) < list.get(i+1)) {increase++;}
            }
            return increase;
        }

        public static int getAmountofincreasesWithinWindow(List<Integer>list){
            int increase = 0;
            for( int i= 0; i< list.size()-3 ; i++){
    
                if(list.get(i) < list.get(i+3)) {increase++;}
            }
            return increase;
        }


        

}


