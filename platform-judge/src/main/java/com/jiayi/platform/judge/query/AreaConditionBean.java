package com.jiayi.platform.judge.query;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
public class AreaConditionBean {
    private String condName;
    private Set<String> tableNameList;
    private Long recentBeginHours;
    private Long recentEndHours;
    private Long recentBeginDate;
    private Long recentEndDate;
//    private Long recentDaysBeginHours;
//    private Long recentDaysEndHours;
//    private Long recentDaysBeginDate;
//    private Long recentDaysEndDate;
    private Long beginHours;
    private Long endHours;
    private Long beginDate;
    private Long endDate;
//    private Set<Long> gridList;
    private Set<Long> deviceIdList;
}
