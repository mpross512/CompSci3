
public class CustomList {

    ListObject baseContent;

    public CustomList() {
        baseContent = new ListObject();
    }

    public CustomList(String content) {
        baseContent = new ListObject(content);
    }

    public void add(String content) {
        ListObject lastReference = baseContent;
        while(lastReference.getNextReference() != null) 
            lastReference = lastReference.getNextReference();
        lastReference.setNextReference(new ListObject(content));
    }

    public void add(int index, String content) {
        int count = 0;
        ListObject reference = baseContent;
        ListObject prevRef = null;
        while(reference != null) {
            if(index == count) {
                ListObject newContent = new ListObject(content);
                newContent.setNextReference(reference);
                if(prevRef != null) {
                    prevRef.setNextReference(newContent);
                } else {
                    baseContent = newContent;
                }
                return;
            }
            prevRef = reference;
            reference = reference.getNextReference();
            count++;
        }
    }

    public String get(int index) {
        int count = 0;
        ListObject reference = baseContent;
        while(reference != null) {
            if(index == count)
                return reference.getContent();
            reference = reference.getNextReference();
            count++;
        }
        return null;
    }

    public void set(int index, String content) {
        int count = 0;
        ListObject reference = baseContent;
        while(reference != null) {
            if(count == index) {
                reference.setContent(content);
                return;
            }
            reference = reference.getNextReference();
            count++;
        }
    }

    public void remove(int index) {
        ListObject reference = baseContent;
        if(index == 0)
            baseContent = baseContent.getNextReference();
        else {
            for(int i = 1; i < index; i++) {
                reference = reference.getNextReference();
            }
            reference.setNextReference(reference.getNextReference().getNextReference());
        }
    }

    public int size() {
        int count = 0;
        ListObject reference = baseContent;
        while(reference != null) {
            count++;
            reference = reference.getNextReference();
        }
        return count;
    }

    public String toString() {
        String output = "[";
        ListObject reference = baseContent;
        while(reference.getNextReference() != null) {
            output += reference + ", ";
            reference = reference.getNextReference();
        }

        return output + reference + "]";
    }
}