package main.stationaries;

import java.util.ArrayList;
import java.util.List;

public class RecruitmentKit{

    private List<Stationery> stationeries = new ArrayList<>();

    public RecruitmentKit addNew(Stationery stationery) {
        stationeries.add(stationery);
        return this;
    }

    public List<Stationery> getStationeries() {
        return stationeries;
    }

}