package org.example.patterns.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DocumentManager {
    private Map<DocType, Document> documenTemplate = new HashMap<>();

    public void addTemplate(DocType key, Document doc) {
        documenTemplate.put(key, doc);
    }

    public Document createDocument(DocType key) {
        return documenTemplate.get(key).clone();
    }
}
