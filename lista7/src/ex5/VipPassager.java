package ex5;

public class VipPassager extends Passager {
    private String loungeAccessCode;

    public VipPassager(String name, String loungeAccessCode) {
        super(name);
        this.loungeAccessCode = loungeAccessCode;
    }

    public String toString() {
        return super.toString() + ", type: VIP, loungeAccessCode=" + loungeAccessCode;
    }

    public String getLoungeAccessCode() {
        return loungeAccessCode;
    }

    public void setLoungeAccessCode(String loungeAccessCode) {
        this.loungeAccessCode = loungeAccessCode;
    }
}