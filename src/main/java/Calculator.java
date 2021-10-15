public class Calculator {
    private Adder adder;

    public Calculator(Adder adder)
    {
        this.adder = adder;
    }

    public int add(int x, int y)
    {
        return adder.add(x, y);
    }
}
