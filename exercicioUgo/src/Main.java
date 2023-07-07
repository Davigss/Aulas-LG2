public class Main {
    public static void main(String[] args) {
        StaticArray vetorEstatico = new StaticArray(3);

        vetorEstatico.add(1);
        vetorEstatico.exibir();
        vetorEstatico.add(20);
        vetorEstatico.exibir();
        vetorEstatico.add(300);
        vetorEstatico.exibir();
        vetorEstatico.remove(1);
        vetorEstatico.exibir();
        vetorEstatico.add(9,1);
        vetorEstatico.exibir();
    }
}