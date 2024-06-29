package DesignPatterns.VehicleExample.src.com;

public class MotorCycle implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is body of motor cycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("1 head lights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
