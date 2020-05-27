package com.yoyo.pattern.chain;

public abstract class ScoreHandler {

    protected ScoreHandler next;//下一个处理者

    protected abstract Integer score(Mer mer);

    public void setNext(ScoreHandler next) {
        this.next = next;
    }
}
