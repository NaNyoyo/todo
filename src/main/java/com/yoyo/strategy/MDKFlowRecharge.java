package com.yoyo.strategy;

/**
 * 麻袋氪流量充值
 */
public class MDKFlowRecharge implements FlowRecharge {
    @Override
    public FlowRechargeState recharge(String mobile, String productid) {
        System.out.println("拼命请求麻袋氪流量充值。。。");
        return new FlowRechargeState("00","充值成功",null);
    }
}
