/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ezesoftware;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author poorvakuber
 */
public class EmployeeTest {
    
    List<String> reportees;
    
    public EmployeeTest() {
    }
    
    @Before
    public void setUp() {
        reportees = new ArrayList<>();
    }
    
    @Test
    public void testAddReportees() {
        String name = "Alex";
        List<String> list = new ArrayList<>();
        list.add("Alex");
        reportees.add(name);
        List<String> exp = list;
        List<String> result = reportees;
        try{
            assertEquals(exp,result);
        } catch (Exception e){
            fail("testAddReportees failed - " + e);
        }
        
    }
    
    @Test
    public void testRemoveReportees() {
        String name = "Alex";
        reportees.add(name);
        List<String> exp = new ArrayList<>();
        reportees.remove("Alex");
        List<String> result = reportees;
        try{
            assertEquals(exp,result);
        } catch (Exception e){
            fail("testAddReportees failed - " + e);
        }
        
    }
    
    @Test
    public void testGetReportees() {
        String name = "Alex";
        List<String> list = new ArrayList<>();
        list.add(name);
        reportees.add(name);
        List<String> exp = list;
        List<String> result = reportees;
        try{
            assertEquals(exp,result);
        } catch (Exception e){
            fail("testAddReportees failed - " + e);
        }
        
    }
    
    
}
