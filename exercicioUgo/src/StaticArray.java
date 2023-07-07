public class StaticArray {

    private int[] elementos;
    private int size;
    private int capacity;
    public StaticArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        elementos = new int[getCapacity()];
    }
    private boolean EstaCheio(){
        if(getSize()==getCapacity()){
            return true;
        }
        return false;

    }
    private boolean EstaVazio(){
        if(getSize()==0){
            return true;
        }
        return false;
    }
    public void add(int valor){
        if (!EstaCheio()){
            elementos[getSize()]=valor;
            size++;
        }
    }
    public void add(int valor, int indice){
        if (!EstaCheio()){
            if(elementos[indice]!=0){
                for(int i = size; i>indice; i--){
                    elementos[i]=elementos[i-1];
                    elementos[i-1]=0;
                }
                elementos[indice]=valor;
                size++;
            }
        }
    }
    public void remove(int indice){
        if (!EstaVazio()){
            elementos[indice]=0;
            size--;
        }
        for (int i =0; i<size; i++){
            if(elementos[i]==0){
                elementos[i]=elementos[i+1];
                elementos[i+1]=0;
            }
        }
    }
    public void exibir(){
        System.out.println("capacidade: "+getCapacity()+"\ncom "+getSize()+" elementos;");
        for (int i=0; i<size; i++ ) {
            System.out.print("  "+elementos[i]);
        }
        System.out.println(" ");
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int[] getElementos() {
        return elementos;
    }
    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }
}

