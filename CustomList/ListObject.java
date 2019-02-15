public class ListObject {

    public ListObject nextObjectReference;

    public String content;

    public ListObject() {
        this.content = "";
        nextObjectReference = null;
    }

    public ListObject(String content) {
        this.content = content;
        nextObjectReference = null;
    }

    public void setNextReference(ListObject nextReference) {
        nextObjectReference = nextReference;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ListObject getNextReference() {
        return nextObjectReference;
    }

    public String getContent() {
        return content;
    }

    public String toString() {
        return content;
    }
}