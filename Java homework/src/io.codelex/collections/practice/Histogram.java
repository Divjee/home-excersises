package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/resources/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();

        String[] scores1 = scores.split(" ");
        List<Integer> scoresInt = new ArrayList<>();

        for (String i : scores1) {
            scoresInt.add(Integer.parseInt(i));
        }

        String star = "*";
        int max = 100;
        int counter = 0;
        for (int i = 0; i <= max; i += 10) {
            int low = i;
            int high = low + 9;
            for (int j = 0; j < scoresInt.size(); j++) {
                if (scoresInt.get(j) <= high && scoresInt.get(j) >= low) {
                    counter++;
                }
            }
            if (high < 10) {
                System.out.println(" " + low + "-" + " " + high + ": " + star.repeat(counter));
            } else if (low == max) {
                System.out.println("  " + low + ": " + star.repeat(counter));
            } else {
                System.out.println(low + "-" + high + ": " + star.repeat(counter));
            }
            counter = 0;
        }
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
