//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String str = "111";
        main.parseAndPrintNumber(str);

    }
    public void parseAndPrintNumber(String str) {
        System.out.println(Integer.parseInt(str) / 2) ;
    }

}
