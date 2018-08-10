import java.util.ArrayList;

public class FolioTranscations {
    public String name;
    public ArrayList<FolioRow> transactionRows;
    protected String SPACE=" ";

    public FolioTranscations(String name, ArrayList<FolioRow> transactionRows) {
        this.name = name;
        this.transactionRows = transactionRows;
    }

    public void PrintFolioTransaction(){
        System.out.println(name);
        for(FolioRow row : transactionRows){
            System.out.println(row.range.start + SPACE + row.range.end + SPACE
            + row.status + SPACE + row.transferCode);
        }
    }
}
