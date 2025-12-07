package exercise6;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private String name;
    private String type;

    private List<Table> tables;

    public Database(String name, String type) {
        this.name = name;
        this.type = type;
        this.tables = new ArrayList<>();
    }

    public void addTable(String name, int numColumns, int numRecords) {
        Table table = new Table(name, numColumns, numRecords);
        tables.add(table);
    }

    public void showTables() {
        System.out.println();
        if (tables.isEmpty()) {
            System.out.println("No tables found");
        } else {
            System.out.println("Tables in "+name+":");
            for (Table table : tables) {
                System.out.println("* "+table);
            }
        }
        System.out.println();
    }

    public int getTotalRecords() {
        int total = 0;
        for (Table table : tables) {
            total += table.getNumRecords();
        }
        return total;
    }

    public static void main(String[] args){
        Database database = new Database("Base1", "SQL");

        database.addTable("table1",7,20);
        database.addTable("table2",8,10);
        database.addTable("table3",2,14);

        database.showTables();
        System.out.println("Total number of records: "+database.getTotalRecords());
    }
}
