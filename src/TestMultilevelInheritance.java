public class TestMultilevelInheritance {

    public static void main(String [] args)
    {
        BabyChildClass baby = new BabyChildClass("Constructor Called by Baby Child class");
        baby.superClassMethod();
        baby.childClassMethod();
        baby.babyChildClass();


    }
}
