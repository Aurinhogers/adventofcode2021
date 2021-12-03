package main.days.dayOne;

import main.common.FileReader;

import java.net.SocketTimeoutException;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class DayTwo {

    public static void main(String[] args) {
        List<String> inputList = FileReader.transformFileToStringList("dayTwo.txt");

         System.out.println ("The answer is " + getProductofFinalHorAndDepth(inputList));
         System.out.println ("The second answer is " + getProductofFinalHorAndDepth2(inputList));

        
        }

        public static int getProductofFinalHorAndDepth(List<String>list){
            int hor = 0, depthIncrease = 0, depthDecrease =0;

            hor = list.stream()
            .filter(s -> s.contains("forward"))
            .mapToInt(s -> Integer.parseInt(s.split(" ")[1]))
            .sum();

            depthIncrease = list.stream()
            .filter(s -> s.contains("down"))
            .mapToInt(s -> Integer.parseInt(s.split(" ")[1]))
            .sum();

            depthDecrease = list.stream()
            .filter(s -> s.contains("up"))
            .mapToInt(s -> Integer.parseInt(s.split(" ")[1]))
            .sum();

            return hor * (depthIncrease - depthDecrease);
        }

        public static int getProductofFinalHorAndDepth2(List<String>list){
            int hor = 0, depth = 0, aim =0;

            for(int i = 0; i<list.size(); i++){
                switch (list.get(i).split(" ")[0]){
                    case "forward": 
                    hor = hor + Integer.parseInt(list.get(i).split(" ")[1]);
                    depth = depth + aim* Integer.parseInt(list.get(i).split(" ")[1]);
                    break;
                    case "down": 
                    aim = aim + Integer.parseInt(list.get(i).split(" ")[1]);
                    break;
                    case "up": 
                    aim = aim- Integer.parseInt(list.get(i).split(" ")[1]);
                    break;
                }
                System.out.println(list.get(i));
                System.out.println("depth is: " + depth + " and hor is: "+ hor + " aim is: " + aim);
            }
            System.out.println("depth is: " + depth + " and hor is: "+ hor);

            return hor * depth;
        }


        

}


