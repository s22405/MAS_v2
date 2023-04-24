import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductionCompartment extends ObjectPlus implements Serializable {
    private static List<ProductionCompartment> allProductionCompartments = new ArrayList<>();

    private String identificationName;
    private ProductionCompartmentType productionCompartmentType;
    private int productionAmount;
    private int fuelAmountCost; //in liters

    public ProductionCompartment(String identificationName, ProductionCompartmentType productionCompartmentType, int productionAmount, int fuelAmountCost) {
        super();
        this.setIdentificationName(identificationName);
        this.setProductionCompartmentType(productionCompartmentType);
        this.setProductionAmount(productionAmount);
        this.setFuelAmountCost(fuelAmountCost);

        allProductionCompartments.add(this);
    }

    public String getIdentificationName() {
        return identificationName;
    }

    public void setIdentificationName(String identificationName) {
        if(identificationName == null || identificationName.isEmpty())
            throw new IllegalArgumentException("IdentificationName cannot be null or empty");

        this.identificationName = identificationName;
    }

    public ProductionCompartmentType getProductionCompartmentType() {
        return productionCompartmentType;
    }

    public void setProductionCompartmentType(ProductionCompartmentType productionCompartmentType) {
        if(productionCompartmentType == null)
            throw new IllegalArgumentException("ProductionCompartmentType cannot be null");

        this.productionCompartmentType = productionCompartmentType;
    }

    public int getProductionAmount() {
        return productionAmount;
    }

    public void setProductionAmount(int productionAmount) {
        if(productionAmount < 0)
            throw new IllegalArgumentException("ProductionAmount cannot be negative");

        this.productionAmount = productionAmount;
    }

    public int getFuelAmountCost() {
        return fuelAmountCost;
    }

    public void setFuelAmountCost(int fuelAmountCost) {
        if(fuelAmountCost < 0)
            throw new IllegalArgumentException("FuelAmountCost cannot be negative");

        this.fuelAmountCost = fuelAmountCost;
    }

    //TODO SOLUTION: STATIC METHOD
    static int getCompartmentTypeAmount(ProductionCompartmentType productionCompartmentType) {
        int amount = 0;
        for(ProductionCompartment pc : allProductionCompartments) {
            if(pc.getProductionCompartmentType() == productionCompartmentType) {
                amount++;
            }
        }

        return amount;
    }

    static ProductionCompartment getByIdentificationName(String identificationName) {
        for(ProductionCompartment pc : allProductionCompartments) {
            if(Objects.equals(pc.getIdentificationName(), identificationName)) {
                return pc;
            }
        }
        return null;
    }
}
