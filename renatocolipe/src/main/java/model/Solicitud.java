package cl.duoc.renatocolipe.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;


public class Solicitud {
    private int id;

    @NotBlank(message = "El nombre del paciente es obligatorio")
    private String paciente;

    @NotBlank(message = "El especialidad es obligatoria")
    private String especialidad;

    @NotBlank(message = "El estado es obligatorio")
    private String estado; 

    @NotNull(message = "El fecha de registro es obligatoria")
    private LocalDate fechaRegistro;

    @NotBlank(message = "El Nivel de prioridad es obligatorio")
    private String nivelPrioridad; 

      public Solicitud(int id , String Paciente, String Especialidad, String Estado, LocalDate FechaRegistro, String NivelPrioridad) {
        this.id = id;
        this.paciente = Paciente;
        this.especialidad = Especialidad;
        this.estado = Estado;
        this.FechaRegistro = FechaRegistro;
        this.NivelPrioridad = NivelPrioridad;
    } 
      //Getters y Setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getPaciente() {return paciente;}
    public void setPaciente(String paciente) {this.paciente = paciente;}

    public String getEspecialidad() {return especialidad;}
    public void setEspecialidad(String especialidad) {this.especialidad = especialidad;}

    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}

    public LocalDate getFechaRegistro() {return fechaRegistro;}
    public void setFechaRegistro(LocalDate fechaRegistro) {this.fechaRegistro = fechaRegistro;}

    public String getNivelPrioridad() {return NivelPrioridad;}
    public void setNivelPrioridad(String nivelPrioridad) {this.nivelPrioridad = nivelPrioridad;}

}
