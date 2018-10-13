package project;

class SingleObjectClass {
    private int someNumber;
    private static SingleObjectClass soc;

    int GetSomeNumber() {
        return someNumber;
    }

    void SetSomeNumber(int number) {
        someNumber = number;
    }

    private SingleObjectClass() {
    }

    static SingleObjectClass GiveMeMyObject() {

        if (soc == null) {
            soc = new SingleObjectClass();
        }

        return soc;
    }
}
