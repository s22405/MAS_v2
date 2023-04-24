import java.time.LocalDate;

public class SpaceShipAtSpaceStation extends ObjectPlus{
    LocalDate arrivalDate;
    LocalDate departureDate; //nullable
    SpaceStation spaceStation;
    SpaceShip spaceShip;

    public SpaceShipAtSpaceStation(LocalDate arrivalDate, SpaceStation spaceStation, SpaceShip spaceShip) {
        super();
        this.setArrivalDate(arrivalDate);
        this.setDepartureDate(null);
        this.setSpaceStation(spaceStation);
        this.setSpaceShip(spaceShip);
    }

    public SpaceShipAtSpaceStation(LocalDate arrivalDate, SpaceStation spaceStation, SpaceShip spaceShip, LocalDate departureDate) {
        this.setArrivalDate(arrivalDate);
        this.setDepartureDate(departureDate);
        this.setSpaceStation(spaceStation);
        this.setSpaceShip(spaceShip);
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        if(arrivalDate == null)
            throw new IllegalArgumentException("ArrivalDate cannot be null");

        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) { //nullable
        if(departureDate == null)
            throw new IllegalArgumentException("DepartureDate cannot be null");

        this.departureDate = departureDate;
    }

    public SpaceStation getSpaceStation() {
        return spaceStation;
    }

    public void setSpaceStation(SpaceStation spaceStation) {
        if(spaceStation == null)
            throw new IllegalArgumentException("SpaceStation cannot be null");

        this.spaceStation = spaceStation;
    }

    public SpaceShip getSpaceShip() {
        return spaceShip;
    }

    public void setSpaceShip(SpaceShip spaceShip) {
        if(spaceShip == null)
            throw new IllegalArgumentException("SpaceShip cannot be null");

        this.spaceShip = spaceShip;
    }
}
