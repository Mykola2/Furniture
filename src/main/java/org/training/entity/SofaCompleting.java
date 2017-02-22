package org.training.entity;

public class SofaCompleting {
    private Sofa sofa;
    private Completing completing;
    private Long amount;

    public Sofa getSofa() {
        return sofa;
    }

    public void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }

    public Completing getCompleting() {
        return completing;
    }

    public void setCompleting(Completing completing) {
        this.completing = completing;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
