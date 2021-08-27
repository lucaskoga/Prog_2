import java.util.ArrayList;
import java.util.Collections;

public class Principal {

    public static void main(String[] args) {

        Produto pro1 = new ProdutoUnitario(421,"feijao",7.50,50);
        Produto pro2 = new ProdutoUnitario(564,"Carne",29.90,70);
        Produto pro3 = new ProdutoFacionado(5421,"Cebola",4.30,23.5);
        Produto pro4 = new ProdutoFacionado(5252,"Tomate",2.50,14.6);

        ArrayList<Produto> lista;
        lista = new ArrayList<>();

        System.out.println("*----*----*");

        lista.add(pro1);
        lista.add(pro2);
        lista.add(pro3);
        lista.add(pro4);

        Collections.sort(lista);

        for (Produto aux : lista){
            System.out.println(aux.toString());
        }
        System.out.println("*------*-----*");

        double valorTotal = 0;
        for (Produto aux : lista){
            valorTotal = valorTotal + aux.calcularValorEmEstoque();
        }
        System.out.println("Valor Total dos Produtos a Venda: "+valorTotal);
    }
}
