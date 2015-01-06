package programa.metodos;


import javax.swing.JOptionPane; //Importamos la clase JOptionPane

public class demo {
    // campos de la clase
    String nombre;

    //constructor
    public demo() {
        pideNombre();
        muestraSaludo();
    }

    //metodos
    private void pideNombre() {
        nombre = JOptionPane.showInputDialog(null, "Escribe tu nombre");//Pide el nombre
    }

    private void muestraSaludo() {

        while (nombre == null) {
            nombre = JOptionPane.showInputDialog(null, "Debes escribir tu nombre");
        }
        JOptionPane.showMessageDialog(null, "Hola " + nombre);//Saluda en pantalla
    }
}

