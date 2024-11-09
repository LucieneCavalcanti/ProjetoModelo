import java.util.ArrayList;

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
        System.out.println("---MENU---");
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
    }
}
