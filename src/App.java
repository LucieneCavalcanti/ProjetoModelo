import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.CategoriaModel;
import model.ClienteModel;
import model.LoteModel;
import model.ProdutoModel;
import model.VendaModel;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<ClienteModel> listaClientes = new ArrayList<>();
        ArrayList<CategoriaModel> listaCategorias = new ArrayList<>();
        ArrayList<ProdutoModel> listaProdutos = new ArrayList<>();
        ArrayList<LoteModel> listaLotes = new ArrayList<>();
        ArrayList<VendaModel> listaVendas = new ArrayList<>();
        //pré-cadastros
        ClienteModel c1 = new ClienteModel(1, "Maria", "12312313");
        ClienteModel c2 = new ClienteModel();
        c2.setId(2);
        c2.setNome("João");
        c2.setCpf("333333");
        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(new ClienteModel(3, "Pedro", "1444444"));
        for (int i = 4; i < 10; i++) {
            listaClientes.add(new ClienteModel(i, "Cliente "+i, "25"+(i*2) + "58"));
        }
        // for (ClienteModel clienteModel : listaClientes) {
        //     System.out.println(clienteModel.mostrar());
        // }
        for (int i = 1; i <= 15; i++) {
            listaCategorias.add(new CategoriaModel(i, "Categoria "+i));
        }
        Random r = new Random();
        for (int i = 1; i <= 10; i++) {
            listaProdutos.add(new ProdutoModel(i, "Produto "+i,
            r.nextInt(), r.nextFloat()*100, listaCategorias.get(i)));
        }


        for (int i = 15255; i <= 15275; i++) {
            listaLotes.add(new LoteModel(i, (int)Math.floor(Math.random()*30)+"/"+
            (int)Math.floor(Math.random()*12) + "/" +
            (int)Math.floor(Math.random()*2030), 
            listaProdutos.get((int)Math.floor(Math.random()*9)+1)));
        }
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("\n\n---MENU---");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Categoria");
            System.out.println("3 - Cadastrar Produto");
            System.out.println("4 - Cadastrar Lote");
            System.out.println("5 - Cadastrar Venda");
            System.out.println("11 - Listar Cliente");
            System.out.println("12 - Listar Categoria");
            System.out.println("13 - Listar Produto");
            System.out.println("14 - Listar Lote");
            System.out.println("15 - Listar Venda");
            System.out.println("100 - SAIR");
            System.out.println("Digite uma opção:");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    ClienteModel cliente = new ClienteModel();
                    cliente.cadastrar();
                    listaClientes.add(cliente);
                    break;
                case 2:
                    CategoriaModel categoria = new CategoriaModel();
                    categoria.cadastrar();
                    listaCategorias.add(categoria);
                    break;
                case 3:
                    ProdutoModel produto = new ProdutoModel();
                    produto.cadastrar(listaCategorias);
                    listaProdutos.add(produto);
                    break;
                case 4:
                    
                    break;            
                case 5:
                    
                    break;
                case 11:
                    System.out.println("#####################  LISTAGEM ################");
                    for (ClienteModel c : listaClientes) {
                        System.out.println("-------------------------------");
                        System.out.println(c.mostrar());
                    }
                    break;
                case 12:
                    System.out.println("#####################  LISTAGEM ################");
                    for (CategoriaModel c : listaCategorias) {
                        System.out.println("-------------------------------");
                        System.out.println(c.mostrar());
                    }                    
                    break;
                case 13:
                    System.out.println("#####################  LISTAGEM ################");
                    for (ProdutoModel p : listaProdutos) {
                        System.out.println("-------------------------------");
                        System.out.println(p.mostrar());
                        
                    }
                    break;
                case 14:
                    System.out.println("#####################  LISTAGEM ################");
                    for (LoteModel l : listaLotes) {
                        System.out.println("-------------------------------");
                        System.out.println(l.mostrar());
                        
                    }                    
                    break;            
                case 15:
                    
                    break;

                default:
                    break;
            }
        }while(opcao!=100);
    }
}
