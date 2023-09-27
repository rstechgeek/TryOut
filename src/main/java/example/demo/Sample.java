package example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample{
    public static void main(String[] args) {
        // Create a stream with sample data
        Stream<String> dataStream = Stream.of("Data1", "Data2", "Data3", "Data4", "Data5");

        // Create a list to store the collected data
        List<String> collectedData = new ArrayList<>();

        // Create a scheduled executor service
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        // Schedule a task to collect data from the stream every 2 seconds
        executorService.scheduleAtFixedRate(() -> {
            List<String> newData = dataStream
                    // .limit(1) // Get one element from the stream
                    .peek(t -> System.out.println("Processing: " + t)) // Print the data being processed
                    .collect(Collectors.toList());

            // Add the collected data to the list
            collectedData.addAll(newData);

            // Print the collected data
            System.out.println("Collected Data: " + collectedData);
        }, 0, 2, TimeUnit.SECONDS); // Initial delay of 0 seconds, repeat every 2 seconds

        // Keep the program running for demonstration purposes
        try {
            Thread.sleep(10000); // Run for 10 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Shutdown the executor service
        executorService.shutdown();
    }
}