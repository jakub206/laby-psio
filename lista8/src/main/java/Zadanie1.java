import java.io.*;
public class Zadanie1 {
    public static void main(String[] args) {
        String filePath = "data/dane1.txt";
        //String filePath = "data/input.txt";

        File file = new File(filePath);

        int numLine = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                if(line.trim().isEmpty()){
                    continue;
                }
                numLine++;

                System.out.println(numLine+": "+line);
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Amount of not null lines: "+numLine);
    }
}
