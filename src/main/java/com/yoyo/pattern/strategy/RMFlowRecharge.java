package com.yoyo.pattern.strategy;

/**
 * 融漫通道   充值
 */
public class RMFlowRecharge implements FlowRecharge {
    @Override
    public FlowRechargeState recharge(String mobile, String productid) {
        System.out.println("拼命请求融漫流量充值。。。");
        return new FlowRechargeState("00","充值成功",null);
    }
}
