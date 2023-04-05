package br.com.newtonpaiva.listasLP;

import java.util.ArrayList;
import java.util.List;

public class Banco
{
    public static void main(String[]args)
    {
        ContaCorrente c1 = new ContaCorrente();
        c1.deposita(100);

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Rogério Senni";
        c1.numero = 123;
        c1.setCliente(cliente1);

        ContaCorrente c2 = new ContaCorrente();
        c2.deposita(200);

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Ayrton Senna";
        c2.numero = 321;
        c2.setCliente(cliente2);

        List contas = new ArrayList();
        contas.add(c1);
        contas.add(c2);

        for(int i=0; i< contas.size(); i++)
        {
            ContaCorrente cc = (ContaCorrente) contas.get(i);
            System.out.println("A conta " + cc.numero +" do cliente " +
                    cc.getCliente().nome+" possui saldo: " + cc.getSaldo());
        }
    }
}
