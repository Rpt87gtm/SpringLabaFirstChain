package qwe;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("prototype")
public class ExpenseReport implements IExpenseReport{
    private Integer total;

    public ExpenseReport(Integer total) {
        this.total = total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }    

    @Override
    public Integer getTolal() {
       return this.total;
    }

}
