class MOD {
    public static void main(String[] args) {
        int[] x = {128, 322, 353, 235, 336, 73, 198, 332, 202, 285, 57, 87, 262, 221, 
            218, 405, 335, 101, 256, 227, 112, 140};

        String ascii = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

        for (int i : x) {
            System.out.print(a.charAt(i % 37));
        }
    }
}
