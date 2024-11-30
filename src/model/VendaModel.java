package model;

import java.util.ArrayList;
import java.util.Scanner;

public class VendaModel {
    private int id;
    private String data;
    private String formaPagamento;
    private ClienteModel cliente;
    private ArrayList<ItemVenda> itens;
    public VendaModel() {
        id = 0;
        data = new String();
        formaPagamento = new String();
        cliente = new ClienteModel();
        itens = new ArrayList<>();

    }
    public VendaModel(int id, String data, String formaPagamento, ClienteModel cliente, ArrayList<ItemVenda> itens) {
        this.id = id;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.cliente = cliente;
        this.itens = itens;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public ClienteModel getCliente() {
        return cliente;
    }
    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }
    public ArrayList<ItemVenda> getItens() {
        return itens;
    }
    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }
    public void cadastrar(ArrayList<ClienteModel> listaClientes,
    ArrayList<ProdutoModel> listaProdutos){
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Digite o id: ");
            id = entrada.nextInt();
        } while (id<=0);
        do {
            System.out.println("Digite a data (dd/mm/aaaa): ");
            data = entrada.next();
        } while (data.length()!=10);
        do {
            System.out.println("--- Clientes cadastrados ---");
            for (ClienteModel c : listaClientes) {
                System.out.println(c.mostrar());
            }
            System.out.println("Digite o id do Cliente: ");
            int idCliente = entrada.nextInt();
            for (ClienteModel c: listaClientes) {
                if(c.getId()==idCliente)
                    this.cliente = c;
            }
        } while (cliente.getId()==0);
        int resp=0;
        do {
            //adicionar um item
            ItemVenda item = new ItemVenda();
            item.cadastrar(listaProdutos);
            itens.add(item);
            //perguntar se deseja adicionar outro
            System.out.println("Deseja adicionar mais um produto?"+
            "\n\t0 [Sim] ou [1] Não");
            resp = entrada.nextInt();
        } while (resp==0);
    }
}
