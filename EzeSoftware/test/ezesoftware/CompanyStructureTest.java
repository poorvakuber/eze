/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ezesoftware;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author poorvakuber
 */
public class CompanyStructureTest {
    
    CompanyStructure testInstance;
    
    public CompanyStructureTest() {
    }

    @Test
    public void testAddEmployees() {
        String name = "Alex";
        Employee em = null;
        CompanyStructure instance = new CompanyStructure();
        instance.addEmployees(name, em);
        testInstance.addEmployees("Alex", null);
        try{
            assertEquals(instance, testInstance);
        } catch (Exception e){
            fail("testAddEmployee failed - " + e);
        }
    }

    @Test
    public void testGetReportees() {
        System.out.println("getReportees");
        String name = "Alex";
        List<String> orgStructureList = null;
        CompanyStructure instance = new CompanyStructure();
        List<String> expResult = null;
        List<String> result = instance.getReportees(name, orgStructureList);
        try{
            assertEquals(expResult, result);
        } catch (Exception e){
            fail("testGetReportees failed - " +e);
        }
    }
    
}
