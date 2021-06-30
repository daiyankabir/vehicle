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
public class HeavyVehicle extends Vehicle {
    private String model_number;
    private Engine enginetype;
    private String enginepower;
    private int tires_size;
	private String weight;
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

    /**
     *
     * @param enginepower
     */
    @Override
    public void setEnginePower(String enginepower) {
        this.enginepower = enginepower;
    }

    @Override
    public int getTiresSize() {
        return tires_size;
    }

    @Override
    public void setTiresSize(int tires_size) {
        this.tires_size = tires_size;
    }
	
	public String getWeight(){
		return weight;
	}
	
	public void setTurbo(String weight)
	{
		this.weight=weight;
	}


    public HeavyVehicle(String model_number, Engine enginetype, String enginepower, int tires_size, String weight) {
        this.model_number=model_number;
		this.enginetype = enginetype;
		this.enginepower=enginepower;
        this.tires_size = tires_size;
		this.weight=weight;
    }	
		

  
}
