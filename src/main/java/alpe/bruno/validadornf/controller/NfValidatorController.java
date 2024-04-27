package alpe.bruno.validadornf.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author brunoabneves
 */
@RestController
@RequestMapping("/validar")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class NfValidatorController {

    @GetMapping("/{chaveAcesso}")
    public ResponseEntity<String> validarNFPorChaveDeAcesso(@PathVariable("chaveAcesso") String chaveAcesso) {
        return ResponseEntity.ok("Nota fiscal validada com sucesso! " + chaveAcesso);
    }
}
