package com.lt.pattern.flyweight.example;

/**
 * @author lt
 * @date 2022/10/6 11:39
 * @describe
 */
public class Client {

    public static void main(String[] args) {
        ITicket iTicket = TicketFactory.queryTicket("成都", "镇子镇");
        iTicket.showInfo("软卧");
        ITicket iTicket1 = TicketFactory.queryTicket("成都", "牛佛镇");
        iTicket1.showInfo("软卧");
        ITicket iTicket2 = TicketFactory.queryTicket("成都", "安岳县");
        iTicket2.showInfo("软卧");
    }
}
