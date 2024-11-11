public class ShortTerm implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public Contract BuildContractID(String contractID) {
        this.contractID = contractID;
        return this;
    }

    @Override
    public Contract BuildPropertyID(String propertyID) {
        this.propertyID = propertyID;
        return this;
    }

    @Override
    public Contract BuildTenantID(String tenantID) {
        this.tenantID = tenantID;
        return this;
    }

    @Override
    public Contract BuildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    @Override
    public Contract SignContract() {
        System.out.println("Permanent Contract signed with details: " + this.toString());
        return this;
    }

    @Override
    public String toString() {
        return "Permanent{" +
                "contractID='" + contractID + '\'' +
                ", propertyID='" + propertyID + '\'' +
                ", tenantID='" + tenantID + '\'' +
                ", rentAmount=" + rentAmount +
                '}';
    }

}
