/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ezesoftware;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author poorvakuber
 */
public class CompanyStructure {

    HashMap<String, Employee> structure;

    public CompanyStructure() {
        this.structure = new HashMap<>();
    }

    public void addEmployees(String name, Employee e) {
        structure.put(name, e);
    }

    public List<String> getList(String name) {
        if (structure.containsKey(name)) {
            return getReportees(name, structure.get(name).getReportees());
        }
        return null;
    }

    public List<String> getReportees(String name, List<String> orgStructureList) {
        if (structure.isEmpty()) {
            return null;
        }
        List<String> reporteeList = new ArrayList<>();
        Queue<String> employeeQueue = new LinkedList<>(orgStructureList);
        while (!employeeQueue.isEmpty()) {
            String currentEmployee = employeeQueue.remove();
            if (structure.containsKey(currentEmployee)) {
                List<String> temp = structure.get(currentEmployee).getReportees();
                if (!temp.isEmpty()) {
                    employeeQueue.addAll(temp);
                    reporteeList.addAll(temp);
                }
            }
        }
        return reporteeList;
    }
}
