package section_7_OOP_Part_2_Composition_Encapsulation_Polymorphism._1_Composition;

public class PC {
    private Monitor monitor;
    private MotherBoard motherBoard;
    private Case theCase;

    public PC(Monitor monitor, MotherBoard motherBoard, Case theCase) {
        this.monitor = monitor;
        this.motherBoard = motherBoard;
        this.theCase = theCase;
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo (){
        monitor.drawPxelAt(1200,50, "Yellow");
    }


}
