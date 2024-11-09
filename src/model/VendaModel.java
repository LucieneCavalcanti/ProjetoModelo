package model;

import java.util.ArrayList;

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
    
}
