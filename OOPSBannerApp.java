import java.util.Scanner;

class OOPSBannerApp {
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println(slot);
    }
}