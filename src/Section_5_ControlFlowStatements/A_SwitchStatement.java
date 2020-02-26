package Section_5_ControlFlowStatements;

public class A_SwitchStatement {
    public static void main(String[] args) {
        /*int value=1;
        if(value==1){
            System.out.println("Value was 1");
        }else if (value==2){
            System.out.println("Value was 2");
        }else{
            System.out.println("Value not 1 or 2");
        }*/

        int switchValue=1;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4:
                System.out.println("Value was 3 or 4");
                break;
            default:
                System.out.println("Value not 1 or 2");
                break;
        }

        char charValue = 'D';
        switch (charValue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D':
                System.out.println("C or D was found");
                break;
            default:
                System.out.println("Could not find A, B, C or D");
                break;
        }
        String stringValue = "jaNuaRy";
        switch (stringValue.toUpperCase()){
            case "JANUARY":
                System.out.println("JANUARY was found");
                break;
            case "FEBRUARY":
                System.out.println("FEBRUARY was found");
                break;
            default:
                System.out.println("Could not find");
                break;
        }
    }
}
