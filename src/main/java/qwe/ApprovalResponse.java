/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qwe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author User
 */
@Component
@Scope("prototype")
public class ApprovalResponse {
    private IExpenseApprover approver;
    private static String response;

    public static final String  Approved= "Approved";
    public static final String  Denied= "Denied";
    public static final String  BeyondApprovalLimit= "BeyondApprovalLimit";
    
    @Autowired
    ApprovalResponse(IExpenseApprover approver){
        this.approver = approver;
    }
    
    
    
    public IExpenseApprover getApprover(){
        return approver;
    }
    public void setApprover(IExpenseApprover approver){
        this.approver = approver;
    }
    public String getResponse(){
        return response;
    }
    
    public void setResponseApproved(){
        response =ApprovalResponse.Approved;
    }
    public void setResponseDenied(){
        response =ApprovalResponse.Denied;
    }
    public void setResponseBeyondApprovalLimit(){
        response =ApprovalResponse.BeyondApprovalLimit;
    }
    

    
    @Override
    public String toString() {
        if(response == ApprovalResponse.BeyondApprovalLimit){
            return response;
        }
        String res = response+" "+approver.toString();
        return res;
    }
}


