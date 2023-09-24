package jruizsilva.concesionaria.utils;

import java.security.SecureRandom;

import org.springframework.stereotype.Component;

@Component
public class PasswordGenerator {

  private final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-={}[]|;:,./<>?";

  public String generatePassword() {
    StringBuilder password = new StringBuilder();
    SecureRandom random = new SecureRandom();

    for (int i = 0; i < 8; i++) {
      int randomIndex = random.nextInt(CHARACTERS.length());
      char character = CHARACTERS.charAt(randomIndex);

      password.append(character);
    }

    return password.toString();
  }
}
