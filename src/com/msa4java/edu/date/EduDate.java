package com.msa4java.edu.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class EduDate {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); //현재시간 획득
        LocalDateTime targetDate = LocalDateTime.of(2026, 5, 1, 23,18,59);
        LocalDateTime parsed = LocalDateTime.parse("2026-05-01T23:18:28");

        LocalDateTime addOneDayByNow = now.plusDays(1);
        System.out.println(now.plusDays(1));
        System.out.println(now);

            //상대적인 날짜이동 (TemporalAdjusters)
            LocalDateTime fistDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
            LocalDateTime lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
            LocalDateTime nextMonday = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));


        //날짜 비교
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2024, 9,12);
        System.out.println(d1.isBefore(d2));
        System.out.println(d1.isAfter(d2));
        System.out.println(d1.isEqual(d2));

        // Period 객체
        Period p1 = Period.between(d1, d2);
        System.out.println(Math.abs(p1.getYears()));
        System.out.println(Math.abs(p1.getMonths()));
        System.out.println(Math.abs(p1.getDays()));

        //단계별 차이
        long untilDays = d1.until(d2, ChronoUnit.DAYS);
        System.out.println(Math.abs(untilDays));

        //데이트 포멧 (DateTimeFormatter)
        //날짜 객체 -> 문자열로 포멧
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String strNow = now.format(format1);
        System.out.println(strNow);

        //문자열 -> 날짜객체
        String createdAt = "2025-06-20 14:33:20";
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(createdAt, format2);
        System.out.println(ldt);

        //LocalDateTime  -> LocalDate 추출
        LocalDate ldtTold = ldt.toLocalDate();

    }
}
