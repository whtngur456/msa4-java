package com.msa4java.edu.enumeration;

public enum  Week {
    // private Week MONDAY = new Week("월요일")
    //           ""                      //
    MONDAY("월요일")
    ,TUESDAY("화요일")
    ,WEDNESDAY("수요일")
    ,THURSDAY("목요일")
    ,FRIDAY("금요일")
    ,SATURDAY("토요일")
    ,SUNDAY("일요일");

    private final String krDay;

    private Week(String day) {
        this.krDay = day;
    }

    // Better
    public String getKrDay() {
        return this.krDay;
    }
}
