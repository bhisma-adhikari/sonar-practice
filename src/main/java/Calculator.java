public class Calculator {
    private Adder adder;
    private Divider divider;

    public Calculator(Adder adder, Divider divider)
    {
        this.adder = adder;
        this.divider = divider;
    }

    public int add(int x, int y)
    {
        return adder.add(x, y);
    }

    public int divide(int x, int y)
    {
        return divider.divide(x, y);
    }


}
