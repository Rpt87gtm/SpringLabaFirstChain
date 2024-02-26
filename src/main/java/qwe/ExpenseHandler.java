/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qwe;

/**
 *
 * @author User
 */
public class ExpenseHandler implements IExpenseHandler{
    private IExpenseApprover approver;
    private IExpenseHandler next;
         

    ExpenseHandler(IExpenseApprover expenseApprover){
        approver = expenseApprover;
        next =  EndOfChainExpenseHandler.getInstance();
    }
            
    @Override
    public ApprovalResponse approve(IExpenseReport expenseReport) {

        ApprovalResponse response = approver.approveExpense(expenseReport);

        if (response.getResponse() == (ApprovalResponse.Approved)){
            return response;
        }else{
            return next.approve(expenseReport);
        }
        
    }

    @Override
    public void registerNext(IExpenseHandler next) {
        this.next = next;
    }
    
}
