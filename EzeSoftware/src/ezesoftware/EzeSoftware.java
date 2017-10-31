/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ezesoftware;

/**
 *
 * @author poorvakuber
 */
public class EzeSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CompanyStructure company = new CompanyStructure();
        Employee a = new Employee();    // Alex
        Employee c = new Employee();    // Ed
        Employee d = new Employee();    // George
        a.addReportees("Sam");
        a.addReportees("Ed");
        a.addReportees("Martin");
        c.addReportees("George");
        c.addReportees("Crane");
        c.addReportees("Kathy");
        d.addReportees("Olivia");
        d.addReportees("Jerry");
        d.addReportees("Phil");
        company.addEmployees("Alex", a);
        company.addEmployees("Ed", c);
        company.addEmployees("George", d);
        System.out.println(company.getList("Ed"));
    }
    
}
