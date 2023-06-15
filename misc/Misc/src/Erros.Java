public class DivideZero{
    public static void main(String[] args);{

    int numberA = 100;
    int numberB = 0;

    try{
        System.out.printLn("Result" + divide [numberA,numberB]);
    }catch (ArithmaticException ArithmaticException){
        System.out.printLn("Exception" + ArithmaticException);
        System.out.printLn("Zero deve inserir números inteiros. Por favor,
        tente novamente");
    }
    }
    public static int divide(int numerador, int denominador) throws ArithmaticException {
        return (numerador / denominador);
    }

    }
