package com.mountbet.betservice.dto;

import javax.validation.constraints.NotNull;
import java.util.Set;

public class GetPastBetIdByMarketIdsDTO {
    private String selectColumns;

    private Set<String> state;

    private Set<String> marketIdsSet;

    @NotNull
    private Long accountId;

    private TimeRange timeRange;

    public String getSelectColumns() {
        return selectColumns;
    }

    public void setSelectColumns(String selectColumns) {
        this.selectColumns = selectColumns;
    }

    public Set<String> getState() {
        return state;
    }

    public void setState(Set<String> state) {
        this.state = state;
    }

    public Set<String> getMarketIdsSet() {
        return marketIdsSet;
    }

    public void setMarketIdsSet(Set<String> marketIdsSet) {
        this.marketIdsSet = marketIdsSet;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public TimeRange getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
    }

    @Override
    public String toString() {
        return "GetPastBetIdByMarketIdsDTO{" +
                "selectColumns='" + selectColumns + '\'' +
                ", state=" + state +
                ", marketIdsSet=" + marketIdsSet +
                ", accountId=" + accountId +
                ", timeRange=" + timeRange +
                '}';
    }
}
