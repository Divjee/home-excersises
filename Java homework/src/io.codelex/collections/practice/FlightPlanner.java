package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/resources/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(FlightPlanner.class.getResource(file).toURI());
        Files.readAllLines(path, charset);
        Scanner in = new Scanner(System.in);

        List<String> flights = new ArrayList<>(Files.readAllLines(path, charset));

        Map<String, HashSet<String>> flight2 = new HashMap<>();

        Set<String> cities = new HashSet<>();

        for (int i = 0; i < flights.size(); i++) {
            String from = flights.get(i).substring(0, flights.get(i).indexOf("->")).trim();
            String to = flights.get(i).substring(flights.get(i).indexOf("->") + 2).trim();
            cities.add(to);
            HashSet<String> destination = new HashSet<>();
            destination.add(to);
            if (flight2.containsKey(from)) {
                flight2.get(from).add(to);
            } else {
                flight2.put(from, destination);
            }
        }

        System.out.println("What would you like to do?");
        System.out.println("Press 1 to display a list of the cities\nTo exit program press #");

        while (true) {
            String city = in.nextLine();
            if (city.equals("1")) {
                System.out.println(cities);
            } else if (city.equals("#")) {
                break;
            }
            System.out.println("To select a city from which you would like to start press 1");
            city = in.nextLine();
            if (city.equals("1")) {

                int counter = 0;
                for (String i : cities) {
                    System.out.println(i + "(" + counter + ")");
                    counter++;
                }
                System.out.println("Select a city (0 - 5)");
            }
            city = in.nextLine();
            if (city.equals("0")) {
                System.out.print("Destinations from San Franciso : ");
                System.out.println(flight2.get("San Franciso"));
            } else if (city.equals("1")) {
                System.out.print("Destinations from New York : ");
                System.out.println(flight2.get("New York"));
            } else if (city.equals("2")) {
                System.out.print("Destinations from Honolulu : ");
                System.out.println(flight2.get("Honolulu"));
            } else if (city.equals("3")) {
                System.out.print("Destinations from Anchorage : ");
                System.out.println(flight2.get("Anchorage"));
            } else if (city.equals("4")) {
                System.out.print("Destinations from Denver : ");
                System.out.println(flight2.get("Denver"));
            } else if (city.equals("5")) {
                System.out.print("Destinations from San Jose : ");
                System.out.println(flight2.get("San Jose"));
            }
        }
    }
}









