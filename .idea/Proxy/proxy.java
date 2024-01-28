// Step 1: Define the Subject interface.
public interface Subject {
    void doOperation();
}

// Step 2: Create the RealSubject class.
public class RealSubject implements Subject {
    public void doOperation() {
        // Actual implementation goes here.
        System.out.println("Doing operation in RealSubject");
    }
}

// Step 3: Create the Proxy class.
public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void doOperation() {
        // Code to execute before delegating to the real subject (Pre-processing).
        System.out.println("Proxy pre-processing operation");

        // Delegating the operation to the real subject.
        realSubject.doOperation();

        // Code to execute after delegating to the real subject (Post-processing).
        System.out.println("Proxy post-processing operation");
    }
}

// Step 4: Using the Proxy in a client.
public class Client {
    public static void main(String[] args) {
        RealSubject real = new RealSubject();
        Proxy proxy = new Proxy(real);
        proxy.doOperation();
    }
}