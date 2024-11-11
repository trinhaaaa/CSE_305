public class ContractBuilder {
    public Contract createContract(String contractType, String contractID, String propertyID, String tenantID, double rentAmount) {
        Contract contract;
        switch (contractType) {
            case "Permanent":
                contract = new Permanent();
                break;
            case "LongTerm":
                contract = new LongTerm();
                break;
            case "ShortTerm":
                contract = new ShortTerm();
                break;
            default:
                throw new IllegalArgumentException("Unknown contract type");
        }

        return contract
                .BuildContractID(contractID)
                .BuildPropertyID(propertyID)
                .BuildTenantID(tenantID)
                .BuildRentAmount(rentAmount)
                .SignContract();
    }
}
