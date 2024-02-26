/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package qwe;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        
        
        IExpenseHandler chainWorker = (IExpenseHandler)context.getBean("empHen1");
        IExpenseHandler chainManager = (IExpenseHandler)context.getBean("empHen2");
        IExpenseHandler chainVicepres = (IExpenseHandler)context.getBean("empHen3");
        IExpenseHandler chainPresident = (IExpenseHandler)context.getBean("empHen4");
        
        chainWorker.registerNext(chainManager);
        chainManager.registerNext(chainVicepres);
        chainVicepres.registerNext(chainPresident);
        
        Scanner in = new Scanner(System.in);
        int expenseReportAmount;
        expenseReportAmount = in.nextInt();
        IExpenseReport expense = context.getBean(ExpenseReport.class,expenseReportAmount);
        
        
        ApprovalResponse response = chainWorker.approve(expense);
        System.out.println("The request was "+ response);
        
        expense = context.getBean(ExpenseReport.class,1);
        ApprovalResponse response1 = chainWorker.approve(expense);
        System.out.println("The request was "+ response1);
        
        expense = context.getBean(ExpenseReport.class,123);
        ApprovalResponse response2 = chainWorker.approve(expense);
        System.out.println("The request was "+ response2);
        
        expense = context.getBean(ExpenseReport.class,1131);
        ApprovalResponse response3 = chainWorker.approve(expense);
        System.out.println("The request was "+ response3);
        
        expense = context.getBean(ExpenseReport.class,11231);
        ApprovalResponse response4 = chainWorker.approve(expense);
        System.out.println("The request was "+ response4);
         
    }
}
