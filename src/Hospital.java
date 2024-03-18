class Hospital {
    private String nombre;
    private ArrayList<Medico> medicos;

    public Hospital(String nombre) {
        this.nombre = nombre;
        this.medicos = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void mostrarInformacion() {
        System.out.println("Hospital: " + nombre);
        System.out.println("Médicos:");
        for (Medico medico : medicos) {
            System.out.println("- " + medico.getNombre() + ", Especialidad: " + medico.getEspecialidad());
        }
    }
