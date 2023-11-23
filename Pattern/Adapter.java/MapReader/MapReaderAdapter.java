package MapReader;

public class MapReaderAdapter extends TextFileReader {
    private JSONFileReader jsonFileReader;
    public MapReaderAdapter(JSONFileReader jsonFileReader){
        this.jsonFileReader=jsonFileReader;

    }
    public Map translate(Map map){
        Map transMap= new Map();
        return transMap;
    }
    public Map readFile(String str){
        return(translate(jsonFileReader.jsonFileReader(str)));
    }

    
}
