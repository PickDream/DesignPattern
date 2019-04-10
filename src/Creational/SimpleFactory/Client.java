package Creational.SimpleFactory;

public class Client {
    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo("java");
    }
}
