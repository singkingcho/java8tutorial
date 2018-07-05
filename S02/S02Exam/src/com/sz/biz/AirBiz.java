package com.sz.biz;

import com.sz.model.AirCompany;
import com.sz.model.AirLine;

/**
 * 航空业务接口
 */
public interface AirBiz {


    /**
     * 欢迎方法
     */
    void welcome();

    /**
     * 菜单方法
     */
    int menu();


    /**
     * 查询所有的航空公司
     */
    void selectAllAirCompany();

    void selectAllAirLines();

    AirLine selectAirLineByNo(String no);

    void addAirCompany();

    void addAirCompany(AirCompany airCompany);

    /**
     * 根据航空公司的代号判断数据库当中是否已经存在该航空公司的信息
     * 返回true，代表却是已经存在
     * 返回false,代表不存在
     * @return
     */
    boolean isAirComapanyExists(String aid);
}
