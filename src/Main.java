import rambda.MyMath;
import stream.Parser;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
    /*    MyMath myMath = new MyMath();
        IntBinaryOperator op = MyMath::myMax;

        System.out.print(op.applyAsInt(3, 7));
    */
        List<String> strList = Arrays.asList("1,2,3,4,5,6".split(","));

        List<Integer> intList = Parser.strToIntList(strList);

        int sum =0;

        for(Integer value : intList){
            sum += value;
        }
        System.out.println(sum);
    }
}
