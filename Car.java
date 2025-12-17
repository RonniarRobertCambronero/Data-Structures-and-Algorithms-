class Car {

    
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    
    public void setCompanyName(String company) {
        company_name = company;
    }

    public void setModelName(String model) {
        model_name = model;
    }

    public void setYear(int carYear) {
        year = carYear;
    }

    public void setMileage(double carMileage) {
        mileage = carMileage;
    }

    
    public String getCompanyName() {
        return company_name;
    }

    public String getModelName() {
        return model_name;
    }

    public int getYear() {
        return year;
    }

    
    public double getMileage() {
        return mileage;
    }

    
    public static void main(String[] args) {
        Car car = new Car();

        car.setCompanyName("Toyota");
        car.setModelName("Vios");
        car.setYear(2023);
        car.setMileage(18.5);

        System.out.println("Company Name: " + car.getCompanyName());
        System.out.println("Model Name: " + car.getModelName());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage: " + car.getMileage() + " km/L");
    }
}