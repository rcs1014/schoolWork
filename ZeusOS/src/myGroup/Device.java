package myGroup;
//import java.util.*;
//import processGroup;


public class Device {
	
	String logicalName;
	String physicalName;
	boolean status;
	int speed;
	int numProcesses;
//	Queue<Process> deviceQueue = new Queue<Process>();	//Need Process Groups code
	
   public Device(){
	status = false;
	numProcesses = 0;
   }
	
   public void initialize(){
//	   logicalName=;									//Read in info from Device File - need to figure out how to read in data from file in Java
//	   physicalName=;									|
//	   speed =;											V
	   enable();
   }
   
   public void addProcess(Process newPro){
//	   deviceQueue.push(newPro);
	   numProcesses++;
   }
   
/*   public void deleteProcess(){
	   try{
		   deviceQueue.pop();
		   numProcesses--;
	   }catch(Exception e){
		   System.out.println("There are no processes queued for this Device currently.");
	   }
   }
*/   
   public void enable(){
      status = true;
   }
   
   public void disable(){
      status = false;
   }
   
   public void update(){
   }
   
   public void printDevice(){
	   	System.out.println("Logical Name: " + logicalName);
	   	System.out.println("Physical Name: " + physicalName);
	   	System.out.println("Status: "+ busy()); //(1)
	   	System.out.println("Speed: " + speed);
	   	System.out.println("Processes Queued: " + numProcesses);
   }
   
   public String busy(){		// (1) Not sure if String works this way
      if(status = false) {
    	  return "Idle";
      }else {
    	  return "Busy";
      }
   }
   
   public void advanceJobs(){							//Checks the process status of the jobs that are on the device
   }
   
/*   public boolean queue(){							//Will return status of Device Queue
	   if(deviceQueue.isEmpty()){
		   return true;
	   }else {
		   return false;
	   }
   }
*/   
   public void deviceProcess(){							//Constructor for Device Process?
   }
   
}