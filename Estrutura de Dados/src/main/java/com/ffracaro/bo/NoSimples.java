package com.ffracaro.bo;

public class NoSimples
{
    private int dado;
    private NoSimples proximoNo;

    public NoSimples() {}

    public NoSimples(int dado)
    {
        this.dado = dado;
    }

    public int getDado()
    {
        return dado;
    }

    public void setDado(int dado)
    {
        this.dado = dado;
    }

    public NoSimples getProximoNo()
    {
        return proximoNo;
    }

    public void setProximoNo(NoSimples proximoNo)
    {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString()
    {
        return "NoSimples{" +
                "dado=" + dado +
                '}';
    }
}
