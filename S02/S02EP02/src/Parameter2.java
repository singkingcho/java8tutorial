public class Parameter2 {



    public static void change(Girl g) {
        g = null;

    }

    public static void modify(Girl g) {
        g.name = "王靖雯";
    }


    public static Girl change2(Girl g) {
        g = null;
        return g;

    }
}
