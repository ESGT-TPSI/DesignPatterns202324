package Singleton;

public class Configuration {
    private static Configuration instance;
    
    private String tipoPagamento;
    
    // Construtor privado para evitar instanciação direta
    public Configuration() {}
    
    // Método público para obter a instância única da classe
    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }
    
    // Métodos da classe
    public void setTipoPagamento(String tipoPagamento) {
        this.getInstance().tipoPagamento = tipoPagamento;
    }
    
    public String getTipoPagamento() {
        return  this.getInstance().tipoPagamento;
    }
}
