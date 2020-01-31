
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class scrivi {

    public scrivi() {
    }

    public void scriviSuFile()throws IOException {    
            FileWriter fileWriter = new FileWriter("prova");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print("Some String");
            printWriter.printf("Product name is %s and its price is %d $", "iPhone", 1000);
            printWriter.close();
            
            for (int i = 0; i<100000; i++){
                for (int j = 0; j < 5; j++){
                    }
                int n = (int)(Math.random()*254);
                    fileWriter.write(n + " ");
                    String s = "";
                    s = s + " " + n;
                    //s = new Integer (n).toString();
                    //s = Integer.toString (n);
            }
            
    }
}
