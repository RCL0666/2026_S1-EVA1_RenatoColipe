package cl.duoc.renatocolipe.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;                     
import org.springframework.web.bind.annotation.*;

import cl.duoc.renatocolipe.model.Solicitud;
import cl.duoc.renatocolipe.services.SolicitudService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/solicitudes")
public class SolicitudController {
  @Autowired
   private SolicitudService solicitudService;

    @GetMapping
    public ResponseEntity<List<Solicitud>> ListarSolicitudes() {
        return ResponseEntity.ok(solicitudService.ListarSolicitudes());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Solicitud> obtenerSolicitud(@PathVariable int id) {
        return solicitudService.obternerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<String> registrar(@Valid @RequestBody Solicitud solicitud) {
        solicitudService.registrarSolicitud(solicitud);
        return ResponseEntity.ok("Solicitud registrada exitosamente");
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> actualizar(@PathVariable int id, @Valid @RequestBody Solicitud solicitud) {
        solicitud.setId(id);
        solicitudService.actualizarSolicitud(solicitud);
        return ResponseEntity.ok("Solicitud actualizada exitosamente");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable int id) {
        solicitudService.eliminarSolicitud(id);
        return ResponseEntity.ok("Solicitud eliminada exitosamente");
    }
    @GetMapping("/prioridad/{nivel}")
    public ResponseEntity<List<Solicitud>> filtrarSolicitudesPorPrioridad(@PathVariable String nivel) {
        return ResponseEntity.ok(solicitudService.filtrarPorPrioridad(nivel));
    }
  }
