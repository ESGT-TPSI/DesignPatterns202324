package Adapter;



public class AdaptadorCirculoParaRetangulo implements Retangulo {
	 private Circulo circulo;

	 public AdaptadorCirculoParaRetangulo(Circulo circulo) {
	     this.circulo = circulo;
	 }

	 public void desenhar(int x, int y, int largura, int altura) {
	     int raio = Math.min(largura, altura) / 2;
	     circulo.desenhar(x + largura / 2, y + altura / 2, raio);
	 }
	}