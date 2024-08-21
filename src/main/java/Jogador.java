//Classe que armazena o saldo e o nível.
public class Jogador {
    private int saldoVitorias;
    private String nivel;

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
