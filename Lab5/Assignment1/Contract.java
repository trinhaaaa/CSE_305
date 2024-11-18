public interface Contract {
    Contract BuildContractID(String contractID);
    Contract BuildPropertyID(String propertyID);
    Contract BuildTenantID(String tenantID);
    Contract BuildRentAmount(double rentAmount);
    Contract SignContract();
}
