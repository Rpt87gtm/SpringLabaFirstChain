/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qwe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author User
 */
@Configuration
@ComponentScan(basePackages = "qwe")
public class AppConfig {
    @Bean
    public Employee emp1(){
        return new Employee("Worker",500);
    }
    @Bean
    public Employee emp2(){
        return new Employee("Manager",1000);
    }
    @Bean
    public Employee emp3(){
        return new Employee("Vicepres",5000);
    }
    @Bean
    public Employee emp4(){
        return new Employee("President",20000);
    }
    @Bean
    public ExpenseHandler empHen1(){
        return new ExpenseHandler( emp1());
    }
    @Bean
    public ExpenseHandler empHen2(){
        return new ExpenseHandler( emp2());
    }
    @Bean
    public ExpenseHandler empHen3(){
        return new ExpenseHandler( emp3());
    }
    @Bean
    public ExpenseHandler empHen4(){
        return new ExpenseHandler( emp4());
    }
    
    /*
    @Bean
    public ExpenseHandler expenseHandler(Employee employee){
        return new ExpenseHandler(employee);
    }
    
    @Bean
    public ExpenseHandler chain(){
        ExpenseHandler chain = expenseHandler(emp1());
        chain.registerNext(expenseHandler(emp2()));
        chain.registerNext(expenseHandler(emp3()));
        chain.registerNext(expenseHandler(emp4()));
        return chain;
    }
    */
    
}
