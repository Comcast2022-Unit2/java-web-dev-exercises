package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car teslaModelX;

    @Before
    public void createCarObject() {
        teslaModelX = new Car("Tesla", "Model X", 20, 70);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testCarConstructorSetsGasTankLevel() {
        // What do we expect the value of gasTankLevel to be set to?
        // Expected gasTankLevel: 20
        // Actual gasTankLevel: teslaModelX.getGasTankLevel()
        assertEquals(20, teslaModelX.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankLevelAfterDriving() {
        teslaModelX.drive(50);
        assertEquals(19.28571, teslaModelX.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception



}
