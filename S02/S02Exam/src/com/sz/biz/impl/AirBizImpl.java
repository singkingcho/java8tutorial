package com.sz.biz.impl;

import com.sz.biz.AirBiz;
import com.sz.db.CustomDB;
import com.sz.model.AirCompany;
import com.sz.model.AirLine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AirBizImpl implements AirBiz {

    private Scanner scanner = new Scanner(System.in);
    @Override
    public void welcome() {
        System.out.println("欢迎来到复仇者航空联盟！");
        System.out.println("本系统提供如下服务：");
    }

    @Override
    public int menu() {
        System.out.println("1查询所有航空公司  2查询所有的航班 3根据班次查询航班 4添加航空公司 5添加航空班次 6修改指定航空班次的信息 0 退出系统");
        while(true){
            try {
                int choice = scanner.nextInt();
                if(choice < 0 || choice > 6){
                    System.out.println("没有这项服务，请重新输入");
                    System.out.println("1查询所有航空公司  2查询所有的航班 3根据班次查询航班 4添加航空公司 5添加航空班次 6修改指定航空班次的信息 0 退出系统");
                } else {
                    return choice;
                }
            } catch (InputMismatchException e){
                System.out.println("您输入有误，请重新输入");
                System.out.println("1查询所有航空公司  2查询所有的航班 3根据班次查询航班 4添加航空公司 5添加航空班次 6修改指定航空班次的信息 0 退出系统");
                scanner.next();
            }
        }

    }

    @Override
    public void selectAllAirCompany() {
        AirCompany[] airCompanies = CustomDB.getAirCompanies();
        System.out.println("所有的航空公司信息如下：\n航空公司代号\t航空公司名称");
        for(int i = 0; i < airCompanies.length ; i++) {
            if(airCompanies[i] == null)
                break;
            System.out.println(airCompanies[i].getAid() + "\t\t\t\t" + airCompanies[i].getName());
//            System.out.println();
        }

    }

    @Override
    public void selectAllAirLines() {
        AirLine[] airLines = CustomDB.getAirLines();
        System.out.println("所有的航班信息如下：\n航空公司代号\t班次代号\t起飞时间\t起飞地点\t降落地点\t机票价格");
        for(int i = 0 ; i < airLines.length ; i++){
            if(airLines[i] == null)
                break;
            System.out.println(airLines[i]);
        }
    }

    @Override
    public AirLine selectAirLineByNo(String no) {
        AirLine[] airLines = CustomDB.getAirLines();
        for(int i = 0 ; i < airLines.length ; i ++) {
            if(airLines[i] == null)
                return null;
            if(airLines[i].getNo().equals(no)){
                return airLines[i];
            }
        }
        return null;
    }

    @Override
    public void addAirCompany() {
        while (true){
            System.out.println("请输入航空公司代号：");
            //
            String aid = scanner.next();
            boolean airComapanyExists = isAirComapanyExists(aid);
            if(airComapanyExists){
                System.out.println("对不起，该航空公司已经存在，请尝试输入其它代号。");
                continue;
            } else{
                System.out.println("请输入航公公司名称");
                String name=  scanner.next();
                AirCompany airCompany = new AirCompany(aid,name);

                // 添加操作
                addAirCompany(airCompany);
                break;
            }
        }


    }

    @Override
    public void addAirCompany(AirCompany airCompany) {
        AirCompany[] airCompanies = CustomDB.getAirCompanies();
        for(int i = 0 ; i < airCompanies.length ; i ++){
             if(airCompanies[i] == null){
                 airCompanies[i] = airCompany;
                 System.out.println("添加成功！");
                 break;
             }
        }
    }




    @Override
    public boolean isAirComapanyExists(String aid) {
        AirCompany[] airCompanies = CustomDB.getAirCompanies();
        for(int i = 0 ; i < airCompanies.length ; i++){
            if(airCompanies[i] == null)
                return false;

            if(airCompanies[i].getAid().equals(aid)){
                return true;
            }
        }
        return false;
    }
}











