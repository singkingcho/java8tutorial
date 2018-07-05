package com.sz.app;


import com.sz.biz.AirBiz;
import com.sz.biz.impl.AirBizImpl;
import com.sz.db.CustomDB;
import com.sz.model.AirCompany;
import com.sz.model.AirLine;

import java.util.Date;
import java.util.Scanner;

/**
 * 入口程序
 */
public class Main {

    static{
        init();
    }

    private static void init() {
        // 初始化航空公司数据
        AirCompany[] airCompanies = CustomDB.getAirCompanies();
        AirCompany airCompany = new AirCompany("a01","深圳航空公司");
        AirCompany airCompany2 = new AirCompany("a02","广州航空公司");
        AirCompany airCompany3 = new AirCompany("a03","上海航空公司");
        AirCompany airCompany4 = new AirCompany("a04","北京航空公司");
        airCompanies[0] = airCompany;
        airCompanies[1] = airCompany2;
        airCompanies[2] = airCompany3;
        airCompanies[3] = airCompany4;

        // 初始化航班数据
        // Date startDate, String no, String startPlace, String endPlace, double price, String aid
        Date date = new Date();
        AirLine al = new AirLine(date,"L01","深圳","上海",2000.0,"a01");
        AirLine al2 = new AirLine(date,"L02","深圳","北京",2200.0,"a01");
        AirLine al3 = new AirLine(date,"L03","广州","上海",1000.0,"a02");
        AirLine al4 = new AirLine(date,"L04","北京","上海",3000.0,"a04");
        AirLine al5 = new AirLine(date,"L05","上海","广州",800.0,"a03");
        AirLine al6 = new AirLine(date,"L06","上海","深圳",1800.0,"a03");

        AirLine[] airLines = CustomDB.getAirLines();
        airLines[0] = al;
        airLines[1] = al2;
        airLines[2] = al3;
        airLines[3] = al4;
        airLines[4] = al5;
        airLines[5] = al6;



    }


    public static void main(String[] args) {
        AirBiz airBiz = new AirBizImpl();
        airBiz.welcome();

       while (true){
           int choice = airBiz.menu();
           switch (choice){
               case  0 :
                   // 退出程序
                   System.out.println("谢谢使用!");
                   System.exit(1);
                   break;
               // 查询所有的航空公司
               case  1 :
                   airBiz.selectAllAirCompany();
                   break;
               case  2 :
                   airBiz.selectAllAirLines();
                   break;
               case  3 :
                   Scanner scanner = new Scanner(System.in);
                   System.out.println("请输入航班的编号：");
                   String no = scanner.next();
                   AirLine airLine = airBiz.selectAirLineByNo(no);
                   if(airLine == null){
                       System.out.println("对不起，不存在该航班！");
                   } else {
                       System.out.println("航班具体信息如下：");
                       System.out.println(airLine);
                   }
                   break;
               case  4 :
                   //
                   airBiz.addAirCompany();
                   break;
               case  5 :
                   break;
               case  6 :
                   break;
           }
       }

    }
}
