package tr.havelsan.kovan.apigen.service;

import tr.havelsan.kovan.apigen.model.ApiModel;

import java.io.IOException;


public interface ApiGenService {

    void generate(ApiModel apiModel) throws IOException;
}
