package org.launchcode.techjobs_oo;


import java.util.Objects;


public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Object employer, Object location, Object positionType, Object coreCompetency) {

        this();
        this.name = name;
        this.employer = (Employer) employer;
        this.location = (Location) location;
        this.positionType = (PositionType) positionType;
        this.coreCompetency = (CoreCompetency) coreCompetency;

    }

    @Override
    public String toString() {

//        if (getName().equals("Data not available") && getEmployer().getValue().equals("Data not available") && getLocation().getValue().equals("Data not available") && getPositionType().getValue().equals("Data not available") && getCoreCompetency().getValue().equals("Data not available")) {
//            System.out.println("OOPS! This job does not seem to exist.");
//        }
        if (getName() == null || getName().equals("")){
            setName("Data not available");
        }
        if (getEmployer().getValue() == null || (getEmployer().getValue().equals(""))){
            getEmployer().setValue("Data not available");
        }
        if (getLocation().getValue() == null || (getLocation().getValue().equals(""))) {
            getLocation().setValue("Data not available");
        }
        if (getPositionType().getValue() == null || (getPositionType().getValue().equals(""))) {
            getPositionType().setValue("Data not available");
        }
        if (getCoreCompetency().getValue() == null || (getCoreCompetency().getValue().equals(""))) {
            getCoreCompetency().setValue("Data not available");
        }




        return "\n" + "ID: " + getId() + "\n" + "Name: " + getName() + "\n" +
                "Employer: " + getEmployer() + "\n" + "Location: " + getLocation() + "\n" + "Position Type: " + getPositionType() +
                "\n" + "Core Competency: " + getCoreCompetency() + "\n";
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

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
}
