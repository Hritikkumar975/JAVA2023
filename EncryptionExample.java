// Write a Java program to create an interface Encryptable with methods encrypt (String data) and decrypt (String encryptedData) that define encryption and decryption operations. Create two classes AES and RSA that implement the Encryptable interface and provide their own encryption and decryption algorithms.
interface Encryptable {
    String encrypt(String data);
    String decrypt(String encryptedData);
}

// AES class implementing Encryptable interface
class AES implements Encryptable {
    @Override
    public String encrypt(String data) {
        // Implement AES encryption algorithm here for data
        // For demonstration purposes, let's say it simply adds a prefix "AES-" to the data
        return "AES-" + data;
    }

    @Override
    public String decrypt(String encryptedData) {
        // Implement AES decryption algorithm here for encryptedData
        // For demonstration purposes, let's remove the "AES-" prefix
        if (encryptedData.startsWith("AES-")) {
            return encryptedData.substring(4);
        } else {
            return "Invalid AES encrypted data";
        }
    }
}

// RSA class implementing Encryptable interface
class RSA implements Encryptable {
    @Override
    public String encrypt(String data) {
        // Implement RSA encryption algorithm here for data
        // For demonstration purposes, let's say it adds a suffix "-RSA" to the data
        return data + "-RSA";
    }

    @Override
    public String decrypt(String encryptedData) {
        // Implement RSA decryption algorithm here for encryptedData
        // For demonstration purposes, let's remove the "-RSA" suffix
        if (encryptedData.endsWith("-RSA")) {
            return encryptedData.substring(0, encryptedData.length() - 4);
        } else {
            return "Invalid RSA encrypted data";
        }
    }
}

public class EncryptionExample {
    public static void main(String[] args) {
        // Example usage of AES encryption and decryption
        AES aes = new AES();
        String aesData = "Sensitive information";
        String encryptedAESData = aes.encrypt(aesData);
        System.out.println("AES Encrypted: " + encryptedAESData);
        String decryptedAESData = aes.decrypt(encryptedAESData);
        System.out.println("AES Decrypted: " + decryptedAESData);

        // Example usage of RSA encryption and decryption
        RSA rsa = new RSA();
        String rsaData = "Confidential data";
        String encryptedRSAData = rsa.encrypt(rsaData);
        System.out.println("RSA Encrypted: " + encryptedRSAData);
        String decryptedRSAData = rsa.decrypt(encryptedRSAData);
        System.out.println("RSA Decrypted: " + decryptedRSAData);
    }
}
