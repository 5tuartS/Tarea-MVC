import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Panel2 extends JPanel {
    private DefaultTableModel modelo = new DefaultTableModel();
    private JTable tabla;

    public Panel2() {
        modelo.addColumn("Descripción");
        modelo.addColumn("Correo electrónico");
        modelo.addColumn("Fecha");
        modelo.addColumn("Frecuencia");
        modelo.addColumn("Alarma");

        tabla = new JTable(modelo);
        JScrollPane panelDesplazamiento = new JScrollPane(tabla);
        add(panelDesplazamiento);
    }

    public void addEvent(Object[] eventInfo) {
        modelo.addRow(eventInfo);
    }
}