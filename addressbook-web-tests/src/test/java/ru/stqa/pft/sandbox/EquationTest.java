package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTest {
    @Test
    public void test0(){
        Equation e = new Equation(1,1,1);
        Assert.assertEquals(e.root(),0,"Root is not equal to 0");
    }

    public void test1(){
        Equation e = new Equation(1,2,1);
        Assert.assertEquals(e.root(),1,"Root is not equal to 1");
    }

    public void test2(){
        Equation e = new Equation(1,5,6);
        Assert.assertEquals(e.root(),2,"Root is not equal to 2");
    }
}
