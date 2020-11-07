
public class ComponentManager{
    private Component components = new Component[10];

    public ComponentManager(){

    }

    public void buyComponent(Component part){
        for(int i = 0; i < this.components.length; i++) {
            if (this.components[i] == null) {
                this.components[i] = part;
                return;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
}