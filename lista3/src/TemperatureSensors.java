import java.util.Random;
public class TemperatureSensors {

    public static double averageSensorTemperature(double[][] sensors, int sensorId) {
        double sum = 0;
        for (int i = 0; i < sensors[sensorId].length; i++) {
            sum += sensors[sensorId][i];
        }
        return sum / sensors[sensorId].length;
    }

    public static int findSensorWithHighestAvg(double[][] sensors) {
        double max = 0;
        int maxId = 0;
        for (int i = 0; i < sensors.length; i++) {
            if (averageSensorTemperature(sensors, i) > max) {
                max = averageSensorTemperature(sensors, i);
                maxId = i;
            }
        }
        return maxId;
    }

    public static void findTimeOfMaxTemperature(double[][] sensors) {
        double max = 0;
        int maxId = 0;
        for (int i = 0; i < sensors.length; i++) {
            for  (int j = 0; j < sensors[i].length; j++) {
                if (sensors[i][j] > max) {
                    max = sensors[i][j];
                    maxId = i;
                }
            }
        }
        System.out.println("Max temperature ("+max+") was at " + maxId);
    }

    public static void main(String[] args){
        double[][] sensors = new double[5][8];

        Random rand = new Random();

        for (int i = 0; i < sensors.length; i++) {
            for (int j = 0; j < sensors[i].length; j++) {
                sensors[i][j] = rand.nextDouble(20.0,40.0);
            }
        }

        for (int i = 0; i < sensors.length; i++) {
            System.out.println("Average temperature of sensor nr "+i+" : " + averageSensorTemperature(sensors, i));
        }

        System.out.println("The highest temperature has sensor nr "+findSensorWithHighestAvg(sensors)+ ": "+averageSensorTemperature(sensors, findSensorWithHighestAvg(sensors)));

        findTimeOfMaxTemperature(sensors);

    }
}
