package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        printExtention("C:\\Users\\Yulia\\Desktop\\test");
    }

    // Задание 1
    public static boolean isPolindrom(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    // Задание 2
    public static void printExtention(String dir) throws IOException {
        List<File> fileList = Files.walk(Paths.get(dir))
                .filter(Files::isRegularFile)
                .map(Path::toFile)
                .collect(Collectors.toList());
        for (File f: fileList) {
            int index = f.getName().lastIndexOf(".");
            if(index!=-1){
                System.out.println("Расширение файла: "+ f.getName().substring(index));
            } else {
                System.out.println("Расширение файла: ");
            }

        }

    }

}
