

public class Ciudad {
        public String nombre;
        public int poblacion;
        public boolean estado;
        public double porcentajeInfeccion;
        public double porcentajeCuracion;
        
        public List<Vacuna> desarrollarVacuna(int vacunas) {
            // Lógica para desarrollar una cantidad determinada de vacunas
        }
        
        public List<Accion> accionesDisponibles() {
            // Lógica para obtener las acciones disponibles en la ciudad
        }
        
        public void infectar(double porcentaje) {
            // Lógica para infectar la ciudad con un porcentaje determinado
        }
        
        public void desinfectar() {
            // Lógica para desinfectar la ciudad
        }
    }
    
   