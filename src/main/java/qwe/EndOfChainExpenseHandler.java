/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qwe;

/**
 *
 * @author User
 */
public class EndOfChainExpenseHandler implements IExpenseHandler {
    
    private static EndOfChainExpenseHandler instance = new  EndOfChainExpenseHandler();
    
    private EndOfChainExpenseHandler(){
    
    }
    public static EndOfChainExpenseHandler getInstance(){
        return instance;
    }
    @Override
    public ApprovalResponse approve(IExpenseReport expenseReport) {
        ApprovalResponse response = new ApprovalResponse(null);
        response.setResponseBeyondApprovalLimit();
        return response;
    }

    @Override
    public void registerNext(IExpenseHandler next) {
        
    }
    
}
