package com.Fracaro.BO.veiculos;

public class Utilitario extends Veiculo
{
	private double peso;
	private double altura;
	private String empresa;
	
	public Utilitario() {}

	public Utilitario(double peso, double altura, String empresa) 
	{
		super();
		this.peso = peso;
		this.altura = altura;
		this.empresa = empresa;
	}

	public double getPeso() 
	{
		return peso;
	}

	public void setPeso(double peso) 
	{
		this.peso = peso;
	}

	public double getAltura() 
	{
		return altura;
	}

	public void setAltura(double altura) 
	{
		this.altura = altura;
	}

	public String getEmpresa() 
	{
		return empresa;
	}

	public void setEmpresa(String empresa) 
	{
		this.empresa = empresa;
	}
	
	
}
