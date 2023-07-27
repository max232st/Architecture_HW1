package InMemoryModel;


// смена сцены
public interface IModelChanger {
    public void notifyChange(IModelChanger sender);

}
