import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterWrapper {
    private BufferedWriter file;
    
    public BufferedWriter getFile() {
        return file;
    }

    public void setFile(BufferedWriter file) {
        this.file = file;
    }

    public FileWriterWrapper(String Filename){
        try {
            this.file= new BufferedWriter(new FileWriter(Filename));
        } catch (IOException e) {
           System.out.println("File cannot be opened!");
        }
    }
    public void close(){
        try {
            file.close();
        } catch (IOException e) {
            System.out.println("File cannot be closed!");
        }
    }
    public void write(String new_lines){     
        try {
            file.newLine();
            file.write(new_lines);
        } catch (IOException e) {
            System.out.println("File cannot be written!");
        }
    }
}
