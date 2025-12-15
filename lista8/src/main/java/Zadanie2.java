import java.io.*;

public class Zadanie2 {
    public static void main(String[] args) {
        File fileOfLogs = new File("data/app.log");
        File fileErrors = new File("data/errors.log");

        int numErrors = 0;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileOfLogs));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileErrors));
            String line;

            while ((line = reader.readLine()) != null) {
                if(line.contains("ERROR")){
                    writer.write(line+"\n");
                    numErrors++;
                }
            }

            reader.close();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Amount of errors: " + numErrors);
        System.out.println("File of erros was saved to: data/errors.log");
    }
}
