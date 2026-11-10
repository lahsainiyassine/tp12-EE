package ma.ens.security.web;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/api/user/profile")
    public Map<String, Object> userProfile(Authentication authentication) {
        return Map.of(
                "message", "Donnees du profil utilisateur recuperees avec succes",
                "username", authentication.getName(),
                "authorities", authentication.getAuthorities()
        );
    }

    @GetMapping("/api/admin/data")
    public Map<String, Object> adminData(Authentication authentication) {
        return Map.of(
                "message", "Donnees securisees reservees a l'administrateur",
                "username", authentication.getName(),
                "authorities", authentication.getAuthorities()
        );
    }
}
