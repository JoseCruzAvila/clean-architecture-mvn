package co.com.sofka.config;

public class MongoDBSecret {
    private final String uri;

    public MongoDBSecret(String uri) {
        this.uri = uri;
    }

    public String getUri() {
        return this.uri;
    }
}
