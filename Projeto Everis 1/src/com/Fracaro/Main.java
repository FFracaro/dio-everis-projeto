package com.Fracaro;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.Fracaro.BO.veiculos.TesteTmpl;
import com.Fracaro.BO.veiculos.TipoVeiculo;
import com.Fracaro.BO.veiculos.Utilitario;
import com.Fracaro.BO.veiculos.Veiculo;



public class Main 
{
	public static void main(String[] args)
	{
		// String data = "01/10/2021 14:43";
		// LocalTime hr = LocalTime.of(Interger.valueOf(data.substring(11,13), data.substring(15,17)));
		
		
		Veiculo carro1 = new Veiculo();
		Veiculo carro2 = new Veiculo();
		Utilitario util = new Utilitario();
		
		carro1.setMarca("abcd");
		carro1.setTipoVeiculo(TipoVeiculo.CARRO);
		carro2.setMarca("EFGH");
		carro1.setTipoVeiculo(TipoVeiculo.MOTO);
		util.setMarca("UTIL");
		
		System.out.println(carro1.getMarca());
		System.out.println(carro2.getMarca());
		System.out.println(util.getMarca());
		
		List<Veiculo> veiculos = new ArrayList<>();
		
		veiculos.add(carro1);
		
		veiculos.forEach(v->System.out.println(v.getMarca()));
		
		TesteTmpl teste = new TesteTmpl();
		
		teste.teste();
		
		teste.teste("AAAA");
		
		/*
		util.marca = "Tcc";
		carro1.marca = "abc";
		carro2.marca = "cde";
		util.altura = 20;
		
		System.out.println(carro1.marca);
		System.out.println(carro2.marca);
		System.out.println(util.marca);
		
		System.out.println(carro1);
		System.out.println(carro2);
		
		carro1 = carro2
		
		System.out.println(carro1);
		System.out.println(carro2);

		*/
		
		
		
	}
}
