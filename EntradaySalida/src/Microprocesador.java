import javax.swing.JOptionPane;

public class Microprocesador extends Dispositivos
{
	Dispositivos bus = new Dispositivos();
	
	public void correrPrograma() {
		JOptionPane.showMessageDialog(null,"Ejecutando programa","Procesador",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void mandarRead() {
		JOptionPane.showMessageDialog(null,"Mandando orden de READ","Procesador",JOptionPane.PLAIN_MESSAGE);
		bus.recibirRead();
	}
	
	public void guardarDatos() {
		JOptionPane.showMessageDialog(null,"Guardando contador de programa y registros","Procesador",JOptionPane.PLAIN_MESSAGE);
		bus.solicitud();
	}
	
	public void lecturaDatos() {
		JOptionPane.showMessageDialog(null,"Leyendo la palabra y almacenando en memoria","Procesador",JOptionPane.PLAIN_MESSAGE);
		bus.situando();
	}
	
	public void seguirPrograma() {
		JOptionPane.showMessageDialog(null,"Ejecutando programa","Procesador",JOptionPane.PLAIN_MESSAGE);
		bus.espera();	
	}
	
	public void usoBus() {
		JOptionPane.showMessageDialog(null,"Utilizando bus","Procesador",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"Se insert� un dispositivo: ","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
		bus.solicitudBusRc();	
	}
	
	public void aceptacion() {
		JOptionPane.showMessageDialog(null,"Se�al de aceptaci�n de petici�n de bus (BACK)","Procesador",JOptionPane.PLAIN_MESSAGE);
		bus.accesoMemoria();
		bus.desactivandoBus();
	}
	
	public void desactivaci�n() {
		JOptionPane.showMessageDialog(null,"Desactivando la concesi�n de ciclo (BACK)","Procesador",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void ejecutarInstrucciones() {
		bus.mandarInstrucciones();
		JOptionPane.showMessageDialog(null,"Ejecutando instrucciones","Procesador",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void solicitudDMA() {
		JOptionPane.showMessageDialog(null,"Esperando solicitud del DMA","Procesador",JOptionPane.PLAIN_MESSAGE);
		bus.transmitirDMA();
	}
	
	public void renunciaBus() {
		JOptionPane.showMessageDialog(null,"Renunciando a los buses de datos y direcciones","Procesador",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"Activando l�nea de reconomiento de DMA","Procesador",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void siguiendoPrograma() {
		bus.transferenciaDMA();
		JOptionPane.showMessageDialog(null,"Ejecutando programa","Procesador",JOptionPane.PLAIN_MESSAGE);	
	}
	
	public void solicitudRABus() {
		JOptionPane.showMessageDialog(null,"Esperando solicitud del procesador del DMAC","Procesador",JOptionPane.PLAIN_MESSAGE);
	}
        
    public void transferenciaBloques(){
    	JOptionPane.showMessageDialog(null,"Iniciando Tranferencia de bloque de datos","Procesador",JOptionPane.PLAIN_MESSAGE);
        bus.datos();
        JOptionPane.showMessageDialog(null,"Tranferencia de bloque de datos exitosa","Procesador",JOptionPane.PLAIN_MESSAGE);
    }
       
    public void libertad(){
    	JOptionPane.showMessageDialog(null,"Liberando Bus...","DMAC",JOptionPane.PLAIN_MESSAGE);
        bus.liberacion();
    }
}
