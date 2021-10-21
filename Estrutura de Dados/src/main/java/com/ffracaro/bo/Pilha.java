package com.ffracaro.bo;

public class Pilha
{
    private NoSimples topoDaPilha;

    public Pilha()
    {
        this.topoDaPilha = null;
    }

    public NoSimples top()
    {
        return topoDaPilha;
    }

    public void push(NoSimples novoNo)
    {
        NoSimples refAuxiliar = topoDaPilha;
        topoDaPilha = novoNo;
        novoNo.setProximoNo(refAuxiliar);
    }

    public NoSimples pop()
    {
        if(this.isEmpty())
            return null;

        NoSimples refAuxiliar = topoDaPilha;
        topoDaPilha = refAuxiliar.getProximoNo();
        return  refAuxiliar;
    }

    public boolean isEmpty()
    {
        return topoDaPilha == null ? true : false;
    }

    @Override
    public String toString()
    {
       String stringRetorno = "-----------------------\n";
       stringRetorno += "   Pilha\n";
       stringRetorno += "-----------------------\n";

       NoSimples noAuxiliar = topoDaPilha;

       while(true)
       {
           if(noAuxiliar != null)
           {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getProximoNo();
           }
           else
           {
               break;
           }
       }

       stringRetorno += "-----------------------\n";
       return stringRetorno;
    }
}
