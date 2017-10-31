/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ezesoftware;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author poorvakuber
 */
public class Employee {
    
//    private final String name;
    private final List<String> reportees;
    
    public Employee(String name){
//        this.name = name;
        this.reportees = new ArrayList<>();
    }
    
    public void addReportees(String name){
        this.reportees.add(name);
    }
    
    public void removeReportees(String name){
        this.reportees.remove(name);
    }
    
    public List<String> getReportees(){
        if(reportees.isEmpty()){
            return null;
        }
        return reportees;
    }
    
}
