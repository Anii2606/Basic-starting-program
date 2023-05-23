public class StringDemo{
public static void main(String []args){
	String str = "Anikesh";
	String str1="Chouhan";
	System.out.println(str);
	System.out.println(str.length());
	for (int i=0;i<str.length();i++){
	System.out.println(str.charAt(i));
	}
		if (str.compareTo(str1)==0){
			System.out.println("Anikesh=Chouhan");
		}else if (str.compareTo(str1)>0){
				System.out.println("Anikesh>Chouhan");
				}else{
				System.out.println("Anikesh<Chouhan");
		}
		//String str2=str.substring(3,str.length());
		String str2=str.substring(3);
		System.out.println(str2);
		String str3=str1.substring(0,4);
		System.out.println(str3);
}
}