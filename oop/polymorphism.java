
class language {

    public void greeting() {

    }
}

class hindi extends language {

    @Override
    public void greeting() {
        System.out.println("suvapravatam");

    }
}

class english extends language {

    @Override
    public void greeting() {
        System.out.println("good morning");
    }
}

class french extends language {

    @Override
    public void greeting() {
        System.out.println("bonjour");
    }
}

public class polymorphism {

    public static void main(String[] args) {
        language l;     // reference of language superclass
        l = new hindi();    //object of hindi class
        l.greeting();
        l = new english();   //object of english class
        l.greeting();
        l = new french();    //object of french class
        l.greeting();
    }
}
