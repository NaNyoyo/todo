package com.yoyo.strategy;

/**
 * 流量充值接口
 */
public interface FlowRecharge {
    /**
     *
     * @param mobile 手机号
     * @param productid 产品id
     * @return
     */
  FlowRechargeState recharge(String mobile,String productid);

}
