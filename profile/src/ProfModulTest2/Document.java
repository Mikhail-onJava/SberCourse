package ProfModulTest2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Document {
    public int id;
    public String name;
    public int pageCount;

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public Document(Integer id, String name, Integer pageCount) {
        this.name = name;
        this.pageCount = pageCount;
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public static Map<Integer, Document> organizeDocuments(List<Document> documents) {
        Map<Integer, Document> map = new HashMap<>();
        for (Document ob : documents) {
            map.put(ob.getId(), ob);
        }
        return map;
    }

    @Override
    public String toString() {
        return "Document{" + "id=" + id + ", name='" + name + '\'' + ", pageCount=" + pageCount + '}';
    }
}

