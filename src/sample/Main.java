package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main extends Application {

    private static final Random RANDOM = new Random();
    private static final NumberAxis X_AXIS = new NumberAxis();
    private static final NumberAxis Y_AXIS = new NumberAxis();
    private static final int[] RAND_ARRAY = new int[1000];

    @Override
    public void start(Stage primaryStage) {

        // *********** RANDOM OBSERVATION CONSOLE TO CONFIRM CHART OUTPUTS *************
        System.out.println("Mean: " + Mean(RAND_ARRAY));
        System.out.println("Median: " + Median(RAND_ARRAY));
        System.out.println("Mode: " + Mode(RAND_ARRAY));
        System.out.printf("%s%.2f%n", "Standard Deviation: ", StandardDeviation(RAND_ARRAY));
        //***********************************************************************************

        // Set x and y axis labels
        X_AXIS.setLabel("Random Numbers (1 to 1000)");
        Y_AXIS.setLabel("Random Numbers (1 to 1000)");

        // creating the line chart | passing in x and y axis
        final LineChart<Number,Number> lineChart = new LineChart<>(X_AXIS, Y_AXIS);

        // Set the title of the line chart
        lineChart.setTitle("Homework Assignment Week 1, CSC-440 (Devin Ordean)");

        // Create a series for the random Mean function
        XYChart.Series<Number, Number> seriesMean = new XYChart.Series<>();
        // Set the name of the series
        seriesMean.setName("Mean");
        // add data to the series *************************************************
        seriesMean.getData().add(new XYChart.Data<>(0, Mean(RAND_ARRAY)));
        seriesMean.getData().add(new XYChart.Data<>(100, Mean(RAND_ARRAY)));
        seriesMean.getData().add(new XYChart.Data<>(200, Mean(RAND_ARRAY)));
        seriesMean.getData().add(new XYChart.Data<>(300, Mean(RAND_ARRAY)));
        seriesMean.getData().add(new XYChart.Data<>(400, Mean(RAND_ARRAY)));
        seriesMean.getData().add(new XYChart.Data<>(500, Mean(RAND_ARRAY)));
        seriesMean.getData().add(new XYChart.Data<>(600, Mean(RAND_ARRAY)));
        seriesMean.getData().add(new XYChart.Data<>(700, Mean(RAND_ARRAY)));
        seriesMean.getData().add(new XYChart.Data<>(800, Mean(RAND_ARRAY)));
        seriesMean.getData().add(new XYChart.Data<>(900, Mean(RAND_ARRAY)));
        seriesMean.getData().add(new XYChart.Data<>(1000, Mean(RAND_ARRAY)));
        seriesMean.getData().add(new XYChart.Data<>(1000, Mean(RAND_ARRAY)));

        // Create a series for the random Median function *************************
        XYChart.Series<Number, Number> seriesMedian = new XYChart.Series<>();
        seriesMedian.setName("Median");
        seriesMedian.getData().add(new XYChart.Data<>(0, Median(RAND_ARRAY)));
        seriesMedian.getData().add(new XYChart.Data<>(100, Median(RAND_ARRAY)));
        seriesMedian.getData().add(new XYChart.Data<>(200, Median(RAND_ARRAY)));
        seriesMedian.getData().add(new XYChart.Data<>(300, Median(RAND_ARRAY)));
        seriesMedian.getData().add(new XYChart.Data<>(400, Median(RAND_ARRAY)));
        seriesMedian.getData().add(new XYChart.Data<>(500, Median(RAND_ARRAY)));
        seriesMedian.getData().add(new XYChart.Data<>(600, Median(RAND_ARRAY)));
        seriesMedian.getData().add(new XYChart.Data<>(700, Median(RAND_ARRAY)));
        seriesMedian.getData().add(new XYChart.Data<>(800, Median(RAND_ARRAY)));
        seriesMedian.getData().add(new XYChart.Data<>(900, Median(RAND_ARRAY)));
        seriesMedian.getData().add(new XYChart.Data<>(1000, Median(RAND_ARRAY)));

        // Create a series for the random Mode function ******************************
        XYChart.Series<Number, Number> seriesMode = new XYChart.Series<>();
        seriesMode.setName("Mode");
        seriesMode.getData().add(new XYChart.Data<>(0, Mode(RAND_ARRAY)));
        seriesMode.getData().add(new XYChart.Data<>(100, Mode(RAND_ARRAY)));
        seriesMode.getData().add(new XYChart.Data<>(200, Mode(RAND_ARRAY)));
        seriesMode.getData().add(new XYChart.Data<>(300, Mode(RAND_ARRAY)));
        seriesMode.getData().add(new XYChart.Data<>(400, Mode(RAND_ARRAY)));
        seriesMode.getData().add(new XYChart.Data<>(500, Mode(RAND_ARRAY)));
        seriesMode.getData().add(new XYChart.Data<>(600, Mode(RAND_ARRAY)));
        seriesMode.getData().add(new XYChart.Data<>(700, Mode(RAND_ARRAY)));
        seriesMode.getData().add(new XYChart.Data<>(800, Mode(RAND_ARRAY)));
        seriesMode.getData().add(new XYChart.Data<>(900, Mode(RAND_ARRAY)));
        seriesMode.getData().add(new XYChart.Data<>(1000, Mode(RAND_ARRAY)));

        // Create a series for the random StandardDeviation function **********************
        XYChart.Series<Number, Number> seriesSD = new XYChart.Series<>();
        seriesSD.setName("SD");
        seriesSD.getData().add(new XYChart.Data<>(0, StandardDeviation(RAND_ARRAY)));
        seriesSD.getData().add(new XYChart.Data<>(100, StandardDeviation(RAND_ARRAY)));
        seriesSD.getData().add(new XYChart.Data<>(200, StandardDeviation(RAND_ARRAY)));
        seriesSD.getData().add(new XYChart.Data<>(300, StandardDeviation(RAND_ARRAY)));
        seriesSD.getData().add(new XYChart.Data<>(400, StandardDeviation(RAND_ARRAY)));
        seriesSD.getData().add(new XYChart.Data<>(500, StandardDeviation(RAND_ARRAY)));
        seriesSD.getData().add(new XYChart.Data<>(600, StandardDeviation(RAND_ARRAY)));
        seriesSD.getData().add(new XYChart.Data<>(700, StandardDeviation(RAND_ARRAY)));
        seriesSD.getData().add(new XYChart.Data<>(800, StandardDeviation(RAND_ARRAY)));
        seriesSD.getData().add(new XYChart.Data<>(900, StandardDeviation(RAND_ARRAY)));
        seriesSD.getData().add(new XYChart.Data<>(1000, StandardDeviation(RAND_ARRAY)));

        // Add series to the lineChart ******************************************************
        lineChart.getData().add(seriesMean);
        lineChart.getData().add(seriesMedian);
        lineChart.getData().add(seriesMode);
        lineChart.getData().add(seriesSD);

        // Set stage | scene ********************************************
        primaryStage.setTitle("Week1 HW");
        primaryStage.setScene(new Scene(lineChart, 1000, 600));
        primaryStage.show();
    }

    // A function to create a new random array on every call and process the mean
    public static int Mean(int[] randArray) {
        randArray = new int[1000];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = RANDOM.nextInt(1000) + 1;
        }
        int mean = 0;
        for (int j : randArray) {
            mean += j;
        }
        return mean / 1000;
    }

    // A function to create a new random array on every call and process the median
    public static int Median(int[] randArray) {
        randArray = new int[1000];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = RANDOM.nextInt(1000) + 1;
        }
        Arrays.sort(randArray);
        return (randArray[499] + randArray[500]) / 2;
    }

    // A function to create a new random array on every call and process the mode
    public static int Mode(int[] randArray) {
        randArray = new int[1000];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = RANDOM.nextInt(1000) + 1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int key : randArray) {
            if (map.containsKey(key)) {
                int freq = map.get(key);
                freq++;
                map.put(key, freq);
            } else {
                map.put(key, 1);
            }
        }

        int max = 0;
        int res = -1;
        for (Map.Entry<Integer, Integer> val : map.entrySet()) {
            if (max < val.getValue()) {
                res = val.getKey();
                max = val.getValue();
            }
        }
        return res;
    }

    // A function to create a new random array on every call and process the SD
    public static double StandardDeviation(int[] randArray) {
        randArray = new int[1000];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = RANDOM.nextInt(1000) + 1;
        }
        double standardDeviation = 0;
        int mean = Mean(randArray);
        for (double temp : randArray) {
            standardDeviation += Math.pow(temp - mean, 2);
        }
        return Math.sqrt(standardDeviation/randArray.length);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
