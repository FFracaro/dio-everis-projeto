package com.Fracaro.BO.veiculos;

public class Veiculo 
{
	private String placa;
	private String marca;
	private String modelo;
	private double fatorEstacionamento;
	private String horaEntrada;
	private String horaSaida;
	private double totalEstacionamento;
	private TipoVeiculo tipoVeiculo;
	
	public Veiculo() {}
	
	public Veiculo(String placa, String marca, String modelo, double fatorEstacionamento, String horaEntrada,
			String horaSaida, double totalEstacionamento) 
	{
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.fatorEstacionamento = fatorEstacionamento;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
		this.totalEstacionamento = totalEstacionamento;
	}

	public String getPlaca() 
	{
		return placa;
	}
	
	public void setPlaca(String placa) 
	{
		this.placa = placa;
	}
	
	public String getMarca() 
	{
		return marca;
	}
	
	public void setMarca(String marca) 
	{
		this.marca = marca;
	}
	
	public String getModelo() 
	{
		return modelo;
	}
	
	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}
	
	public double getFatorEstacionamento() 
	{
		return fatorEstacionamento;
	}
	
	public void setFatorEstacionamento(double fatorEstacionamento) 
	{
		this.fatorEstacionamento = fatorEstacionamento;
	}
	
	public String getHoraEntrada() 
	{
		return horaEntrada;
	}
	
	public void setHoraEntrada(String horaEntrada) 
	{
		this.horaEntrada = horaEntrada;
	}
	
	public String getHoraSaida() 
	{
		return horaSaida;
	}
	
	public void setHoraSaida(String horaSaida) 
	{
		this.horaSaida = horaSaida;
	}
	
	public double getTotalEstacionamento() 
	{
		return totalEstacionamento;
	}
	
	public void setTotalEstacionamento(double totalEstacionamento) 
	{
		this.totalEstacionamento = totalEstacionamento;
	}

	public TipoVeiculo getTipoVeiculo() 
	{
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) 
	{
		this.tipoVeiculo = tipoVeiculo;
	}
	
}
