public class Wrapped<Element extends Clonable<Element>> {
    private Element objElement;
    public Wrapped(Element objElement){
        objElement=objElement.copy();
    }
    public Element getObjElement() {
        return objElement.copy();
    }

    public void setObjElement(Element objElement) {
        this.objElement = objElement.copy();
    }
    public boolean equals(Element objElement){
if(objElement==null) return false;
if(! (objElement instanceof Wrapped)) return false;
else return (this.objElement.equals(((Wrapped)objElement).objElement));
    }
}
