package datasource;

public interface IDataSource {
    void writeData(String data);

    String readData();
}
