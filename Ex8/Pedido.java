public class Pedido {
    private Pizza pizza;
    private String tamanho;
    private double valor;
    private String enderecoEntrega;
    private boolean cancelado;

    public Pedido(Pizza pizza, String tamanho, double valor, String enderecoEntrega) {
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.valor = valor;
        this.enderecoEntrega = enderecoEntrega;
        this.cancelado = false;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void cancelarPedido() {
        this.cancelado = true;
    }
}
