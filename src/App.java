import java.util.ArrayList;
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
                    
                    break;            
                case 15:
                    
                    break;

                default:
                    break;
            }
        }while(opcao!=100);
    }
}
