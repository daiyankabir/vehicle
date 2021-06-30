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
public class SportsVehicle extends Vehicle {
    private String model_number;
    private Engine enginetype;
    private String enginepower;
    private int tires_size;
    private String turbo;
    @Override
    public String getModelNumber(){
		return model_number;
	}
	
    @Override
	public void setModelNumber(String model_number){
		this.model_number=model_number;
	}

    /**
     *
     * @return
     */
    @Override
    public Engine getEngineType() {
        return enginetype;
    }

    /**
     *
     * @param enginetype
     */
    @Override
    public void setEnginetype(Engine enginetype) {
        this.enginetype = enginetype;
    }

    /**
     *
     * @return
     */
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

    @Override
    public void setTiresSize(int tires_size) {
        this.tires_size = tires_size;
    }
	
	public String getTurbo(){
		return turbo;
	}
	
	public void setTurbo(String turbo)
	{
		this.turbo=turbo;
	}


    public SportsVehicle(String model_number, Engine enginetype, String enginepower, int tires_size, String turbo) {
        this.model_number=model_number;
		this.enginetype = enginetype;
		this.enginepower=enginepower;
        this.tires_size = tires_size;
		this.turbo=turbo;
    }	
	
}
