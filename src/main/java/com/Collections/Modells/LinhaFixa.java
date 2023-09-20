package com.Collections.Modells;

import com.Collections.Interfaces.IConsumo;

public class LinhaFixa extends LinhaTelefonica implements IConsumo {

    public LinhaFixa(int qtdMinutosGastos, String numero, Cliente cliente) {
        super(qtdMinutosGastos, numero, cliente);
    }

    @Override
    public float calcular() {
        return 0;
    }

    public float calcular(int minutosExcedentes) {
        float minutosEx = 0;
        if(minutosExcedentes > 30){
            minutosEx = minutosExcedentes * 0.20f;
        }
        return minutosEx;
    }

    @Override
    public String toString() {
        return "Linha Fixa - " + super.toString();
    }
}
