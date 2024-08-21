
public class CalculadoraRankeadas {
    public static Jogador calcularSaldo(Partida partida) {
        int saldo = partida.getVitorias() - partida.getDerrotas();

        String nivel = determinarNivel(saldo);
        return new Jogador(saldo, nivel);
    }

    public static String determinarNivel(int saldo) {
        if (saldo >= 1 && saldo <= 10) {
            return "Ferro";
        } else if (saldo >= 11 && saldo <= 20) {
            return "Bronze";
        } else if (saldo >= 21 && saldo <= 50) {
            return "Prata";
        } else if (saldo >= 51 && saldo <= 80) {
            return "Ouro";
        } else if (saldo >= 81 && saldo <= 90) {
            return "Diamante";
        } else if (saldo >= 91 && saldo <= 100) {
            return "Lendário";
        } else if (saldo >= 101) {
            return "Imortal";
        }

        // Este return nunca será alcançado, mas é necessário para evitar o erro de compilação.
        return "";
    }
}
