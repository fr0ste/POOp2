/**************
 * 
 * Autor: Joel Francisco Figueroa Martinez
 * 
 * 
 * Fecha de creacion: 05/04/2022
 * 
 * 
 * Fecha de modificacion:
 * 
 * 
 * Descripcion: conversion de pesos a dolares y viceversa 
 * 
 * 
 */

package ejercicio2;

public class Convercion {

	double pesos, dolares;

	public double convertirPesos(double cantidad) {

		return (cantidad * 0.05);

	}

	public double convertirDolares(double cantidad) {

		return cantidad * 20;

	}

	// getters &setters
	public double getPesos() {
		return pesos;
	}

	public void setPesos(double pesos) {
		this.pesos = pesos;
	}

	public double getDolares() {
		return dolares;
	}

	public void setDolares(double dolares) {
		this.dolares = dolares;
	}

}
