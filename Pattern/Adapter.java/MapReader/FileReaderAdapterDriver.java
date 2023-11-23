package MapReader;

public class FileReaderAdapterDriver {
    public static void main (String [] args){
        TextFileReader textFileReader= new TextFileReader();
        Map map;
        textFileReader.readFile("Reading Text file");
        TextFileReader maps= new MapReaderAdapter(new JSONFileReader());
        map= maps.readFile("Reading JSON file");
    }
}
