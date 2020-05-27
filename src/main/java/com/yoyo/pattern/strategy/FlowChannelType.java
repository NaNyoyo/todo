package com.yoyo.pattern.strategy;

/**
 * 流量通道枚举
 */
public enum FlowChannelType {
    MDK("mdk",new MDKFlowRecharge()),
    RM("rm",new RMFlowRecharge()),
    JX("jx",new JXFlowRecharge());

    private  String channelno;//通道编码
    private  FlowRecharge flowRecharge;

    FlowChannelType(String channelno, FlowRecharge flowRecharge) {
        this.channelno = channelno;
        this.flowRecharge = flowRecharge;
    }
   //根据通道编码获取对应的流量充值的实现类
    public static FlowRecharge getFlowRecharge(String channelno){
        for (FlowChannelType flowChannelType:FlowChannelType.values()  ) {
            if(flowChannelType.channelno.equals(channelno)){
                return flowChannelType.flowRecharge;
            }
        }
        return null;
    }

}
