package test;

import main.customComparator.StationeryNameComparator;
import main.customComparator.StationeryPriceComparator;
import main.stationary.RecruitmentKit;
import main.stationary.drawingStationary.Brush;
import main.stationary.drawingStationary.Paint;
import main.stationary.officeStationary.Puncher;
import main.stationary.officeStationary.Stapler;
import main.stationary.writingStationary.Pen;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static junit.framework.TestCase.assertTrue;

public class StationerySortTest {

    private RecruitmentKit recruitmentKit;

    @Before
    public void setUp() {
        recruitmentKit = new RecruitmentKit();
        recruitmentKit.addNew(new Pen(30.1, "Bic")).addNew(new Puncher(10, "Plane"))
                .addNew(new Stapler(34.0, "Able")).addNew(new Brush(35.5, "Painter"))
                .addNew(new Paint(45, "Art"));
    }

    @Test
    public void checkRecruitmentKitsStationarySortingByPriceAndName() {

        Collections.sort(recruitmentKit.getStationeries());
        assertTrue(recruitmentKit.getStationeries().get(0) instanceof Puncher);
        assertTrue(recruitmentKit.getStationeries().get(1) instanceof Pen);
        assertTrue(recruitmentKit.getStationeries().get(2) instanceof Stapler);
        assertTrue(recruitmentKit.getStationeries().get(3) instanceof Paint);
        assertTrue(recruitmentKit.getStationeries().get(4) instanceof Brush);
    }

    @Test
    public void checkRecruitmentKitsStationarySortingByNameUsingCustomComparator() {
        StationeryNameComparator stationeryNameComparator = new StationeryNameComparator();
        Collections.sort(recruitmentKit.getStationeries(), stationeryNameComparator);
        assertTrue(recruitmentKit.getStationeries().get(0) instanceof Stapler);
        assertTrue(recruitmentKit.getStationeries().get(1) instanceof Paint);
        assertTrue(recruitmentKit.getStationeries().get(2) instanceof Pen);
        assertTrue(recruitmentKit.getStationeries().get(3) instanceof Brush);
        assertTrue(recruitmentKit.getStationeries().get(4) instanceof Puncher);
    }

    @Test
    public void checkRecruitmentKitsStationarySortingByPriceUsingCustomComparator(){
        StationeryPriceComparator stationeryPriceComparator = new StationeryPriceComparator();
        Collections.sort(recruitmentKit.getStationeries(), stationeryPriceComparator);
        assertTrue(recruitmentKit.getStationeries().get(0) instanceof Puncher);
        assertTrue(recruitmentKit.getStationeries().get(1) instanceof Pen);
        assertTrue(recruitmentKit.getStationeries().get(2) instanceof Stapler);
        assertTrue(recruitmentKit.getStationeries().get(3) instanceof Brush);
        assertTrue(recruitmentKit.getStationeries().get(4) instanceof Paint);
    }

}