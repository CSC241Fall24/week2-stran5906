// src/main/java/Q1WeirdFunction.java

import java.util.ArrayList;

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        if (n < 3){
            return n;
        }
        return fRecursive(n-1) + 2 * fRecursive(n-2) + 3 * fRecursive(n-3);
        
    }

    public static int fIterative(int n) {
        
        if (n < 3){
            return n;
        }

        ArrayList <Integer> output = new ArrayList<>();
        output.add(0);
        output.add(1);
        output.add(2);

        for (int i = 3; i <= n; i++){
            output.add( output.get(i-1) + 2*output.get(i-2) + 3*output.get(i-3) );
        }
        return output.get(n);
    }
}