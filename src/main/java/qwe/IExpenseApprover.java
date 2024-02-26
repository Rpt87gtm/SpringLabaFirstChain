package qwe;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
interface IExpenseApprover {
    ApprovalResponse approveExpense(IExpenseReport expenseReport);
}
