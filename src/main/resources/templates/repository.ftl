package ${apiModel.servicePackage}.${apiModel.apiPackage}.repository;

import org.springframework.stereotype.Repository;
import tr.com.havelsan.javarch.data.jpa.repository.HvlJpaRepository;
import ${apiModel.servicePackage}.${apiModel.apiPackage}.entity.${apiModel.apiName}Entity;

<#assign extendsBy = "HvlJpaRepository<${apiModel.apiName}Entity>">

@Repository
public interface ${apiModel.apiName}Repository extends ${extendsBy} {

}
