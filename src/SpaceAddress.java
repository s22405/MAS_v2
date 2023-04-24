import java.io.Serializable;

public class SpaceAddress implements Serializable { //because screw coordinates I need a complex attribute
    private String sector;
    private String subSector;
    private int[] coordinates = new int[3];

    public SpaceAddress(String sector, String subSector, int[] coordinates) {
        this.setSector(sector);
        this.setSubSector(subSector);
        this.setCoordinates(coordinates);
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        if(sector == null || sector.isEmpty())
            throw new IllegalArgumentException("Sector cannot be null or empty");
        this.sector = sector;
    }

    public String getSubSector() {
        return subSector;
    }

    public void setSubSector(String subSector) {
        if(subSector == null || subSector.isEmpty())
            throw new IllegalArgumentException("SubSector cannot be null or empty");
        this.subSector = subSector;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int[] coordinates) {
        if(coordinates == null)
            throw new IllegalArgumentException("Coordinates cannot be null");
        this.coordinates = coordinates;
    }
}
