/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vaishali Somu Ramesh
 */
public class JavaApplication5Test {

    public JavaApplication5Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class JavaApplication5.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JavaApplication5.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringPower method, of class JavaApplication5.
     */
    @Test
    public void testStringPower() {
        System.out.println("stringPower");
        String name = "";
        int number = 0;
        String expResult = "";
        String result = JavaApplication5.stringPower(name, number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testEmptyStringShouldReturnEmptyString() {
        System.out.println("stringPower");
        String name = "";
        int number = 10;
        String expResult = " ";
        String result = JavaApplication5.stringPower(name, number);
        assertEquals(expResult, result);
    }

    @Test
    public void testLessThanOneShouldReturnNull() {
        System.out.println("stringPower");
        String name = "Sample String";
        int number = 0;
        String expResult = null;
        String result = JavaApplication5.stringPower(name, number);
        assertEquals(expResult, result);
    }

    @Test
    public void testStringAndOneShouldReturnString() {
        System.out.println("stringPower");
        String name = "Sample String";
        int number = 1;
        String expResult = name;
        String result = JavaApplication5.stringPower(name, number);
        assertEquals(expResult, result);
    }

    @Test
    public void testStringAndTwoShouldReturnStringDoubled() {
        System.out.println("stringPower");
        String name = "Sample String";
        int number = 2;
        String expResult = name + name;
        String result = JavaApplication5.stringPower(name, number);
        assertEquals(expResult, result);
    }

}
