class Animal { //Parent
    void eat(){
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal { //Child
    void bark(){
        System.out.println("Dog is barking.");
    }
}

class Puppy extends Dog {
    void weep(){
        System.out.println("Puppy is weeping.");
    }
}


public class MultilevelInheritanceDemo { // Grandchild
    public static void main(String[] args){
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
