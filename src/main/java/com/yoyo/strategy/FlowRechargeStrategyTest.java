package com.yoyo.strategy;

public class FlowRechargeStrategyTest {
    public static void main(String[] args) {
        String channelno = "rm";
        String productid = "M10";
       FlowRecharge flowRecharge = FlowChannelType.getFlowRecharge(channelno);
       flowRecharge.recharge("158****3403",productid);
    }


}


