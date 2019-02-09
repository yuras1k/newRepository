package Consumer;

public class Consumer {

    private int idConsumer;
    private String fullNameConsummer;
    private String addressConsummer;


    public Consumer(int idConsumer, String name, String address) {
        this.idConsumer = idConsumer;
        this.fullNameConsummer = name;
        this.addressConsummer = address;
    }

    public int getIdConsumer() {

        return idConsumer;
    }

    public void setIdConsumer(int idConsumer) {

        this.idConsumer = idConsumer;
    }

    public String getName() {
        return fullNameConsummer;
    }

    public String getAddress() {

        return addressConsummer;
    }


    @Override
    public String toString() {
        return "Consumer{" + "idConsumer=" + idConsumer + ", name='" + fullNameConsummer + '\'' + ", address='" + addressConsummer + '\'' + '}';
    }
}
