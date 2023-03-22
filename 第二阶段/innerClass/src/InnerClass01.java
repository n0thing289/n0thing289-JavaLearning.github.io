public class InnerClass01 {
}

class outer{
    private int n1 = 10;
    public outer(int n1){
        this.n1 = n1;
    }
    public void f1(){}
    {
        System.out.println("code block");
    }

    class inner{

    }
}

class Other{}
