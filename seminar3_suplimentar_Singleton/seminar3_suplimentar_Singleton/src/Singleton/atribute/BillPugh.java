package Singleton.atribute;

public class BillPugh {

    private BillPugh() {}

    private static  class BillPughInner {

        private static  final BillPugh instance = new BillPugh();
    }

    public static BillPugh getInstance() {

        return BillPughInner.instance;
    }
}
