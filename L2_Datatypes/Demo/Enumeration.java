package L2_Datatypes.Demo;

enum RailwayTerminal {
    Finlyandskiy,
    Moskovskiy,
    Vitebskiy,
    Baltiyskiy,
    Ladoszhskiy
}

public class Enumeration {
    public static void main(String[] args) {
        RailwayTerminal AllegroTerminal = RailwayTerminal.Finlyandskiy;
        RailwayTerminal SapsanTerminal = RailwayTerminal.Moskovskiy;
        System.out.println(AllegroTerminal);
        System.out.println(SapsanTerminal);
    }
}