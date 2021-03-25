package org.example.hello;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.calculate("SUM", new int[]{1, 2}));
        System.out.println(calc.calculate("разделить", new int[]{1, 2}));

        try {
            System.out.println(calc.calculate("divide", new int[]{1, 0}));
        } catch (ArithmeticException ex){
            ex.printStackTrace();
            System.out.println("нельзя так делать!!! reason: "+ex.getMessage());
        } finally {
            System.out.println("it will be executed in any case");
        }

        System.out.println(calc.calculate("tryn", new int[]{1, 2}));
    }

    public int calculate(String operation, int[] operands){
        int result;
        switch (operation){
            case "SUM":

                int i=0;
                int sum=0;
                while (i<operands.length){
                    sum += operands[i];
                    i++;
                }
                return sum;
            case  "разделить":
            case "divide":
                if (operands.length == 1)
                {
                    result = operands[0];
                }
                else if(operands.length == 2){
                    result = operands[0]/operands[1];
                }
                else {
                    throw new RuntimeException("количество операндов не поддерживается");
                }
                break;
            default:
                throw new RuntimeException("неизвестная операция");
        }
        return result;
    }
}
