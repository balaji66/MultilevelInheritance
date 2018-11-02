public class ChildClass extends SuperClass {

    ChildClass(String name)
    {
        super(name);
        System.out.println("Child class " + name);
    }

    void childClassMethod()
    {
        System.out.println("Child class method");
    }

}
