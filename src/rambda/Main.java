package rambda;

import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        IntBinaryOperator op = MyMath::myMax;

        System.out.print(op.applyAsInt(3, 7));


    }
}
