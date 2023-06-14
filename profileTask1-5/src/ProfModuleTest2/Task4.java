package ProfModuleTest2;

import java.util.ArrayList;
import java.util.List;


public class Task4 {
    public static void main(String[] args) {
        List<Document> documents = new ArrayList<>();
        documents.add(new Document(1, "book1", 340));
        documents.add(new Document(2, "book2", 535));
        documents.add(new Document(3, "book3", 123));
        documents.add(new Document(4, "book4", 245));
        for (Document s : documents) {
            System.out.print(s.getId());
            System.out.print(" " + s.getName());
            System.out.print(" " + s.getPageCount());
            System.out.println();
        }
        System.out.println(Document.organizeDocuments(documents));
//        Map<Integer, Document> map = Document.organizeDocuments(documents);
//        for (Map.Entry<Integer, Document> pair : map.entrySet())
//        {
//            Integer key = pair.getKey();
//            Document value = pair.getValue();
//            System.out.println(key + ":" + value);
//        }
    }
}