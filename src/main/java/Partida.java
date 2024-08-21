
//Classe que armazena informações sobre vitórias e derrotas.
public class Partida {
    private int vitorias;
    private int derrotas;

    public Partida(int vitorias, int derrotas) {
        this.vitorias = vitorias;
        this.derrotas = derrotas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
}
