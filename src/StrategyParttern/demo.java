/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyParttern;

/**
 *
 * @author dongnq
 */
public class demo {
    
    public static void main(String[] args){
        StrategyExecution execution = new StrategyExecution(new Strategy1());
        execution.execute();
        execution = new StrategyExecution(new Strategy2());
        execution.execute();
        execution = new StrategyExecution(new Strategy3());
        execution.execute();
    }
    
}
