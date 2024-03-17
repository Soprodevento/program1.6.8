//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String str = "111";
        main.parseAndPrintNumber(str);
    }
    public void parseAndPrintNumber(String str) {
        int x = Integer.parseInt(str) / 2 ;
        System.out.println(x);
    }

}
