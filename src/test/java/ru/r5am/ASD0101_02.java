package ru.r5am;

import org.testng.annotations.Test;

/**
 * Created by Admin on 31.01.2017.
 *
 */
public class ASD0101_02 {

    @Test(groups = {"firstgroup"})
    public void testMethod1() {
        System.out.println(String.format("Run testMethod1 in %s.", this.getClass().getSimpleName()));
    }

    @Test(groups = {"secondgroup"})
    public void testMethod2() {
        System.out.println(String.format("Run testMethod2 in %s.", this.getClass().getSimpleName()));
    }

    @Test(groups = {"firstgroup"})
    public void testMethod3() {
        System.out.println(String.format("Run testMethod3 in %s.", this.getClass().getSimpleName()));
    }
}
