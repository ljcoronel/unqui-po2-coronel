package ar.edu.unq.po2.tp11;

import java.util.ArrayList;
import java.util.List;

public class ParcelaMixta extends Parcela {
	
	private List<Parcela> parcelas;
	
	public ParcelaMixta(Parcela parcelaUno, Parcela parcelaDos, Parcela parcelaTres, Parcela parcelaCuatro) {
		super();
		this.parcelas=new ArrayList<Parcela>();
		this.parcelas.add(parcelaUno);
		this.parcelas.add(parcelaDos);
		this.parcelas.add(parcelaTres);
		this.parcelas.add(parcelaCuatro);
	}
	
	public Parcela getParcela(int i) {
		return this.parcelas.get(i);
	}

	@Override
	public int gananciaAnual() {
		int ganancia = this.parcelas.stream()
				.mapToInt(parcela -> parcela.gananciaAnual())
				.sum();
		return ganancia;
	}

}
