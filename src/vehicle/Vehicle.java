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
enum Engine{Oil,DIESEL,GAS}
public abstract class Vehicle {


    private String model_number;
    private Engine enginetype;
    private String enginepower;
    private int tires_size;

    public abstract String getModelNumber();
	
    public abstract void setModelNumber(String model_number);

    public abstract Engine getEngineType() ;

    public abstract void setEnginetype(Engine enginetype) ;
    
    public abstract String getEnginePower() ;

    public abstract void setEnginePower(String enginepower);

    public abstract int getTiresSize() ;

    public abstract void setTiresSize(int tires_size);



}
