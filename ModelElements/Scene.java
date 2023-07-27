package ModelElements;

// метод создания сцены

import Stuff.Type;
import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int ID;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> cameras = new ArrayList<Camera>();

    public Scene(int ID, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.ID = ID;
        Models = models;
        Flashes = flashes;
        this.cameras = cameras;
    }


    public Type method1(Type t) {
     return t;
     }


     public Type method2(Type t1, Type t2) {
     return t1;
     }

}
