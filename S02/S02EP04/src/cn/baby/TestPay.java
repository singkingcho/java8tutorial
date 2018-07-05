package cn.baby;

public class TestPay {


    public static void main(String[] args) {
        AliPay aliPay = new AliPay();
        aliPay.pay();

        WechatPay wechatPay = new WechatPay();
        wechatPay.pay();
    }
}
