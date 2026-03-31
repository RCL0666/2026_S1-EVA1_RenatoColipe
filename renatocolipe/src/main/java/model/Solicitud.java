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

}
