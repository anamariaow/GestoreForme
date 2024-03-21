import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica cerchio = new Cerchio("azzurro", 3.0);
        FormaGeometrica quadrato = new Quadrato("rosso", 4.0);

        GestoreForme gestoreForme = new GestoreForme(new ArrayList<>());
        gestoreForme.aggiungiForma(cerchio);
        gestoreForme.aggiungiForma(quadrato);
        gestoreForme.visualizzaElenco();


        cerchio.calcolaArea();
        quadrato.calcolaArea();
        gestoreForme.areaTotale();
    }
}