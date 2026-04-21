class OOPSBannerApp {
    static int[] getRowCol(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    public static void main(String[] args) {
        int slot = 7;
        int[] result = getRowCol(slot);
        System.out.println(result[0] + " " + result[1]);
    }
}