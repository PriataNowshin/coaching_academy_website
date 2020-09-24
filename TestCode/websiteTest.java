/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Files.website;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PRIATA
 */
public class websiteTest {
    
    website w ;
    @Before
    public void setUp() {
        w = new website();
    }
    
    @After
    public void tearDown() {
        w = null;
    }
    
    @Test
    
    public void testtotal_marks(){
        int r = w.total_mark(25, 30);
        assertEquals(55,r);
    }
    
    @Test 
    public void testnameCheck(){
        String r = w.nameCheck("Mohonlal Das");
        assertEquals("Mohonlal", r);
    }
    @Test
    public void testtotalStudent(){
        int r = w.totalStudents(560, 9);
        assertEquals(569,r);
    }
    @Test
    public void testidCheck(){
        boolean r = w.idCheck("catch2001");
        assertEquals(true,r);
    }
    
}
