package test.javabasic;

abstract class MyClass {

    private void disp1() /**Line A**/
    {
        System.out.println("Parent class");
    }

    abstract public void disp2();

    abstract void disp3();

    abstract protected void disp4();
}

class Program extends MyClass {

    public void disp2() /**Line B**/
    {
        System.out.println("1");
    }

    void disp3() /**Line C**/
    {
        System.out.println("2");
    }

    protected void disp4() {
        System.out.println("3");
    }

    public static void main(String args[]) {
        Program obj = new Program();
    }
}