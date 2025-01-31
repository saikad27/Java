import java.util.*;
class Company{
	String companyName;
	int empNo;
	Company(String companyName,int empNo){
		this.companyName = companyName;
		this.empNo = empNo;
	}
	public int hashCode(){
		return empNo;
	}
	public String toString(){
		return companyName;
	}
}
class Program1{
	public static void main(String[] args){
		
		Hashtable ht = new Hashtable();
		
		Company c1 = new Company("TCS",10000);
		Company c2 = new Company("Pubmatic",4000);
		Company c3 = new Company("Infosys",6000);
		Company c4 = new Company("Wipro",4000);
		
		ht.put(c1,c1.hashCode());
		ht.put(c2,c2.hashCode());
		ht.put(c3,c3.hashCode());
		ht.put(c4,c4.hashCode());
		
		System.out.println(ht);
	}
}
