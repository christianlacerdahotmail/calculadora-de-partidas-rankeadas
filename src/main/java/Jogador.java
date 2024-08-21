//Classe que armazena o saldo e o nível.
public class Jogador {
    private final int saldoVitorias;
    private final String nivel;

    public Jogador(int saldoVitorias, String nivel) {
        this.saldoVitorias = saldoVitorias;
        this.nivel = nivel;
    }

    public int getSaldoVitorias() {
        return saldoVitorias;
    }

    public String getNivel() {
        return nivel;
    }
}
