package io.codelex.questions.exercise4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/someText.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Exercise4.class.getResource(file).toURI());
        Files.readAllLines(path, charset);

        List<String> someFile = new ArrayList<>(Files.readAllLines(path, charset));

        String[] g = String.valueOf(someFile.get(0)).split(" ");
        StringBuilder textFile2 = new StringBuilder();

        for (int i = 1; i <= g.length; i++) {
            textFile2.append(g[g.length - i]).append(" ");
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Salix\\Documents\\home-excersises\\home-excersises\\Java homework\\src\\main\\resources\\someText2.txt"));
        writer.write(String.valueOf(textFile2));
        writer.close();
    }
}
