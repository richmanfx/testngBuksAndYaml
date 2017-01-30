package ru.r5am;

import org.testng.annotations.Test;

/**
 * Created by Zoer on 30.01.2017.
 *
 */
public class ASD0101_01 {


    @Test(groups = {"firstgroup"})
    public void testMethod1() {
        System.out.println("Это testMethod1");
    }

    @Test(groups = {"firstgroup"})
    public void testMethod2() {
        System.out.println("Это testMethod2");
    }

    @Test(groups = {"firstgroup"})
    public void testMethod3() {
        System.out.println("Это testMethod3");
    }
}
