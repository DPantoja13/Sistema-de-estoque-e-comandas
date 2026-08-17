package system.itensandorders.itensstorage;

public class ItensInventory {

    static String[] InventoryList() {

        //Inventory List Quantity
        final String[] InventoryList = new String[4];

        //Iten on the Inventory
        InventoryList[0] = "Camisa";
        InventoryList[1] = "Calça";
        InventoryList[2] = "Sapato";
        InventoryList[3] = "Casaco";

        return InventoryList;

    }

    static int[] InventoryQuantity() {

        int[] InventoryQuantity = {

            1,
            2,
            3,
            5

        };

        return InventoryQuantity;
    }


    public static void main(String[] args) {
        
        //print output

        System.out.println("=========== Inventory ===========");

        for (int i = 0; i < InventoryList().length; i++) {
            System.out.println(InventoryList()[i].concat(" - ") + InventoryQuantity()[i] + (" Qantitades em Estoque."));
        }

        System.out.println("=================================");
    }
}
