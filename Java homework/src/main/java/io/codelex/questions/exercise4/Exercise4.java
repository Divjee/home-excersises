package io.codelex.questions.exercise4;

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
    private static final String file = "/resources/someText.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Exercise4.class.getResource(file).toURI());
        Files.readAllLines(path, charset);

        List<String> someFile = new ArrayList<>(Files.readAllLines(path, charset));

        System.out.println(someFile);
    }
}
