public class OOPSBannerApp {

    public static void main(String[] args) {
        displayBanner();
    }

    public static void displayBanner() {

        // Banner stored centrally in array
        String[] bannerLines = {
                String.join(" ", "*", "*", "*", "*", "*"),
                String.join(" ", "*", " ", " ", " ", "*"),
                String.join(" ", "*", "*", "*", "*", "*"),
                String.join(" ", "*", " ", " ", " ", "*"),
                String.join(" ", "*", "*", "*", "*", "*")
        };

        // Clean traversal
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}