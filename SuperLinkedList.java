import java.util.LinkedList;
import java.util.Iterator;
import java.util.HashSet;

public class SuperLinkedList extends LinkedList<String> {
    public boolean removeVowels() {
        boolean removed = false;
        Iterator<String> iter = this.iterator();
        
        while (iter.hasNext()) {
            String element = iter.next();
            if (isVowel(element)) {
                iter.remove();
                removed = true;
            }
        }
        
        return removed;
    }
    
    public boolean removeConsonants() {
        boolean removed = false;
        Iterator<String> iter = this.iterator();
        
        while (iter.hasNext()) {
            String element = iter.next();
            if (isConsonant(element)) {
                iter.remove();
                removed = true;
            }
        }
        
        return removed;
    }

    public LinkedList<String> removeDuplicates() {
        LinkedList<String> removedList = new LinkedList<>();
        HashSet<String> seenSet = new HashSet<>();
        Iterator<String> iter = this.iterator();
        
        while (iter.hasNext()) {
            String element = iter.next();
            if (seenSet.contains(element)) {
                removedList.add(element);
                iter.remove();
            } else {
                seenSet.add(element);
            }
        }
        
        return removedList;
    }
    
    public LinkedList<String> concatenateStrings() {
        LinkedList<String> resultList = new LinkedList<>();
        String concatenated = "";
        Iterator<String> iter = this.iterator();
        
        while (iter.hasNext()) {
            String element = iter.next();
            concatenated += element;
            resultList.add(concatenated);
        }
        
        return resultList;
    }
    
    public LinkedList<String> mix(LinkedList<String> list2) {
        LinkedList<String> resultList = new LinkedList<>();
        Iterator<String> iter1 = this.iterator();
        Iterator<String> iter2 = list2.iterator();
        
        while (iter1.hasNext() && iter2.hasNext()) {
            resultList.add(iter1.next());
            resultList.add(iter2.next());
        }
        
        return resultList;
    }
    
    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        Iterator<String> iter = this.iterator();
        
        while (iter.hasNext()) {
            result.append(iter.next());
            if (iter.hasNext()) result.append(", ");
        }
        
        return result.toString();
    }

    private boolean isVowel(String element) {
        if (element == null || element.length() != 1) return false;
        
        char ch = element.toLowerCase().charAt(0);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    private boolean isConsonant(String element) {
        if (element == null || element.length() != 1) return false;
        
        char ch = element.toLowerCase().charAt(0);
        return Character.isLetter(ch) && !isVowel(element);
    }
}