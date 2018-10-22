public class SingleObjectClass {
    private static SingleObjectClass ourInstance = new SingleObjectClass();

    private int number;

    public static SingleObjectClass getInstance() {
        return ourInstance;
    }

    private SingleObjectClass() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
