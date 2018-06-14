import java.util.Scanner;

public class HungaryHorse {


    public static void main(String[] args) {

        // 模拟数组
        // 1 商家
//        int salesLen = 3;
        String[] sales = new String[50];

//        int customersLen = 3;
        // 2 客户
        String[] customers = new String[50];

        // 商家要卖东西
        // 3 商品  使用一个标记
        String[][] products = new String[50][];
        double[][] pricies = new double[50][];
        // 4 订单
        String[] orders  = new String[300];
        // 138****1311
        // 网*锤
        // 初始化一些数据

        // v 3 v 4
        sales[0] = "刘老板长沙臭豆腐";
        sales[1] = "张师傅潮州牛腩面";
        sales[2] = "李大嘴陕西肉夹馍店";

        customers[0] = "雷达文";
        customers[1] = "何琦";
        customers[2] = "杨浩伟";

        products[0] = new String[2];
        products[0][0] = "红皮臭豆腐";
        products[0][1] = "黑皮臭豆腐";
//        products[0][2] = "绿皮臭豆腐";
        pricies[0] = new double[2];

        pricies[0][0] = 33.3;
        pricies[0][1] = 44.6;
//        pricies[0][2] = 55.3;



        products[1] = new String[3];
        products[1][0] = "牛腩细面";
        products[1][1] = "加多宝";
        products[1][2] = "剁椒";

        pricies[1] = new double[3];
        pricies[1][0] = 30.0;
        pricies[1][1] = 5;
        pricies[1][2] = 2;


        products[2] = new String[1];
        products[2][0] = "肉夹馍";
        pricies[2] = new double[1];
        pricies[2][0] = 15;


        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎适用饿了马.");
        System.out.println("现有如下商家入住本平台：");
        for(int i = 0 ; i < sales.length ; i ++) {
            if(sales[i] == null)
                break;
            System.out.println("第" + (i+1) + "家商铺："  + sales[i]);
        }
        System.out.println("请选择商铺购买您心爱的美味商家：");
        int saleChoice = scanner.nextInt();

        int count = 0;
        // 一它到底买了几样商品, 每样买了多少,总价钱是多少.
        int productUseLen = products[saleChoice-1].length ;
        for(int i = 0 ; i < products[saleChoice-1].length ; i ++) {
            if(products[saleChoice-1][i] == null){
                productUseLen = i + 1;
                break;
            }
        }



        // 声明一个数组布尔值,记录指定商品(用户有没有买过)
        boolean[] hasBuy = new boolean[productUseLen];
        // 指定商品购买的次数
        int[] buyCount = new int[productUseLen];
        while(true){
            System.out.println("尊敬的用户您好，以下是" + sales[saleChoice-1] + "的菜品展示：");
            for(int i = 0 ; i < products[saleChoice-1].length; i ++) {
                System.out.println("商品名：" + (i+1) + "." + products[saleChoice-1][i] + "：\t" + pricies[saleChoice-1][i]);
            }
            System.out.println("请选择商品(1.2.3...):");
            int choice = scanner.nextInt();
            // 知道买的是哪个商品

            // 修改是否购买的状态
            hasBuy[choice-1] = true;
            System.out.println("请选择份数:");
            int countAnswer = scanner.nextInt();
            // 买了几份
            buyCount[choice-1] += countAnswer;

            System.out.println("请问需要继续点餐吗 (y/n)?");
            String answer = scanner.next();
            if(answer.equalsIgnoreCase("n")){
                break;
            }
        }

        String orderMsg = "";
        double totalPrice = 0.0;
        for(int i = 0 ; i < hasBuy.length ; i ++) {
            if(hasBuy[i]) {
                orderMsg += products[saleChoice-1][i] + "," + buyCount[i] + "份,";
                totalPrice += pricies[saleChoice-1][i] * buyCount[i];
            }
        }
        orderMsg += ",总价格:" + totalPrice;

        for(int i = 0 ; i < orders.length; i ++){
            if(orders[i] == null) {
                orders[i] = orderMsg;
                break;
            }
        }

        System.out.println("订单如下:");

        for( int i = 0 ; i < orders.length ; i++) {
            if(orders[i ] == null)
             break;
            System.out.println(orders[i]);
        }
    }
}


















