package org.launchcode.techjobs.oo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class JobTest {
    private Job job1;
    private Job job2;

    @Before
    public void setUp() {
        job1= new Job();
        job2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
       Job job1 = new Job("Software Developer", new Employer("Tech Corp"), new PositionType("Full-time"), new CoreCompetency("Java"));
       Job job2 = new Job("Software Developer", new Employer("Tech Corp"), new PositionType("Full-time"), new CoreCompetency("Java"));

        assertNotEquals(job1, job2);
    }
}
