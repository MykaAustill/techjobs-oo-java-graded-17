package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public Job() {
        id = nextId;
        nextId++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return Objects.equals(getName(), job.getName()) && Objects.equals(getEmployer(), job.getEmployer()) && Objects.equals(getLocation(), job.getLocation()) && Objects.equals(getPositionType(), job.getPositionType()) && Objects.equals(getCoreCompetency(), job.getCoreCompetency());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmployer(), getLocation(), getPositionType(), getCoreCompetency());
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    @Override
    public String toString() {
        String result = System.lineSeparator() +
                "ID: " + getId() + System.lineSeparator();

        if (getName().isEmpty()) {
            result += "Name: Data not available" + System.lineSeparator();
        } else {
            result += "Name: " + getName() + System.lineSeparator();
        }

        if (getEmployer().getValue().isEmpty()) {
            result += "Employer: Data not available" + System.lineSeparator();
        } else {
            result += "Employer: " + getEmployer().getValue() + System.lineSeparator();
        }

        if (getLocation().getValue().isEmpty()) {
            result += "Location: Data not available" + System.lineSeparator();
        } else {
            result += "Location: " + getLocation().getValue() + System.lineSeparator();
        }

        if (getPositionType().getValue().isEmpty()) {
            result += "Position Type: Data not available" + System.lineSeparator();
        } else {
            result += "Position Type: " + getPositionType().getValue() + System.lineSeparator();
        }

        if (getCoreCompetency().getValue().isEmpty()) {
            result += "Core Competency: Data not available" + System.lineSeparator();
        } else {
            result += "Core Competency: " + getCoreCompetency().getValue() + System.lineSeparator();
        }

        result += System.lineSeparator();
        return result;
    }




    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
