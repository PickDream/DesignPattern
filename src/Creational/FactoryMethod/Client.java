package Creational.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        VideoFactory factory = new JavaVideoFactory();
        Video video = factory.getVideo();
        video.produce();

        VideoFactory factory2 = new PythonVideoFactory();
        Video video2 = factory.getVideo();
        video2.produce();

    }
}
