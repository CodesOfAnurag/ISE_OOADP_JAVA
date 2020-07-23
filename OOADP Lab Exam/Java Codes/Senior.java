public class Senior extends CustomerType{
    Senior(String name, int age, double amt){
        super(name, age, amt);
    }
    public void display(){
        System.out.println("Welcome Senior Citizen Customer:");
        super.display();
    }
}