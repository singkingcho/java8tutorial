package com.sz.db;

import com.sz.model.AirCompany;
import com.sz.model.AirLine;

public class CustomDB {


    private static AirCompany[] airCompanies = new AirCompany[100];

    private static AirLine[] airLines = new AirLine[100];


    public static AirCompany[] getAirCompanies() {
        return airCompanies;
    }

    public static void setAirCompanies(AirCompany[] airCompanies) {
        CustomDB.airCompanies = airCompanies;
    }

    public static AirLine[] getAirLines() {
        return airLines;
    }

    public static void setAirLines(AirLine[] airLines) {
        CustomDB.airLines = airLines;
    }
}
