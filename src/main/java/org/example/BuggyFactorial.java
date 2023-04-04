package org.example;

import static java.lang.Math.abs;

public class BuggyFactorial {
    public int myBuggyFact(int p){
        int result = abs(p);
        if(p == 0){
            return 1;
        }
        if (result > 1){
            int next = result-1;
            result = result*myBuggyFact(next);
        }
        return result;
    }
}
