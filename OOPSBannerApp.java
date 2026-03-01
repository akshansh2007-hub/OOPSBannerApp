public class OOPSBanner {
    public static void main(String[] args) {

        // String array to store all 7 lines
        String[] banner = {

            String.join(" ", "  *****  ", " *****  ", " ****** ", " ****** "),
            String.join(" ", " *     * ", "*     * ", "*     * ", "*     * "),
            String.join(" ", " *     * ", "*     * ", "*     * ", "*       "),
            String.join(" ", " *     * ", "*     * ", " ****** ", " ****** "),
            String.join(" ", " *     * ", "*     * ", "*       ", "       *"),
            String.join(" ", " *     * ", "*     * ", "*       ", "*     * "),
            String.join(" ", "  *****  ", " *****  ", "*       ", " ****** ")

        };

        // for-each loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }

    }
}