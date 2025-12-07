package ex5;

abstract public class Passager {
    private String name;
    private boolean checkedIn;

    public Passager(String name){
        this.name = name;
        this.checkedIn = false;
    }

    public String toString(){
        return "name: "+name+", checked:  "+checkedIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }
}