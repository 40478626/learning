public class ClassSample

{

    private String msg;                                  // (1)

    public ClassSample()

    {
        System.out.println("Constructor Was Called.");   // (2)

    }

    public void setMessage(String inMsg)

    {

        msg = inMsg;                                     // (3)

    }

    public void printMessage()

    {

        System.out.println("message:" + msg);            // (4)

    }

    public static void main(String[] args)

    {

        ClassSample classSample;                         // (5)

        classSample = new ClassSample();                 // (6)

        classSample.setMessage(" Hello Java World! ");     // (7)

        classSample.printMessage();                      // (8)

        AnotherClassSample anotherClass = new AnotherClassSample(); // (9)

        anotherClass.printName();                        // (10)

        anotherClass.setName("bar");                     // (11)

        anotherClass.printName();                        // (12)

    }

}