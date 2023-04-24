import java.time.LocalDate;

public class SpaceShipLocation extends ObjectPlus{
    private SpaceAddress spaceAddress;
    private LocalDate date;

    public SpaceShipLocation(SpaceAddress spaceAddress, LocalDate date) {
        super();
        this.setSpaceAddress(spaceAddress);
        this.setDate(date);
    }

    public SpaceAddress getSpaceAddress() {
        return spaceAddress;
    }

    public void setSpaceAddress(SpaceAddress spaceAddress) {
        if(spaceAddress == null)
            throw new IllegalArgumentException("SpaceAddress cannot be null");

        this.spaceAddress = spaceAddress;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        if(date == null)
            throw new IllegalArgumentException("Date cannot be null");

        this.date = date;
    }
}
