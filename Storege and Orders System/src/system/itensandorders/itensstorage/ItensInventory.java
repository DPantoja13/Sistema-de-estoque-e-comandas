package system.itensandorders.itensstorage;

public class ItensInventory {

    static String[] InventoryList() {

        final String[] InventoryList = {

            "Camiseta",
            "Calça",
            "Tênis",
            "Casaco"

        };

        return InventoryList;

    }

    static int[] InventoryQuantity() {

        int[] InventoryQuantity = {

            1,
            0,
            3,
            5

        };

        return InventoryQuantity;
    }


    public static void main(String[] args) {
        
        for (int i = 0; i < InventoryList().length; i++) {
            System.out.println(InventoryList()[i].concat(" - Quantidade: ") + InventoryQuantity()[i]);
        }
    }
}
