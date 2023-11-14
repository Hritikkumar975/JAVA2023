// Encryptable interface
interface Encryptable {
    String encrypt(String data);
    String decrypt(String encryptedData);
}

// AES class implementing Encryptable interface
class AES implements Encryptable {
    @Override
    public String encrypt(String data) {
        // Implement AES encryption algorithm
        // This is a placeholder, actual implementation would use AES encryption logic
        return "AES-Encrypted:" + data;
    }

    @Override
    public String decrypt(String encryptedData) {
        // Implement AES decryption algorithm
        // This is a placeholder, actual implementation would use AES decryption logic
        if (encryptedData.startsWith("AES-Encrypted:")) {
            return encryptedData.substring("AES-Encrypted:".length());
        } else {
            return "Invalid AES-encrypted data";
        }
    }
}

// RSA class implementing Encryptable interface
class RSA implements Encryptable {
    @Override
    public String encrypt(String data) {
        // Implement RSA encryption algorithm
        // This is a placeholder, actual implementation would use RSA encryption logic
        return "RSA-Encrypted:" + data;
    }

    @Override
    public String decrypt(String encryptedData) {
        // Implement RSA decryption algorithm
        // This is a placeholder, actual implementation would use RSA decryption logic
        if (encryptedData.startsWith("RSA-Encrypted:")) {
            return encryptedData.substring("RSA-Encrypted:".length());
        } else {
            return "Invalid RSA-encrypted data";
        }
    }
}

public class EncryptionExample {
    public static void main(String[] args) {
        // Example usage
        Encryptable aesEncryptor = new AES();
        String aesEncrypted = aesEncryptor.encrypt("Hello, AES!");
        System.out.println("AES Encrypted: " + aesEncrypted);
        String aesDecrypted = aesEncryptor.decrypt(aesEncrypted);
        System.out.println("AES Decrypted: " + aesDecrypted);

        Encryptable rsaEncryptor = new RSA();
        String rsaEncrypted = rsaEncryptor.encrypt("Hello, RSA!");
        System.out.println("RSA Encrypted: " + rsaEncrypted);
        String rsaDecrypted = rsaEncryptor.decrypt(rsaEncrypted);
        System.out.println("RSA Decrypted: " + rsaDecrypted);
    }
}
