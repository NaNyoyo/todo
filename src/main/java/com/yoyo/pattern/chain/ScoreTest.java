package com.yoyo.pattern.chain;

import java.util.Date;

public class ScoreTest {
    public static void main(String[] args) {
        Mer mer = new Mer("你最美公司","化妆行业",new Date(),"北京市昌平区");//初始化商户信息
        //构造处理链
        ScoreHandler industryHandler = new IndustryScoreHandler();
        ScoreHandler addressHandler = new AddressScoreHandler();
        ScoreHandler registDateHandler = new RegistDateScoreHandler();
        industryHandler.setNext(addressHandler);
        addressHandler.setNext(registDateHandler);

        System.out.println(industryHandler.score(mer));


    }
}
