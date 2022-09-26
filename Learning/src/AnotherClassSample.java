public class AnotherClassSample

{

    private String name;                                         // (A)

// constructer

    public AnotherClassSample()                                  // (B)

    {

        System.out.println(“AnotherClassSample Constructor!! “);  // (C)

        name = “foo”;                                            // (D)

    }

// name setting

    public void setName(String new_name)

    {

        name = new_name;                                         // (E)

    }

// name indication

    public void printName()

    {

        System.out.println(“My name is ” + name + “.”);          // (F)

    }

}