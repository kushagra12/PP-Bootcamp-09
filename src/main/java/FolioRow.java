import javafx.util.Pair;

public class FolioRow {
    public Range range;
    public String status;
    public String transferCode;
    public String state;

    public FolioRow(Range range,String status, String transferCode) {
        this.range = range;
        this.state = status + transferCode;
        this.status = status;
        this.transferCode = transferCode;
    }
}
