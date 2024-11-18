public class aventuraDoJoao {
    public static void main(String[] args) {
        String caminhoEsquerdo = "obstaculo"; // Modifique para testar diferentes cenários

        if (caminhoEsquerdo.equals("obstaculo")) {
            // Se o caminho da esquerda tiver um obstáculo, João vai tentar o caminho da direita.
            seguirCaminhoDireito();
        } else if (caminhoEsquerdo.equals("ponteQuebrada")) {
            // Se o caminho da esquerda tiver uma ponte quebrada, João vai procurar outro caminho.
            procurarOutroCaminho();
        } else {
            // Se não tiver obstáculo nem ponte quebrada no caminho da esquerda, João seguirá por esse caminho.
            seguirCaminhoEsquerdo();
        }
    }

    public static void seguirCaminhoDireito() {
        System.out.println("João está seguindo pelo caminho da direita.");
    }

    public static void procurarOutroCaminho() {
        System.out.println("João está procurando outro caminho.");
    }

    public static void seguirCaminhoEsquerdo() {
        System.out.println("João está seguindo pelo caminho da esquerda.");
    }
}
