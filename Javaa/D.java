class D {
    public static void main(String[] args) {
        String s = "hello";
        String rev = "";
        char chars[] = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + chars[i];

        }
        System.out.println(rev);
    }

}
