public class Regular extends CustomerType{
    Regular(String name, int age, double amt){
        super(name, age, amt);
    }
    public void display(){
        System.out.println("Welcome Regular Customer:");
        super.display();
    }
}