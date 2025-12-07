package ex5;

public class RegularPassager extends Passager {
    private boolean hasExtraLuggage;

    public RegularPassager(String name, boolean hasExtraLuggage) {
        super(name);
        this.hasExtraLuggage = hasExtraLuggage;
    }

    public String toString() {
        return super.toString() + ", type: regular,  hasExtraLuggage=" + hasExtraLuggage;
    }

    public boolean getHasExtraLuggage() {
        return hasExtraLuggage;
    }

    public void setHasExtraLuggage(boolean hasExtraLuggage) {
        this.hasExtraLuggage = hasExtraLuggage;
    }
}