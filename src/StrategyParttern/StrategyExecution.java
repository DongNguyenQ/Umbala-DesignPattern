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
public class StrategyExecution {
    
    private Strategy strategy;

    public StrategyExecution(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void execute(){
        strategy.action();
    }
    
}
