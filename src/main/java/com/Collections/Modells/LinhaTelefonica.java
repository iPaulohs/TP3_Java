package com.Collections.Modells;

import com.Collections.Interfaces.IConsumo;

public abstract class LinhaTelefonica implements IConsumo {

    private final Cliente cliente;
    private int qtdMinutosGastos;
    private final String numero;

    public LinhaTelefonica(int qtdMinutosGastos, String numero, Cliente cliente) {
        this.qtdMinutosGastos = qtdMinutosGastos;
        this.numero = numero;
        this.cliente = cliente;
    }


    public int getQtdMinutosGastos() {
        return qtdMinutosGastos;
    }

    public void addMinutosGastos(int qtdMinutosGastos) throws Exception {
        if (qtdMinutosGastos > 0)
            this.qtdMinutosGastos += qtdMinutosGastos;
        else
            throw new IllegalArgumentException("O valor de minutos gastos deve ser maior do que 0");
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Número: " + numero + ", Minutos Gastos: " + qtdMinutosGastos + ", Cliente: " + cliente.toString();
    }
}
