using System;

class AventuraDoJoao
{
    static void Main(string[] args)
    {
        string caminhoEsquerdo = "obstaculo"; // Modifique para testar diferentes cenários

        if (caminhoEsquerdo == "obstaculo")
        {
            SeguirCaminhoDireito();
        }
        else if (caminhoEsquerdo == "ponteQuebrada")
        {
            ProcurarOutroCaminho();
        }
        else
        {
            SeguirCaminhoEsquerdo();
        }
    }

    static void SeguirCaminhoDireito()
    {
        Console.WriteLine("João está seguindo pelo caminho da direita.");
    }

    static void ProcurarOutroCaminho()
    {
        Console.WriteLine("João está procurando outro caminho.");
    }

    static void SeguirCaminhoEsquerdo()
    {
        Console.WriteLine("João está seguindo pelo caminho da esquerda.");
    }
}
