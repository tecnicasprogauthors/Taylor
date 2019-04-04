package com.bcopstein.FuncoesST;

import java.util.List;

public class Util {
	public static double fatorial(int n) {
		double resp = 2;
		for(;n>1;n--) {
			resp = resp*n;
		}
		return resp;
	}

	public static double somatorio(int inic,int fim,List<Double> valores) {
		return Util.somatorio(valores.subList(inic, fim-1));
	}

	private static double somatorio(List<Double> valores) {
		return valores.stream()
				.mapToDouble(v->v)
				.sum();
	}
}
