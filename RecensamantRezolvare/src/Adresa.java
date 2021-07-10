import java.util.Objects;

public class Adresa {

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public int getBloc() {
        return bloc;
    }

    public void setBloc(int bloc) {
        this.bloc = bloc;
    }

    private String strada;
    private int bloc;

    public Adresa(String strada, int bloc) {
        this.strada = strada;
        this.bloc = bloc;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Adresa)) return false;

        Adresa a = (Adresa) o;

        return this.getStrada().equals(a.getStrada())
                && this.getBloc() == a.getBloc();
    }

    @Override
    public String toString() {
        return "Adresa {" +
                "strada = '" + strada + '\'' +
                ", bloc = " + bloc +
                '}';
    }
}
