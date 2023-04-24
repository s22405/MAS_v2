import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpaceShip extends SpaceCraft implements Serializable {
    int largeEngineAmount;
    int smallEngineAmount;
    List<SpaceShipLocation> spaceShipLocationHistory;

    public SpaceShip(String name, SpaceCraftStatus spaceCraftStatus, LocalDate creationDate, int largeEngineAmount, int smallEngineAmount, ArrayList<SpaceShipLocation> spaceShipLocationHistory) {
        super(name, spaceCraftStatus, creationDate);
        this.setLargeEngineAmount(largeEngineAmount);
        this.setSmallEngineAmount(smallEngineAmount);
        this.spaceShipLocationHistory = spaceShipLocationHistory;
    }

    public int getLargeEngineAmount() {
        return largeEngineAmount;
    }

    public void setLargeEngineAmount(int largeEngineAmount) {
        if(largeEngineAmount < 0)
            throw new IllegalArgumentException("LargeEngineAmount cannot be negative");

        this.largeEngineAmount = largeEngineAmount;
    }

    public int getSmallEngineAmount() {
        return smallEngineAmount;
    }

    public void setSmallEngineAmount(int smallEngineAmount) {
        if(smallEngineAmount < 0)
            throw new IllegalArgumentException("SmallEngineAmount cannot be negative");

        this.smallEngineAmount = smallEngineAmount;
    }

    public List<SpaceShipLocation> getSpaceShipLocationHistory() {
        return Collections.unmodifiableList(spaceShipLocationHistory);
    }

    public void addSpaceShipLocation(SpaceShipLocation spaceShipLocation) {
        if(spaceShipLocation == null)
            throw new IllegalArgumentException("SpaceShipLocation cannot be null");

        spaceShipLocationHistory.add(spaceShipLocation);
    }

//    public void removeLatestSpaceShipLocation() {
//        if(spaceShipLocationHistory.size() < 2)
//            throw new IllegalArgumentException("Location history cannot be empty");
//
//        spaceShipLocationHistory.get(spaceShipLocationHistory.size()-1).
//    }

    //TODO SOLUTION: OVERRIDE 3/3
    @Override
    public int getDailyFuelCost() {
        return smallEngineAmount*50 + largeEngineAmount*100;
    }
}
