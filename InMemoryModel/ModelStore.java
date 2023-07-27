package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangeObserver> changeObservers;


    //конструктор

    public ModelStore(List<IModelChangeObserver> changedObservers) throws Exception {
        this.changeObservers = changedObservers;

        this.Models = new ArrayList<PoligonalModel>();
        this.Scenes = new ArrayList<Scene>();
        this.Flashes = new ArrayList<Flash>();
        this.Cameras = new ArrayList<Camera>();

        Models.add(new PoligonalModel(null));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0,Models,Flashes, Cameras));
    }



     // Возвращает сцену

    public Scene GetScena(int ID) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).ID == ID) {
                return Scenes.get(i);
            }

        }
        return null;
    }



    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
