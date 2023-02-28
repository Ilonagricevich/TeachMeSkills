package Task2;

public class Cars {

    private String model;
    private String color;
    private int productionYear;
    private int maxSpeed;

    public Cars() {
        model = "Unknown";
        color = "Unknown";

    }

    public Cars(String model, String color, int productionYear, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed() {
        this.maxSpeed = maxSpeed;
    }

    static Cars defineTheOldestCare(Cars[] cars, Cars[] cars2) {
        Cars theOldestCar = cars[0];
        for (int i = 0; i < cars.length; i++) {
            if (theOldestCar.maxSpeed < cars[i].maxSpeed) {
                if (theOldestCar.maxSpeed < cars2[i].maxSpeed) {
                    theOldestCar = cars2[i];
                }
                if (cars[i].maxSpeed < cars2[i].maxSpeed) {
                    cars[i] = cars2[i];
                }
            }
        }
        return theOldestCar;
    }

    public Cars defineTheFastestCar(Cars[] cars, Cars[] cars2) {
        Cars theFastestCar = cars[0];
        for (int i = 0; i < cars.length; i++) {
            if (theFastestCar.maxSpeed > cars[i].maxSpeed) {
                if (theFastestCar.maxSpeed > cars2[i].maxSpeed) {
                    theFastestCar = cars2[i];
                }
                if (cars[i].maxSpeed > cars2[i].maxSpeed) {
                    cars[i] = cars2[i];
                }
            }
        }
        return theFastestCar;

    }
}
