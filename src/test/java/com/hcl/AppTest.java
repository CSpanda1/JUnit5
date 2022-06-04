package com.hcl;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @BeforeAll
    static void setUp()
    {
        System.out.println("BeforeAll method is executed");
    }

    @AfterAll
    static void tearDown()
    {
        System.out.println("AfterAll method is executed");
    }

    @BeforeEach
    public void setUpThis()
    {
        System.out.println("BeforeEach method is executed");
    }

    @AfterEach
    public void tearDownThis()
    {
        System.out.println("AfterEach method is executed");
    }

    @Test
    public void calculateTest1()
    {
        System.out.println("Calling from Test1");
        Calculate c = new Calculate();
        assertEquals(26, c.add(12,14));
        Assertions.assertNotEquals(25, c.add(12,14));
    }

    @Test
    public void calculateTest2()
    {
        System.out.println("Test 2");
        Calculate c = new Calculate();
        assertEquals(26, c.add(12,14));
        Assertions.assertNotEquals(25, c.add(12,14));
    }

    @Test
    @Disabled
    public void calculateTest3()
    {
        System.out.println("Test 3");
        Calculate c = new Calculate();
        assertEquals(26, c.add(12,14));
        Assertions.assertNotEquals(25, c.add(12,14));
    }

    @Test
    public void calculateTest4()
    {
        System.out.println("In test 4");
        String st1 = "abc";
        String st2 = "def";
        String st3 = "xyz";
        assertAll("numbers",() -> assertEquals(st1, "abc"), () -> assertEquals(st2, "def"), () -> assertEquals(st3,"xyz"));
        System.out.println("calling from Test4");
    }


}
