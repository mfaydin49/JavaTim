package section_7_OOP_Part_2_Composition_Encapsulation_Polymorphism._1_Composition;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int ramSots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSots = ramSots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("program name " + programName + " is loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSots() {
        return ramSots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
