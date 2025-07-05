import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] maths = {4, 6, 7, 5, 8};
        int[] cs = {3, 7, 8, 5, 8};
        String[] res = {"F", "P", "P", "F", "P"};

        int queryMath = 6;
        int queryCs = 8;
        int k = 3;

        // List to store distances and their original index
        List<DistancePair> distances = new ArrayList<>();

        System.out.println("TP\t\tDistance");
        for (int i = 0; i < maths.length; i++) {
            double distance = Math.sqrt(
                Math.pow(queryMath - maths[i], 2) + Math.pow(queryCs - cs[i], 2)
            );
            System.out.printf("(%d,%d)\t\t%.2f\n", maths[i], cs[i], distance);

            distances.add(new DistancePair(distance, i));
        }

        // Sort the list by distance
        Collections.sort(distances, Comparator.comparingDouble(d -> d.distance));

        // Show the k nearest neighbors and predict the class
        int countP = 0, countF = 0;
        System.out.println("\n" + k + " Nearest Neighbors:");
        for (int i = 0; i < k; i++) {
            int index = distances.get(i).index;
            System.out.printf("(%d,%d) -> %s, Distance: %.2f\n",
                maths[index], cs[index], res[index], distances.get(i).distance
            );
            if (res[index].equals("P")) countP++;
            else countF++;
        }

        String predictedClass = (countP > countF) ? "P" : "F";
        System.out.println("\nPredicted Class: " + predictedClass);
    }

    // Helper class to store distance and original index
    static class DistancePair {
        double distance;
        int index;

        DistancePair(double distance, int index) {
            this.distance = distance;
            this.index = index;
        }
    }
}
