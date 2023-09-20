package com.Collections.Modells;

public final class LinhaMovel extends LinhaTelefonica{

    private boolean planoHabilitado;

    public LinhaMovel(int qtdMinutosGastos, String numero, boolean planoHabilitado, Cliente cliente) {
        super(qtdMinutosGastos, numero, cliente);
        this.planoHabilitado = planoHabilitado;
    }

    @Override
    public float calcular() {
        return (float)(getQtdMinutosGastos() * 0.20);
    }
    private float calcular(int minutosExcedentes) {
        return 0;
    }

    @Override
    public String toString() {
        return "Linha Móvel - " + super.toString();
    }
}
