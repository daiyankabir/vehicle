/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author daiya
 */

public class NormalVehicle extends Vehicle {
    private String model_number;
    private Engine enginetype;
    private String enginepower;
    private int tires_size;
	
    @Override
    public String getModelNumber(){
		return model_number;
    }
	
    @Override
    public void setModelNumber(String model_number){
		this.model_number=model_number;
    }

    @Override
    public Engine getEngineType() {
        return enginetype;
    }

    public void setEnginetype(Engine enginetype) {
        this.enginetype = enginetype;
    }
    @Override
	public String getEnginePower() {
        return enginepower;
    }

    @Override
    public void setEnginePower(String enginepower) {
        this.enginepower = enginepower;
    }

    @Override
    public int getTiresSize() {
        return tires_size;
    }

    /**
     *
     * @param tires_size
     */
    @Override
    public void setTiresSize(int tires_size) {
        this.tires_size = tires_size;
    }


    public NormalVehicle(String model_number, Engine enginetype, String enginepower, int tires_size) {
        this.model_number=model_number;
		this.enginetype = enginetype;
		this.enginepower=enginepower;
        this.tires_size = tires_size;
    }


	
}
