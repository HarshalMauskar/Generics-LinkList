package Model;

public class Details {
    private String brandName;
    private String bikeName ;
    private String modelName;
    private String fuelType;
    private String colour;
    private String mobileNumber;


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String  toString() {
        return "Details{" +
                "brandName='" + brandName + '\'' +
                ", bikeName='" + bikeName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", colour='" + colour + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
