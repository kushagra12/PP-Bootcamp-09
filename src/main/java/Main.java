import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String filePath= "src/main/java/input.txt";
    public static ArrayList<FolioTranscations> getInput(String filePath) throws FileNotFoundException {
        ArrayList<FolioTranscations> input = new ArrayList<>();
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        boolean isEND= false;
        while(!isEND){
            String name= scanner.nextLine();
            if(name.equals("END")){
                isEND= true;
            }else {
                ArrayList<FolioRow> transactions = new ArrayList<>();
                boolean isZero= false;
                while (!isZero) {
                    String start = scanner.next();
                    if (start.equals("0")) {
                        isZero = true;
                        scanner.nextLine();
                    }else{
                        String end = scanner.next();
                        String status = scanner.next();
                        String transferCode= scanner.next();
                        FolioRow row = new FolioRow(new Range(start,end),status,transferCode);
                        transactions.add(row);
                    }
                }
                FolioTranscations folioTranscations= new FolioTranscations(name,transactions);
                input.add(folioTranscations);
            }
        }
        return input;
    }

    public static void main(String[] args){
        System.out.println("Hello Folio");

        try {
            ArrayList<FolioTranscations> input=getInput(filePath);
            for (FolioTranscations folioTranscations: input){
                folioTranscations.PrintFolioTransaction();
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
