public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Hospital General");

        // Agregar médicos al hospital
        hospital.agregarMedico(new Medico("Dr. Juan", "Cirujano"));
        hospital.agregarMedico(new Medico("Dra. Maria", "Pediatra"));

        // Mostrar información del hospital y sus médicos
        hospital.mostrarInformacion();
    }
}
