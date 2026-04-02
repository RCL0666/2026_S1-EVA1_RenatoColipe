package cl.duoc.renatocolipe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.renatocolipe.model.Solicitud;
import cl.duoc.renatocolipe.repository.SolicitudRepository;


import java.util.List;
import java.util.Optional;



@Service
public class SolicitudService {

    @Autowired
    private SolicitudRepository solicitudRepository;

    public List<Solicitud> ListarSolicitudes() {
        return solicitudRepository.obtenerTodas();
    }
    public void registrarSolicitud(Solicitud solicitud) {
        solicitudRepository.guardar(solicitud);
    }
    public Optional<Solicitud> obternerPorId(int id) {
        return solicitudRepository.buscarPorId(id);
    }
    public void actualizarSolicitud(Solicitud solicitud) {
        solicitudRepository.actualizar(solicitud);
    }
    public void eliminarSolicitud(int id) {
        solicitudRepository.eliminar(id);
    }
    public List<Solicitud> filtrarPorPrioridad(String prioridad) {
        return solicitudRepository.filtrarPorPrioridad(prioridad);
    }
}



