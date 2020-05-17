package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    private Job test_jobOne;
    private Job test_jobTwo;
    private Job test_jobThree;
    private Job test_jobFour;
    private Job test_JobFive;

@Before
public void createJobObject() {
    test_jobOne = new Job();
    test_jobTwo = new Job();
    test_jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    test_jobFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    test_JobFive = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
}

@Test
public void testSettingJobId() {
    assertEquals(31, test_jobOne.getId(), .001);
    assertTrue(test_jobOne.getId() != test_jobTwo.getId());
    assertEquals(test_jobOne.getId() + 1, test_jobTwo.getId(), .001);

}
@Test
    public void testJobConstructorSetsAllFields() {
    assertEquals("Product tester", test_jobThree.getName());

    assertEquals("ACME", test_jobThree.getEmployer().getValue());
    assertTrue(test_jobThree.getEmployer() instanceof Employer);

    assertEquals("Desert", test_jobThree.getLocation().getValue());
    assertTrue(test_jobThree.getLocation() instanceof Location);

    assertEquals("Quality control", test_jobThree.getPositionType().getValue());
    assertTrue(test_jobThree.getPositionType() instanceof PositionType);

    assertEquals("Persistence", test_jobThree.getCoreCompetency().getValue());
    assertTrue(test_jobThree.getCoreCompetency() instanceof CoreCompetency);

}
@Test
public void testJobsForEquality() {
    assertFalse(test_jobThree.equals(test_jobFour));
}

@Test
public void firstAndLastLineInToStringMethodReturnsBlank() {
    assertTrue(test_jobThree.toString().startsWith("\n"));
    assertTrue(test_jobThree.toString().endsWith("\n"));
}

@Test
public void stringContainsALabelForEachFieldFollowedByData() {
    assertEquals( "\n" + "ID: " + test_jobThree.getId() + "\n" + "Name: " + "Product tester" + "\n" +
            "Employer: " + "ACME" + "\n" + "Location: " + "Desert" + "\n" + "Position Type: " + "Quality control" +
            "\n" + "Core Competency: " + "Persistence" + "\n", test_jobThree.toString());
}

@Test
public void ifFieldIsEmptyToStringReturnsDataNotAvailable() {
    assertEquals("\n" + "ID: " + test_JobFive.getId() + "\n" + "Name: " + test_JobFive.getName() + "\n" +
            "Employer: " + "Data not available" + "\n" + "Location: " + test_JobFive.getLocation() + "\n" + "Position Type: " + test_JobFive.getPositionType() +
            "\n" + "Core Competency: " + test_JobFive.getCoreCompetency() + "\n", test_JobFive.toString());
}

@Test
public void ifJobContainsIdOnlyPrintWarning() {
    assertEquals("OOPS! This job does not seem to exist.", test_JobFive.toString());
}

}
