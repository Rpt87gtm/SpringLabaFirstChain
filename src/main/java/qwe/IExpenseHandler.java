/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package qwe;

/**
 *
 * @author User
 */
public interface IExpenseHandler {
    ApprovalResponse approve(IExpenseReport expenseReport);
    void registerNext(IExpenseHandler next);
}
