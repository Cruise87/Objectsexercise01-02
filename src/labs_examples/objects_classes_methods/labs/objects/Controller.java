package labs_examples.objects_classes_methods.labs.objects;

class Pet{
    String type;
    public Pet(String type){
        this.type = type;
    }
}
class Owner{
    String name;
    public Owner(String name){
        this.name = name;
    }
}
public class Controller {
    public static void main(String[] args) {
    Pet p = new Pet("Cat");
    Owner owner = new Owner("Sophia");
        System.out.println(owner.name + " has a " + p.type + " that they take care of.");
    }
}
