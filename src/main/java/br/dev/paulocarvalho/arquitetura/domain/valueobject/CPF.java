package br.dev.paulocarvalho.arquitetura.domain.valueobject;

import br.dev.paulocarvalho.arquitetura.domain.exception.InvalidCpfException;

public class CPF {
    private final String cpf;

    public CPF(String cpf) throws InvalidCpfException {
        String plainCpf = removeMask(cpf);
        doValidation(plainCpf);
        this.cpf = plainCpf;
    }

    private static void doValidation(String cpf) throws InvalidCpfException {
        if (!isValidCPF(cpf)) {
            throw new InvalidCpfException();
        }
    }

    public static boolean isValidCPF(String cpf) {
        if (cpf == null || !cpf.matches("\\d{11}")) {
            return false;
        }

        // Invalid CPF sequences like 00000000000, 11111111111, etc.
        if (cpf.chars().distinct().count() == 1) {
            return false;
        }

        try {
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                sum += (cpf.charAt(i) - '0') * (10 - i);
            }
            int firstCheckDigit = 11 - (sum % 11);
            if (firstCheckDigit >= 10) {
                firstCheckDigit = 0;
            }

            if (firstCheckDigit != (cpf.charAt(9) - '0')) {
                return false;
            }

            sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += (cpf.charAt(i) - '0') * (11 - i);
            }
            int secondCheckDigit = 11 - (sum % 11);
            if (secondCheckDigit >= 10) {
                secondCheckDigit = 0;
            }

            return secondCheckDigit == (cpf.charAt(10) - '0');
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String removeMask(String cpf) {
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        return cpf;
    }

    @Override
    public String toString() {
        return cpf;
    }
}
