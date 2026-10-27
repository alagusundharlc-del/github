interface Father {
    void work();
}

interface Mother {
    void cook();
}

class Child implements Father, Mother {
    public void work() {
        System.out.println("Father is working");
    }

    public void cook() {
        System.out.println("Mother is cooking");
    }
}

class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.work();
        c.cook();
    }
}