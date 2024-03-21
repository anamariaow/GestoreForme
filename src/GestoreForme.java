import java.util.ArrayList;

public class GestoreForme {
    private ArrayList<FormaGeometrica> formaGeometricaArrayList;

    public GestoreForme(ArrayList<FormaGeometrica> formaGeometricaArrayList) {
        this.formaGeometricaArrayList = new ArrayList<>();
    }

    public ArrayList<FormaGeometrica> getFormaGeometricaArrayList() {
        return formaGeometricaArrayList;
    }

    public void setFormaGeometricaArrayList(ArrayList<FormaGeometrica> formaGeometricaArrayList) {
        this.formaGeometricaArrayList = formaGeometricaArrayList;
    }
    public void aggiungiForma(FormaGeometrica formaGeometrica) {
        formaGeometricaArrayList.add(formaGeometrica);
    }
    public void visualizzaElenco() {
        for (FormaGeometrica formaGeometrica : formaGeometricaArrayList) {
            System.out.println(formaGeometrica);
        }
    }
    public Double areaTotale() {
        Double area = 0.0;
        for (FormaGeometrica formaGeometrica : formaGeometricaArrayList) {
            area += formaGeometrica.calcolaArea();
        }
        return area;
    }

}
