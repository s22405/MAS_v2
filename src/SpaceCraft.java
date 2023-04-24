import java.io.Serializable;
import java.time.LocalDate;

public class SpaceCraft extends ObjectPlus implements Serializable {
    private String name;
    private SpaceCraftStatus spaceCraftStatus;
    private LocalDate creationDate;

    public SpaceCraft(String name, SpaceCraftStatus spaceCraftStatus, LocalDate creationDate) {
        super();
        this.setName(name);
        this.setSpaceCraftStatus(spaceCraftStatus);
        this.setCreationDate(creationDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty())
            throw new IllegalArgumentException("Name cannot be null or empty");
        this.name = name;
    }

    public SpaceCraftStatus getSpaceCraftStatus() {
        return spaceCraftStatus;
    }

    public void setSpaceCraftStatus(SpaceCraftStatus spaceCraftStatus) {
        if(spaceCraftStatus == null)
            throw new IllegalArgumentException("SpaceCraftStatus cannot be null");
        this.spaceCraftStatus = spaceCraftStatus;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        if(creationDate == null)
            throw new IllegalArgumentException("CreationDate cannot be null");
        this.creationDate = creationDate;
    }

    //getAge()
    //getDailyFuelCost()
    //TODO SOLUTION: OVERRIDE 1/3
    public int getDailyFuelCost() {
        return 0;
    }
}
