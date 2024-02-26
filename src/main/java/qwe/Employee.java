package qwe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Employee implements IExpenseApprover {

    private Integer approvalLimit;
    private String name;

    public Employee(String name, Integer approvalLimit) {
        this.name = name;
        this.approvalLimit = approvalLimit;
    }

    @Override
    public ApprovalResponse approveExpense(IExpenseReport expenseReport) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        
        ApprovalResponse response = context.getBean(ApprovalResponse.class,this);
        
        if (expenseReport.getTolal() > this.approvalLimit){
            response.setResponseBeyondApprovalLimit();
        }else{
            response.setResponseApproved();

        }
        return response;
    }

    @Override
    public String toString() {
        return "Employee{" + name + '}';
    }

    

}
