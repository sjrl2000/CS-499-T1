
package Data;

import java.util.*;

public class PersonalData {
    
   public PersonalData(String fName, String lName, int position, String username, String password){
        this.firstName = fName;
        this.lastName = lName;
        this.workPosition = position;
        this.userName = username;
        this.userPassword = password;
    }
    
    
    public void setId(int id){
        this.idNumber = id;
    }

    public int getID(){
        return this.idNumber;
    }
    
    public void setFirstName(String fName){
        this.firstName = fName;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setMiddleName(String mName){
        this.middleName = mName;
    }
    
    public String getMiddleName(){
        return this.middleName;
    }
    
    public void setLastName(String lName){
        this.lastName = lName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public void setAddress(String userAddress){
        this.address = userAddress;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setCity(String cityName){
        this.city = cityName;
    }
    
    public String getCity(){
        return this.city;
    }
    
    public void setState(String stateName){
        this.state = stateName;
    }
    
    public String getState(){
        return this.state;
    }
    
    public void setZipcode(int userZipcode){
        this.zipcode = userZipcode;
    }
   
    public int getZipcode(){
        return this.zipcode;
    }
    
    public void setPhoneNumber(int userPhoneNumber){
        this.phoneNumber = userPhoneNumber;
    }
    
    public int getPhoneNumber(){
        return this.phoneNumber;
    }
    
    public void setCellPhoneNumber(int userCellPhoneNumber){
        this.cellPhoneNumber = userCellPhoneNumber;
    }
    
    public int getCellPhoneNumber(){
        return this.cellPhoneNumber;
    }
    
    public void setPayRate(double userPayRate){
        this.payRate = userPayRate;
    }
    
    public double getPayRate(){
        return this.payRate;
    }
    
    public void setYearsWithCompany(float years){
        this.yearsWithCompany = years;
    }
    
    public float getYearsWithCompany(){
        return this.yearsWithCompany;
    }
    
    public void setWorkAssignment(String assignment){
        this.workAssignment = assignment;
    }
    
    public String getWorkAssignment(){
        return this.workAssignment;
    }
    
    public void setWorkPosition(int number){
        this.workPosition = number;
    }
    
    public int getWorkPosition(){
        return this.workPosition;
    }
    
    public void setUserPassword(String password){
        this.userPassword = password;
    }
    
    public String getUserPassword(){
        return this.userPassword;
    }
    
    public void setUserName(String name){
        this.userName = name;
    }
    
    public String getUserName(){
        return this.userName;
    }
    
    public void setUserPositionInList(int position){
        this.currentEmployee = position;
    }
    
    public int getUserPositionInList(){
        return this.currentEmployee;
    }
    
    public int verifyLogin(String uName, String uPassword, List<PersonalData> uList){
        for(int i = 0; i < uList.size(); i++){
            //System.out.println("Checking if " + uList.get(i).getUserName() + " = " + uName + " and " + uList.get(i).getUserPassword() + " = " + uPassword);
            if(uList.get(i).getUserName().equals(uName) && uList.get(i).getUserPassword().equals(uPassword)){
                System.out.println("Returning true");
                uList.get(i).setUserPositionInList(i);
                return i;
            }
                
        }
        System.out.println("Returning false");
        return -1;
    }
    
    public static void printPeople(PersonalData person){
        System.out.println("Employee ID: " + person.getID());
        System.out.println("First name: " + person.getFirstName());
        System.out.println("Middle name: " + person.getMiddleName());
        System.out.println("Last name: " + person.getLastName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("City: " + person.getCity());
        System.out.println("State: " + person.getState());
        System.out.println("Zipcode: " + person.getZipcode());
        System.out.println("Phone number: " + person.getPhoneNumber());
        System.out.println("Cell phone number: " + person.getCellPhoneNumber());
        System.out.println("Pay rate: " + person.getPayRate());
        System.out.println("Years with company: " + person.getYearsWithCompany());
        System.out.println("Work assignment: " + person.getWorkAssignment());
        System.out.println("Work position: " + person.getWorkPosition());
        System.out.println("User name: " + person.getUserName());
        System.out.println("Password: " + person.getUserPassword());
        System.out.println();
    }


    int currentEmployee;
    int idNumber = 0;
    String firstName = "null";
    String middleName = "null";
    String lastName = "null";
    String address = "null";
    String city = "null";
    String state = "null";
    int zipcode = 0;
    int phoneNumber = 0;
    int cellPhoneNumber = 0;
    double payRate = 0.0;
    float yearsWithCompany = 0;
    String workAssignment = "null";
    int workPosition = 0; // -1 is nothing, 1 is driver, 2 is maintenance worker, 3 is shipping manager, 4 is office personnel, 5 is CFO, 6 is president
    String userName = "null";
    String userPassword = "null";
    

}
