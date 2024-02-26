package qwe;

import java.util.ArrayList;
import java.util.Scanner;

public class ChainApprovalBefore_1 {

    public static void main(String[] args) {
        ArrayList<IExpenseApprover> managers = new ArrayList();
        managers.add(new Employee("Worker", 0));
        managers.add(new Employee("Manager", 1000));
        managers.add(new Employee("Vicepres", 5000));
        managers.add(new Employee("President", 20000));
        Scanner in = new Scanner(System.in);
        int expenseReportAmount;
        expenseReportAmount = in.nextInt();

        IExpenseReport expense = new ExpenseReport(expenseReportAmount);

        boolean expenseProcessed = false;

        for (IExpenseApprover approver : managers) {
            ApprovalResponse response = approver.approveExpense(expense);

            if (response.equals( ApprovalResponse.BeyondApprovalLimit)) {
                System.out.println("The request was "+ response + " by "+approver);
                expenseProcessed = true;
                break;
            }
        }

        if (!expenseProcessed) {
            System.out.println("No one was able to approve this expense");
        }
    }
}
