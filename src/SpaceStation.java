import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpaceStation extends SpaceCraft implements Serializable {
    SpaceAddress spaceAddress;
    List<ProductionCompartment> productionCompartments = new ArrayList<>();

    public SpaceStation(String name, SpaceCraftStatus spaceCraftStatus, LocalDate creationDate, SpaceAddress spaceAddress, List<ProductionCompartment> productionCompartments) {
        super(name, spaceCraftStatus, creationDate);
        this.setSpaceAddress(spaceAddress);
        this.productionCompartments = productionCompartments;
    }

    public SpaceAddress getSpaceAddress() {
        return spaceAddress;
    }

    public void setSpaceAddress(SpaceAddress spaceAddress) {
        if(spaceAddress == null || spaceAddress.getCoordinates() == null)
            throw new IllegalArgumentException("Space address or coordinates cannot be null");
        this.spaceAddress = spaceAddress;
    }

    public List<ProductionCompartment> getProductionCompartments() {
        return Collections.unmodifiableList(productionCompartments);
    }

    public void addProductionCompartment(ProductionCompartment productionCompartment) {
        if(productionCompartment == null)
            throw new IllegalArgumentException("ProductionCompartment cannot be null");

        productionCompartments.add(productionCompartment);
    }

    public void removeProductionCompartment(String identificationName) {
        if(identificationName == null || identificationName.isEmpty())
            throw new IllegalArgumentException("IdentificationName cannot be empty");

        ProductionCompartment pc = ProductionCompartment.getByIdentificationName(identificationName);
        if(pc == null)
            throw new IllegalArgumentException("No productionCompartment with that identificationName");

        productionCompartments.remove(pc);
    }

    //TODO SOLUTION: OVERRIDE 2/3
    @Override
    public int getDailyFuelCost() {
        int cost = 0;

        for(ProductionCompartment pc : productionCompartments) {
            cost += pc.getFuelAmountCost();
        }

        return cost;
    }
}
