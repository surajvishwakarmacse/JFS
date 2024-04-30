package OOPs;

public class Gadi {

    Gadi manufacture()
    {
        System.out.println("Gadi");
        return new Gadi();
    }
}

class Ford extends Gadi{
    @Override
    //covarient return type
    Ford manufacture() {
        System.out.println("Ford's Gadi");
        return new Ford();
    }
}
