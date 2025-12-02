/*
*   Name: Nick Griffith
*   Period: 6
*   Date: 12/2/25
*   Description: Tester file for SuperLinkedList, demonstrating the new methods and capabilities of the new class.
*/

class SLLTester {
      public static void main(String[] args) {
        SuperLinkedList list1 = new SuperLinkedList();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        
        SuperLinkedList list2 = new SuperLinkedList();
        list2.add("e");
        list2.add("d");
        list2.add("c");
        list2.add("b");
        list2.add("a");
        
        SuperLinkedList list3 = new SuperLinkedList();
        list3.add("A");
        list3.add("D");
        list3.add("C");
        list3.add("C");
        list3.add("D");
        list3.add("E");
        list3.add("B");
        
        System.out.println("This is list1:");
        printList(list1);
        
        System.out.println("This is list2:");
        printList(list2);
        
        System.out.println("This is list3:");
        printList(list3);
        
        System.out.println("\nThis is the calling list after the mix:");
        LinkedList<String> retLists = list1.mix(list2);
        printList(list1);
        
        System.out.println("This is the sent list after the mix:");
        printList(list2);
        
        System.out.println("This is retLists, return value of the call to mix:");
        printList(retLists);
        
        System.out.println("\nRemoved Vowels: true");
        System.out.println("This is list3 after the removeDuplicates:");
        LinkedList<String> duplicates = list3.removeDuplicates();
        printList(list3);
        
        System.out.println("\nReturned from removeDuplicates:");
        printList(duplicates);
        
        System.out.println("\nThis is list3 after the removeVowels:");
        list3.removeVowels();
        printList(list3);
        
        System.out.println("\nRemoved Consonants: true");
        System.out.println("This is list2 after the removeConsonants:");
        list2.removeConsonants();
        printList(list2);
        
        System.out.println("\nThis is list3 after the concatenateStrings:");
        LinkedList<String> concatenated = list3.concatenateStrings();
        printList(list3);
        
        System.out.println("This is retLists, return value of the call to concatenateStrings:");
        printList(concatenated);
    } // end main
    
    // Helper method
    private static void printList(LinkedList<String> list) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    } // end method
} // end class