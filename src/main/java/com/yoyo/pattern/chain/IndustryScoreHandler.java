package com.yoyo.pattern.chain;

public class IndustryScoreHandler extends ScoreHandler {
    /**
     *行业打分的处理类（这里处理规则定义为商户行业值为空的话，1分。
     *                 不为空的话，3分）
     */
    @Override
    protected Integer score(Mer mer) {
        int score = 1;
        if (mer.getIndustry()!=null){
            score = 3;
        }
        if(next==null){
            return score;
        }
        return score+next.score(mer);
    }
}
