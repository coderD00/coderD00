import java.awt.Cursor;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Weather extends JFrame {
    public Weather(){
        super("Weather App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 650);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(true);
        
        addGuiComponents();
    }

    private void addGuiComponents() {
        JTextField searchTextField = new JTextField();
        searchTextField.setBounds(15, 15, 351, 45);
        searchTextField.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(searchTextField);

        JButton searchButton = new JButton(loadImage("c:\\Users\\Asus\\Pictures\\icons8-search-30.png"));
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375,13,47,45);
        add(searchButton);

        JLabel weathercondition = new JLabel(loadImage("c:\\Users\\Asus\\Pictures\\pngtree-vector-cloud-icon-png-image_939423.jpg"));
        weathercondition.setBounds(0,125,450,217);
        add(weathercondition);

        //temperature text
        JLabel temptext = new JLabel("10 C");
        temptext.setBounds(0,350,450,54);
        temptext.setFont(new Font("Dialog",Font.BOLD,40));
        temptext.setHorizontalAlignment(SwingConstants.CENTER);
        add(temptext);

        //weather condition
        JLabel weatherconddes = new JLabel("Cloudy");
        weatherconddes.setBounds(0,405,450,50);
        weatherconddes.setFont(new Font("Dialog",Font.PLAIN,32));
        weatherconddes.setHorizontalAlignment(SwingConstants.CENTER);
        add(weatherconddes);

        //humidty image
        JLabel humdityimg = new JLabel(loadImage("c:\\Users\\Asus\\Downloads\\isolated-clean-water-blue-drop-illustration-vector.jpg"));
        humdityimg.setBounds(15,500,74,66);
        add(humdityimg);

        //humidity text
        JLabel humdityTxt = new JLabel("<html><b>Humidity</b>100%</html>");
        humdityTxt.setBounds(90,500,85,55);
        humdityTxt.setFont(new Font("Dialog",Font.PLAIN,16));
        add(humdityTxt);
        
        //wind speed images
        JLabel wsi = new JLabel(loadImage("c:\\Users\\Asus\\Pictures\\wind-icon-set-winds-vector-260nw-2204517253.png"));
        wsi.setBounds(220,500,74,66);;
        add(wsi);
        
        //wind speed text
        JLabel wst = new JLabel("<html><b>Windspeed<\b> 15km/h </html>");
        wst.setBounds(310,500,85,55);
        wst.setFont(new Font("dialog", Font.ITALIC,16)); 
        add(wst);

    }
private ImageIcon loadImage(String resourcePath) {
    try {
        BufferedImage image = ImageIO.read(new File(resourcePath));
        return new ImageIcon(image);
    } catch (IOException e) { // Corrected typo here
        e.printStackTrace();
    }
    System.out.println("Could not find resource");
    return null;
}
public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            // Uncomment this line when Weather class is available
             new Weather().setVisible(true);

            // Fixed the string syntax error
            // String locationName = "Tokyo";  // Example location
            // System.out.println("weatherapi.getLocationData(locationName: \"" + locationName + "\")");
        }
    });
}
    }

