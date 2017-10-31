package at.fhv.itb.sem5.team6.libman.server.application;

public interface IConvertable<Model, DTO> {
    Model convertDTO(DTO item);

    DTO convertModel(Model item);
}
