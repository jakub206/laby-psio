import java.util.Random;
public class Students {
    public static int bestStudent(int[][] grades){
        int best = 0, max = 0;
        for(int i = 0; i < grades.length; i++){
            int sum = 0;
            for(int j = 0; j < grades[i].length; j++){
                sum += grades[i][j];
            }
            if(sum > max){
                max = sum;
                best = i;
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int grades[][] = new int[5][4];
        Random rand = new Random();

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = rand.nextInt(2,6);
            }
        }

        /** Average of Students results**/
        double[] studentAverage =  new double[grades.length];
        int bestIndex = 1;
        for (int i = 0; i < grades.length; i++) {
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            studentAverage[i] = (double) sum/grades[i].length;
        }

        /** Average of subjects **/
        double[] subjectAverage =  new double[grades[0].length];
        for (int i = 0; i < grades[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < grades.length; j++) {
                sum += grades[j][i];
            }
            subjectAverage[i] = (double) sum/grades[0].length;
        }

        System.out.println("Student | Subject1 | Subject2 | Subject3 | Subject4 | Average");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(" "+(i+1)+"      |     "+grades[i][0]+"    |"+"     "+grades[i][1]+"    |"+"     "+grades[i][2]+"    |"+"     "+grades[i][3]+"    |  "+studentAverage[i]);
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Average |    "+subjectAverage[0]+"   "+"|    "+subjectAverage[1]+"   |    "+subjectAverage[2]+"   |    "+subjectAverage[3]+"   |");

        System.out.println();
        System.out.println("Index of the best student: "+(bestStudent(grades)+1));
    }
}
