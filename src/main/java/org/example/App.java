package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World! Again!" );
        BuggyFactorial fact = new BuggyFactorial();
        System.out.println(fact.myBuggyFact(10));
    }
}
