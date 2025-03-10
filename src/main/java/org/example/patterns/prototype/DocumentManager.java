package org.example.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class DocumentManager {
    private final Map<DocType, Document> documentTemplate = new HashMap<>();

    public void addTemplate(DocType key, Document doc) {
        documentTemplate.put(key, doc);
    }

    public Document createDocument(DocType key) throws CloneNotSupportedException {
        return documentTemplate.get(key).clone();
    }
}
