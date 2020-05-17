package com.learning.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        App1Utility util = new App1Utility();
        double[] values = new double[] { 65, 51, 16, 11, 6519, 191, 0, 98, 19854, 1, 32 };
        double meanCalculated= util.calculateMean(values);
        System.out.println("AppVersion1 calcualted mean "+meanCalculated);
    }
}
