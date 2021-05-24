package ru.job4j.algoritms;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SearchFile {
    public static void main(String[] args) {
        ArrayList<File> arrayList = new ArrayList<>();
        searchFile(new File("D:\\"), arrayList);

    }

    public static void searchFile(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            File[] directoryFile = rootFile.listFiles();
            if (directoryFile != null) {
                for (File file : directoryFile) {
                    if (file.isDirectory()) {
                        searchFile(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".jpg")) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}
