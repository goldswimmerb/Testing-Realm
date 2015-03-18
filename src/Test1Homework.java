
public class Test1Homework{
	public static int[] rateTable = {50,60,160,60,80,100,100,120,150,150,150,200,40,240,220,220,200,200,180,180,140,100,80,60};
	
	static int getChargingCost(int startHour, int chargeTime){
		int res = 0;
		for(int i = startHour; i<=chargeTime+startHour; i++){
			res+=rateTable[i%24];}
		return res;
		
	}
	//LOOK MOM, I ADDED A COMMENT
	static int getChargeStartTime(int chargeTime){
		int[] storage = new int [24];
		for(int i = 0; i < rateTable.length;i++){
			int store = 0;
			for(int j = i; j<chargeTime;j++){
				store+=rateTable[j%24];
			}
			storage[i]=store;}
		int stor = storage[0];
		int pos = 0;
		
		for(int i = 0; i<storage.length;i++){
			if(storage[i]<stor){
				stor=storage[i];
				pos = i;}
		}
		return pos;}
	
	
	public static void main(String[] args){
		//System.out.println(getChargingCost(23, 1));
		System.out.println(getChargeStartTime(15));
		//System.out.println(getChargingCost(getChargeStartTime(5),5));
	//	while(true){
			//.getRuntime().exec(new String[]{"javaw","-cp",System.getProperty("java.class.path"),"Test1Homework"});
	//	}
	}
}
