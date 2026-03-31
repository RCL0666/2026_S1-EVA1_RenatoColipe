package model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;


public class Solicitud {
    private int id;

    @NotBlank(message = "El nombre del paciente es obligatorio")
    private String Paciente;

    @NotBlank(message = "El especialidad es obligatoria")
    private String Especialidad;

    @NotBlank(message = "El estado es obligatorio")
    private String Estado; 

    @NotNull(message = "El fecha de registro es obligatoria")
    private LocalDate FechaRegistro;

    @NotBlank(message = "El Nivel de prioridad es obligatorio")
    private String NivelPrioridad; 

      public Solicitud(int id , String Paciente, String Especialidad, String Estado, LocalDate FechaRegistro, String NivelPrioridad) {
        this.id = id;
        this.Paciente = Paciente;
        this.Especialidad = Especialidad;
        this.Estado = Estado;
        this.FechaRegistro = FechaRegistro;
        this.NivelPrioridad = NivelPrioridad;
    } 
      //Getters y Setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getPaciente() {return Paciente;}
    public void setPaciente(String paciente) {this.Paciente = paciente;}

    public String getEspecialidad() {return Especialidad;}
    public void setEspecialidad(String especialidad) {this.Especialidad = especialidad;}

    public String getEstado() {return Estado;}
    public void setEstado(String estado) {this.Estado = estado;}

    public LocalDate getFechaRegistro() {return FechaRegistro;}
    public void setFechaRegistro(LocalDate fechaRegistro) {this.FechaRegistro = fechaRegistro;}

    public String getNivelPrioridad() {return NivelPrioridad;}
    public void setNivelPrioridad(String nivelPrioridad) {this.NivelPrioridad = nivelPrioridad;}

}
