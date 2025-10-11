package GFG.pracrise;
import java.awt.Desktop;
import java.net.URI;

public class url_opener {


        public static void main(String[] args) {
            try {
                Desktop desktop = Desktop.getDesktop();
                // Replace with your desired URL
                URI uri = new URI("https://community.acer.com/en/discussion/721258/inquiry-about-thunderbolt-usb-c-charger-compatibility-for-my-predator-laptop");
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }