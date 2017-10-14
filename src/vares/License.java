package vares;

public class License {
	public static boolean active = basic.activeLicense;
		static void addLic(){
			if(active == false){
				if(basic.age >= 18){
					if(basic.nameP != null){
						active = true;
						basic.activeLicense = true;
				}
			}
		}
	}
}
