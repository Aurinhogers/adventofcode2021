package main.common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileReader {

    private static Path returnFile(String filename) {

        return Paths.get("src/resources/" + filename);
    }

    public static List<Integer> transformFileToIntegerList(String filename){

        Path inputFile = returnFile(filename);

        List<Integer> createdList = new ArrayList<>();
        try {
            createdList = Files.lines(inputFile).map(Integer::valueOf).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return createdList;
    }

    public static List<String> transformFileToStringList(String filename){

        Path inputFile = returnFile(filename);

        List<String> createdList = new ArrayList<>();
        try {
            createdList = Files.lines(inputFile).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return createdList;
    }

}
