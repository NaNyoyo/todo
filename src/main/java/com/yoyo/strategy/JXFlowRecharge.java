package com.yoyo.strategy;

/**
 * 极信通道 充值
 */
public class JXFlowRecharge implements FlowRecharge {
    @Override
    public FlowRechargeState recharge(String mobile, String productid) {
        System.out.println("拼命请求极信流量充值。。。");
        return new FlowRechargeState("00","充值成功",null);
    }
}

