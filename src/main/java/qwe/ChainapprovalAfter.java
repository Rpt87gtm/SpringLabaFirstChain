/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qwe;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ChainapprovalAfter {
    public static void main(String[] args) {
        
        
        
        IExpenseHandler chainWorker = new ExpenseHandler(new Employee("Worker", 0));
        IExpenseHandler chainManager = new ExpenseHandler(new Employee("Manager", 1000));
        IExpenseHandler chainVicepres = new ExpenseHandler(new Employee("Vicepres", 5000));
        IExpenseHandler chainPresident = new ExpenseHandler(new Employee("President", 20000));
        
        chainWorker.registerNext(chainManager);
        chainManager.registerNext(chainVicepres);
        chainVicepres.registerNext(chainPresident);
        
        
        
        
        
        // other registrations
        Scanner in = new Scanner(System.in);
        int expenseReportAmount;
        expenseReportAmount = in.nextInt();

        IExpenseReport expense = new ExpenseReport(expenseReportAmount);




        ApprovalResponse response = chainWorker.approve(expense);
        System.out.println("The request was " + response);
        if (response.getResponse() == ApprovalResponse.Approved){
            System.out.println(response.getApprover());
        }
         
    }
   
            
}
