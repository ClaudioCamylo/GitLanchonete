package br.com.dabackaofront.lanchonete;
import br.com.dobackaofront.lanchonete.controller.Banco;
import java.sql.Connection;
import java.sql.SQLException;
import br.com.dobackaofront.lanchonete.model.Lanche;
/**
 *
 * @author claudio.martins
 */
public class Lanchonete {

    public static void main(String[] args) {
        Banco b = new Banco();
        Connection conexao = b.conectar();
        
        Lanche l = new Lanche ("Café Expresso", 5.90);
        
        if(conexao != null) {
            try {
                b.salvar (l, conexao);
                conexao.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão com o Banco de Dados!");
            }
            
        }
    }
}
