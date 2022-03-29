/* 
 * Author: Sebastian Rivera
 * Referenced from PersonalData by Nathan Eheart
 */
package Equipment;

public class EquipmentData 
{
    public EquipmentData(String vMake, String vModel,String vYear,String vType,String vEngine, String vTransmission,String vTotalWeight, String vFrontWeight,String vRearWeight,String vEquipmentType,int vID,String vDateOfOwnership)
    {
        this.makeVehicle = vMake;
        this.modelVehicle = vModel;
        this.yearVehicle = vYear;
        this.typeVehicle = vType;
        this.typeEngine = vEngine;
        this.typeTransm = vTransmission;
        this.totalWeight = vTotalWeight;
        this.frontWeight = vFrontWeight;
        this.rearWeight = vRearWeight;
        this.typeEquip = vEquipmentType;
        this.idVehicle = vID;
        this.dateOwn = vDateOfOwnership;
         
    }

public void setMake(String vMake){
   this.makeVehicle = vMake; 
}

public String getMake(){
    return this.makeVehicle;
}

public void setModel(String vModel){
    this.modelVehicle = vModel;
}

public String getModel(){
    return this.modelVehicle;
}

public void setVYear(String vYear){
    this.yearVehicle = vYear;
}

public String getVYear(){
    return this.yearVehicle;
}

public void setVType(String vType){
    this.typeVehicle = vType;
}

public String getVType(){
    return this.typeVehicle;
}

public void setVEngine(String vEngine){
     this.typeEngine = vEngine;
}

public String getVEngine(){
    return this.typeEngine;
}

public void setVTransm(String vTransmission){
    this.typeTransm = vTransmission;
}

public String getVTransm(){
    return this.typeTransm;
}

public void setTotalWeight(String vTotalWeight){
    this.totalWeight = vTotalWeight;
}

public String getTotalWeight(){
    return this.totalWeight;
}

public void setFrontWeight(String vFrontWeight){
    this.frontWeight = vFrontWeight;
}

public String getFrontWeight(){
    return this.frontWeight;
}

public void setRearWeight(String vRearWeight){
    this.rearWeight = vRearWeight;
}

public String getRearWeight(){
    return this.rearWeight;
}

public void setEquipType(String vEquipmentType){
    this.typeEquip = vEquipmentType;
}

public String getEquipType(){
    return this.typeEquip;
}

public void setVID (int vID){
    this.idVehicle = vID;
}

public int getVID(){
    return this.idVehicle;
}

public void setOwn(String vDateOfOwnership){
    this.dateOwn = vDateOfOwnership;
}

public String getOwn(){
    return this.dateOwn;
}

public static void printEquipment(EquipmentData equip){
    System.out.println("Make: " + equip.getMake());
    System.out.println("Model: " + equip.getModel());
    System.out.println("Year: " + equip.getVYear());
    System.out.println("Type: " + equip.getVType());
    System.out.println("Engine: " + equip.getVEngine());
    System.out.println("Transmission: " + equip.getVTransm());
    System.out.println("Total Weight: " + equip.getTotalWeight());
    System.out.println("Front Weight: " + equip.getFrontWeight());
    System.out.println("Rear Weight: " + equip.getRearWeight());
    System.out.println("Equipment Type: " + equip.getEquipType());
    System.out.println("Vehicle ID: " + equip.getVID());
    System.out.println("Date Of Ownership: " + equip.getOwn());
    System.out.println();
}
String makeVehicle = "null";
String modelVehicle = "null";
String yearVehicle = "null";
String typeVehicle = "null";
String typeEngine = "null";
String typeTransm = "null";
String totalWeight = "null";
String frontWeight = "null";
String rearWeight = "null";
String typeEquip = "null";
int idVehicle = 0;
String dateOwn = "null";

 
}



