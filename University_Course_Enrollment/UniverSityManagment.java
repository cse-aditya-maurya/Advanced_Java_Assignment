abstract class UniverSityManagment {
	private int id;
	private String name;
	private String department;
	private int yearOfExp;
	UniverSityManagment(int id,String name,String department,int yearOfExp){
		this.id=id;
		this.name=name;
		this.department=department;
		this.yearOfExp=yearOfExp;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getDepartment(){
		return department;
	}
	public int YearOfExp(){
		return yearOfExp;
	}
}