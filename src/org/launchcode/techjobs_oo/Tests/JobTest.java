package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_jobOne;
    Job test_jobTwo;
    Job test_jobThree;
@Before
public void createJobObject() {test_jobTwo = new Job();}
     {test_jobOne = new Job();}

@Test
    public void testSettingJobId() {
    assertEquals(1, test_jobOne.getId(), .001);
    assertTrue(test_jobOne.getId() != test_jobTwo.getId());
    assertEquals(test_jobOne.getId() + 1, test_jobTwo.getId(), .001);

}
@Test
    public void testJobConstructorSetsAllFields() {
    Job test_jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
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
    Job test_jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job test_jobFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(test_jobThree.equals(test_jobFour));
}
}
