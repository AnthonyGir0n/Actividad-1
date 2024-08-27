package Vista;

import modelo.Persona;

/**
 *
 * @author Anthony Giron
 */
public class Empleado extends Persona {
    private String nit;

    // Constructor principal
    public Empleado(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha) {
        super(nombres, apellidos, direccion, telefono, fecha);
        this.nit = nit;
    }

    // Constructor vacío o con parámetros predeterminados si es necesario
    public Empleado() {
        super("", "", "", "", "");
        this.nit = "";
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    protected String[] crear() {
        try {
            String datos[] = new String[6];
            datos[0] = this.getNit(); // Usar el método getNit() en lugar de getNit1()
            datos[1] = this.getNombres(); // Usar el método getNombres() en lugar de getNombres1()
            datos[2] = this.getApellidos(); // Usar el método getApellidos() en lugar de getApellidos1()
            datos[3] = this.getDireccion(); // Usar el método getDireccion() en lugar de getDireccion1()
            datos[4] = this.getTelefono(); // Usar el método getTelefono() en lugar de getTelefono1()
            datos[5] = this.getFecha(); // Usar el método getFecha() en lugar de getFecha1()
            return datos;
        } catch (Exception ex) {
            System.out.println("Hay un problema: " + ex.getMessage());
            return null;
        }
    }
}
