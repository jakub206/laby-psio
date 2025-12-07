package exercise6;

public class Table {
    private String name;
    private int numColumns;
    private int numRecords;

    public Table(String name, int numColumns, int numRecords) {
        this.name = name;
        this.numColumns = numColumns;
        this.numRecords = numRecords;
    }

    public int getNumRecords() {
        return numRecords;
    }

    public String toString(){
        return "Table name: "+name+", number of columns: "+numColumns+", number of records: "+numRecords;
    }
}
