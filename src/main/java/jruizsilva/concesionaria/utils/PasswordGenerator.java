package jruizsilva.concesionaria.utils;

import java.security.SecureRandom;

public class PasswordGenerator {

  private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-={}[]|;:,./<>?";

  public static String generatePassword() {
    StringBuilder password = new StringBuilder();
    SecureRandom random = new SecureRandom();

    for (int i = 0; i < 16; i++) {
      int randomIndex = random.nextInt(CHARACTERS.length());
      char character = CHARACTERS.charAt(randomIndex);

      password.append(character);
    }

    return password.toString();
  }
}
